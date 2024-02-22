package com.example.blooddonationsfrontend

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.blooddonationsfrontend.ui.theme.BloodDonationsFrontEndTheme
import com.example.blooddonationsfrontend.viewmodel.DonationViewModel
import com.google.android.material.navigation.NavigationView
import androidx.compose.material3.Text
import androidx.navigation.compose.rememberNavController

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
//                    viewModel.updateAccountPage(
//                        "Nada", "987", "Nadaa@gmail.com", "635367372"
//                                    )
//                    viewModel.signin(
//                        "razan",
//                        "1234"
//                    )
                    viewModel.signup(
                        "razan2",
                        "1234",
                        "Razan Alshatti",
                        "razan@gmail.com",
                        "7486526835",
                        "AB_NEGATIVE",
                        "6563253",
                        23,
                        "FEMALE"
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BloodDonationsFrontEndTheme {
        Greeting("Android")
    }
}