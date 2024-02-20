

package com.example.blooddonationsfrontend.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.blooddonationsfrontend.R
//@Preview
//@Composable
//fun UserProfileScreen() {
//
//    var title by remember { mutableStateOf("") }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(7.dp)
//            .padding(top = 5.dp),
//        verticalArrangement = Arrangement.spacedBy(8.dp)
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.blood_donation), // Replace with your image
//            contentDescription = "image", // Provide a content description if necessary
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(200.dp),
//            alignment = Alignment.Center
//        )
//
//        InputField(value = title, onValueChange = {  }, label = "name")
//        InputField(value = title, onValueChange = {  }, label = "Phone Number")
//        InputField(value = title, onValueChange = {  }, label = "Email")
//
//
//
//        // Similar TextInputLayout and TextField for other input fields (phone, email, blood group)
//
//        // Update button
//        Text(
//            text = "Update",
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(40.dp),
//            color = Color.DarkGray, // Use appropriate color
//            textAlign = TextAlign.Center
//        )
//    }
//}


@Preview
@Composable
fun ProfileScreen() {


    var title by remember { mutableStateOf("") }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(7.dp)
            .padding(top = 10.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.blood_donation), // Replace with your image
                contentDescription = null, // Provide a content description if necessary
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),
                alignment = Alignment.Center
            )
        }
        items(9) { index ->
            InputField(
                value = title,
                onValueChange = { title = it },
                label = when (index) {
                    0 -> "Full name"
                    1 -> "Phone Number"
                    2 -> "Blood Type"
                    3 -> "Civil Id"
                    4 -> "Username"
                    5 -> "Email"
                    6 -> "Password"
                    7 -> "Age"
                    8 -> "Gender"
                    else -> ""
                }
            )
        }

        // Sign up button
        item {
            Button(
                onClick = { /* Handle sign up button click */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
            ) {
                Text(
                    text = "Registration",
                    color = Color.White
                )
            }
        }

        // Text for existing member login
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Already a member?",
                    color = Color.Black
                )
                Text(
                    text = " Login",
                    color = Color.Blue // Change color as needed
                )
                Text(
                    text = " here.",
                    color = Color.Black
                )
            }
        }
    }
}

