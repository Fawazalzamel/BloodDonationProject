package com.example.blooddonationsfrontend

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.example.blooddonationsfrontend.composable.navigation
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.blooddonationsfrontend.ui.theme.BloodDonationsFrontEndTheme
import com.example.blooddonationsfrontend.viewmodel.DonationViewModel
import com.example.blooddonationsfrontend.ui.theme.BloodDonationsFrontEndTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            FilterMenuExample()
            BloodDonationsFrontEndTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {



                    val viewModel: DonationViewModel = viewModel()

                    val donationsTest = viewModel.donationList

                    Button(onClick = {
                    print(donationsTest)
                    }) {
                        Text("Show Data")
                    }

//                    viewModel.getAccount( username = "nada",
//                        password = "1234",
//                        email = "nada@gmail.com",
//                        phoneNumber = "635526")
//                    viewModel.statusUpdate(
//                        id = "4"
//                    )
//                    viewModel.requestDonation(
//                        "352672",
//                        "A_POSITIVE",
//                        "BLOOD"
//                    )
//                    viewModel.updateAccountPage(
//                        "Nada", "987", "Nadaa@gmail.com", "635367372"
//                                    )
//                    viewModel.signin(
//                        "razan",
//                        "1234"
//                    )
//                    viewModel.signup(
//                        "razan2",
//                        "1234",
//                        "Razan Alshatti",
//                        "razan@gmail.com",
//                        "7486526835",
//                        "AB_NEGATIVE",
//                        "6563253",
//                        23,
//                        "FEMALE"
//                    )


                   // navigation()


                }
            }
        }
    }
}
