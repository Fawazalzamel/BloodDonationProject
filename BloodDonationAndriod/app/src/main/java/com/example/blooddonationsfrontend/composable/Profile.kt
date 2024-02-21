

package com.example.blooddonationsfrontend.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
@Preview
@Composable
fun UserProfileScreen() {

    var title by remember { mutableStateOf("") }

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

        InputField(value = title, onValueChange = {  }, label = "username")
        InputField(value = title, onValueChange = {  }, label = "password")
        InputField(value = title, onValueChange = {  }, label = "Email")
        InputField(value = title, onValueChange = {  }, label = "Phone number")



        // Similar TextInputLayout and TextField for other input fields (phone, email, blood group)

        // Update button
        Button(
            onClick = { /* Handle login button click */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
        ) {
            Text(
                text = "Update",
                color = Color.Black
            )
        }
    }
}

