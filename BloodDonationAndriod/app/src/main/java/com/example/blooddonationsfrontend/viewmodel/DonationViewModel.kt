package com.example.blooddonationsfrontend.viewmodel


import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.blooddonationsfrontend.data.User
import com.example.blooddonationsfrontend.data.response.TokenResponse
import com.example.blooddonationsfrontend.network.DonationApiServices
import com.example.blooddonationsfrontend.network.RetrofitHelper
import com.example.blooddonationsfrontend.utils.BloodTypes
import com.example.blooddonationsfrontend.utils.Gender
import com.example.blooddonationsfrontend.utils.Urgency
import kotlinx.coroutines.launch

class DonationViewModel : ViewModel() {
    private val apiService = RetrofitHelper.getInstance().create(DonationApiServices::class.java)
    var myToken: TokenResponse? by mutableStateOf(null)
    var user: User? by mutableStateOf(null)
    var context: Context? = null


    fun signup( username: String, password: String, fullName: String, email: String, phoneNumber: Long, bloodType: BloodTypes, civilId: String, age: Int, gender: Gender, id: Long, urgency: Urgency) {
        viewModelScope.launch {
            try {
                val response = apiService.signup(User(username,password,fullName,email,
                    phoneNumber,bloodType,civilId,age,gender,id,urgency))
                myToken = response.body()
            } catch (e: Exception) {
                println("Error $e")
            }

        }
    }

    fun signin(username: String, password: String, nav: () -> Unit) {
        viewModelScope.launch {
            try {
                val response = apiService.signin(User(username, password,null,null,
                    null,null,null,null,null,
                    null,null)
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