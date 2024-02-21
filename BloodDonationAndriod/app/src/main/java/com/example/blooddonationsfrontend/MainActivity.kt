package com.example.blooddonationsfrontend

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.blooddonationsfrontend.ui.theme.BloodDonationsFrontEndTheme
import com.example.blooddonationsfrontend.utils.enums.BloodTypes
import com.example.blooddonationsfrontend.utils.enums.DonationTypes
import com.example.blooddonationsfrontend.utils.enums.Gender
import com.example.blooddonationsfrontend.utils.enums.Status
import com.example.blooddonationsfrontend.viewmodel.DonationViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
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