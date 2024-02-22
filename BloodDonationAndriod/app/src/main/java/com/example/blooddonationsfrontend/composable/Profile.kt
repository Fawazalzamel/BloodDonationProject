

package com.example.blooddonationsfrontend.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.blooddonationsfrontend.R

@Composable
fun UserProfileScreen(navController: NavHostController) {
//navhost,navcontroller
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(7.dp)
            .padding(top = 5.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.blood_donation), // Replace with your image
            contentDescription = "image", // Provide a content description if necessary
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            alignment = Alignment.Center
        )

        InputField(value = username, onValueChange = { username= it }, label = "username")
        InputField(value = password, onValueChange = { password= it  }, label = "password")
        InputField(value = email, onValueChange = { email= it  }, label = "Email")
        InputField(value = phoneNumber, onValueChange = { phoneNumber= it  }, label = "Phone number")



        // Similar TextInputLayout and TextField for other input fields (phone, email, blood group)

        // Update button
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
        ) {
            Text(
                text = "Update",
                color = Color.Black
            )
        }
        Button(
            onClick = { /* Handle logout button click */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
        ) {
            Text(
                text = "LOGOUT",
                color = Color.Black
            )
        }
    }
}

