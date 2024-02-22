package com.example.blooddonationsfrontend.composable

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp

@Composable
fun MyformRequest() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        Text(
            text = "Add Donation Request",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp),
            color = MaterialTheme.colorScheme.primary

        )
        RequestInput(label = "File Number:")
        Spacer(modifier = Modifier.height(16.dp))
        RequestInput(label = "Blood Type:")
        Spacer(modifier = Modifier.height(16.dp))
        RequestInput(label = "Donation Type:")
        Spacer(modifier = Modifier.height(16.dp))
        RequestInput(label = "Type of Research:")
        Spacer(modifier = Modifier.height(16.dp))
        RequestInput(label = "Status:")
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { /* Handle button click */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Submit")
        }
    }
}

@Composable
fun RequestInput(label: String) {
    var text by remember { mutableStateOf("") }

    Column {
        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text(text = label) },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions(onNext = { /* Handle next action */ })
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}

