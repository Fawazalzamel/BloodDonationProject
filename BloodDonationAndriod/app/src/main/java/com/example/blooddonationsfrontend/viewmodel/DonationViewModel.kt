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
import com.example.blooddonationsfrontend.data.model.User
import com.example.blooddonationsfrontend.data.response.TokenResponse
import com.example.blooddonationsfrontend.network.DonationApiServices
import com.example.blooddonationsfrontend.network.RetrofitHelper
import com.example.blooddonationsfrontend.utils.enums.BloodTypes
import com.example.blooddonationsfrontend.utils.enums.Gender
import kotlinx.coroutines.launch

class DonationViewModel : ViewModel() {
    private val apiService = RetrofitHelper.getInstance().create(DonationApiServices::class.java)
    var myToken: TokenResponse? by mutableStateOf(null)
    var user: User? by mutableStateOf(null)
    var donationsList: List<DonationRequest>? by mutableStateOf(null)
    var context: Context? = null


    fun signup(
        username: String,
        password: String,
        fullName: String,
        email: String,
        phoneNumber: String,
        bloodType: BloodTypes,
        civilId: String,
        age: Int,
        gender: Gender,
    ) {
        viewModelScope.launch {
            try {
                val response = apiService.signup(
                    User(
                        username, password, fullName, email,
                        phoneNumber, bloodType, civilId, age, gender, null
                    )
                )
                myToken = response.body()
            } catch (e: Exception) {
                println("Error $e")
            }

        }
    }

    fun signin(username: String, password: String, nav: () -> Unit) {
        viewModelScope.launch {
            try {
                val response = apiService.signin(
                    SigninRequest(
                        username, password
                    )
                )
                myToken = response.body()
            } catch (e: Exception) {
                println("Error $e")
            } finally {
                if (myToken != null) {
                    saveToken()
                    getAccount()
                    nav()
                }
            }

        }
    }


    fun requestDonation(donationRequest: DonationRequest){
    viewModelScope.launch {
        try {
            val response = apiService.donationRequest(donationRequest)
        } catch (e: Exception) {

        }

     }
    }


    fun getAllDonations(){
        viewModelScope.launch {
            try {
                 donationsList=apiService.getDonations()

            }catch (e:Exception){

            }
        }
    }
    // review this

//    fun deleteRequest(deleteId:Int){
//        viewModelScope.launch {
//            val response = apiService.deleteRequest(deleteId)
//            if (response.isSuccessful){
//
//            }else{
//
//            }
//        }
//    }
//Don't forget to add it to the request page


    fun updateAccountPage(username: String, password: String, email: String,phoneNumber: String, nav: () -> Unit) {
        viewModelScope.launch {
            try {
                val response = apiService.updateAccount(
                    token = myToken?.getBearerToken(),
                    accountPage = AccountPage(
                    username,password,email,phoneNumber)
                )
            } catch (e: Exception) {
                println("Error $e")
            } finally {
                getAccount()
                nav()
            }


        }
    }

    fun saveToken() {
        val sharedPref = context?.getSharedPreferences("tokenFile", Context.MODE_PRIVATE)
        sharedPref?.edit()?.putString("MY_TOKEN", myToken.toString())?.apply()
    }

    fun getAccount() {
        viewModelScope.launch {
            try {
                val response = apiService.getAccount(token = myToken?.getBearerToken())
                user = response.body()
            } catch (e: Exception) {
                println("Error $e")
            }
        }
    }


}