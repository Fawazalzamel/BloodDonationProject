package com.example.blooddonationsfrontend.viewmodel


import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.blooddonationsfrontend.data.AccountPage
import com.example.blooddonationsfrontend.data.DonationRequest
import com.example.blooddonationsfrontend.data.SigninRequest
import com.example.blooddonationsfrontend.data.UpdateDonationRequest

//import com.example.blooddonationsfrontend.data.User


import com.example.blooddonationsfrontend.data.model.User
import com.example.blooddonationsfrontend.data.response.TokenResponse
import com.example.blooddonationsfrontend.network.DonationApiServices
import com.example.blooddonationsfrontend.network.RetrofitHelper
import kotlinx.coroutines.launch

class DonationViewModel : ViewModel() {
    private val apiService = RetrofitHelper.getInstance().create(DonationApiServices::class.java)
    var myToken: TokenResponse? by mutableStateOf(null)
    var user: User? by mutableStateOf(null)
    var donationList by mutableStateOf(listOf<DonationRequest>())
    var context: Context? = null


    init {
        getAllDonations()
    }

    fun signup(
        username: String,
        password: String,
        fullName: String,
        email: String,
        phoneNumber: String,
        bloodType: String,
        civilId: String,
        age: Int,
        gender: String,
    ) {
        viewModelScope.launch {
            try {
                val response = apiService.signup(
                    User(
                        username, password, fullName, email,
                        phoneNumber, bloodType, civilId, age, gender, null
                    )
                )
                println("Profile created $response")
            } catch (e: Exception) {
                println("Error ${e.message} ${e.cause}")
            }

        }
    }

    fun signin(username: String, password: String, nav: () -> Unit = {}) {
        viewModelScope.launch {
            try {
                val response = apiService.signin(
                    SigninRequest(
                        username, password
                    )
                )
                myToken = response.body()
                println("Token ${myToken?.token}")
            } catch (e: Exception) {
                println("Error $e")
            } finally {
                if (myToken != null) {
                    saveToken()
//                    getAccount(username,
//                        password,
//                        email,
//                        phoneNumber)
                    nav()
                }
            }

        }
    }


    fun requestDonation(
        fileNumber: String,
        bloodTypes: String,
        donationTypes: String
    ) {
        fun donationRequest(donationRequest: DonationRequest) {

            viewModelScope.launch {
                try {
                    val response = apiService.donationRequest(
                        //  token = myToken?.getBearerToken(),
                        donationRequest = DonationRequest(
                            null,
                            fileNumber,
                            bloodTypes,
                            donationTypes,
                            null
                        )
                    )
                    println("Request created $response")

                } catch (e: Exception) {
                    println("Error $e")

                }
            }
        }
    }


    fun updateAccountPage(
        username: String,
        password: String,
        email: String,
        phoneNumber: String,
        //nav: () -> Unit
    ) {
        viewModelScope.launch {
            try {
                val response = apiService.updateAccount(
                    token = myToken?.getBearerToken(),
                    accountPage = AccountPage(
                        username, password, email, phoneNumber
                    )
                )
                println("Profile updated $response")
            } catch (e: Exception) {
                println("Error $e")
            } finally {
                getAccount(
                    username,
                    password,
                    email,
                    phoneNumber
                )
                //nav()
            }


        }
    }

    //////////////////////////////DO IT /////////////////
    fun getAllDonations() {
        viewModelScope.launch {
            try {
//                val response = apiService.getDonations(
//                    token = myToken?.getBearerToken(),
//                    donationsList
//                )
                var response = apiService.getDonations()

//                donationsList = response
                donationList = response
                print("Printing DONTATION LIST")
                print(donationList)
            } catch (e: Exception) {

            }
        }
    }
///////////////////////


    //statusUpdate logic

    fun statusUpdate(id: String) {
        viewModelScope.launch {
            try {
                val response = apiService.statusUpdate(
                    token = myToken?.getBearerToken(),
                    UpdateDonationRequest(id)
                )
                println("Status updated $response")
            } catch (e: Exception) {
                println("Error $e")
            }

        }
    }

    // not working
    fun getAccount(
        username: String,
        password: String,
        email: String,
        phoneNumber: String
    ) {//profile page
        viewModelScope.launch {
            try {
                val response = apiService.getAccount(
                    token = myToken?.getBearerToken(),
                    AccountPage(
                        username,
                        password,
                        email,
                        phoneNumber
                    )
                )
                user = response.body()
                println("My profile $response")
            } catch (e: Exception) {
                println("Error $e")
            }
        }
    }


    fun saveToken() {
        val sharedPref = context?.getSharedPreferences("tokenFile", Context.MODE_PRIVATE)
        sharedPref?.edit()?.putString("MY_TOKEN", myToken.toString())?.apply()
    }

    //filter logic


}