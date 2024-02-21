package com.example.blooddonationsfrontend.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.blooddonationsfrontend.R
@Preview
@Composable
fun RegistrationScreen() {

    var title by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(7.dp)
            .padding(top = 10.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.blood_donation), // Replace with your image
            contentDescription = null, // Provide a content description if necessary
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            alignment = Alignment.Center
        )
        InputField(
            value = title,
            onValueChange = { title = it },
            label = "Full name"
        )
        InputField(
            value = title,
            onValueChange = { title = it },
            label = "Phone Number"
        )
        InputField(
            value = title,
            onValueChange = { title = it },
            label = "Blood Type"
        )
        InputField(
            value = title,
            onValueChange = { title = it },
            label = "Civil Id"
        )
        InputField(
            value = title,
            onValueChange = { title = it },
            label = "Username"
        )

        InputField(
            value = title,
            onValueChange = { title = it },
            label = "Email"
        )
        InputField(
            value = title,
            onValueChange = { title = it },
            label = "Password"
        )
        InputField(
            value = title,
            onValueChange = { title = it },
            label = "Age"
        )
        InputField(
            value = title,
            onValueChange = { title = it },
            label = "Gender"
        )


        // Similar TextInputLayout and TextField for other input fields (phone, email, password)

        // Sign up button
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

        // Text for existing member login
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
    }}



