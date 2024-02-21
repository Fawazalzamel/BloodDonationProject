package com.example.blooddonationsfrontend.composable

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

import com.example.blooddonationsfrontend.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "My App") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle navigation icon click */ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.info),
                            contentDescription = "Menu",
                            tint = Color.LightGray // Change the color here
                        )
                    }
                },
                actions = {
                    // You can add additional actions here if needed
                }
            )
        },
        content = {
            // Content of the screen
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Hello, World!")
            }
        }
    )
}

@Preview
@Composable
fun PreviewMyScreen() {
    MyScreen()
}