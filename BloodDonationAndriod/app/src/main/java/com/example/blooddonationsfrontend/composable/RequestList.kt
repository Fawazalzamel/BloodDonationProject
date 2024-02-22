import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.blooddonationsfrontend.composable.UserCard

//package com.example.blooddonationsfrontend.composable
//import android.annotation.SuppressLint
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.text.KeyboardOptions
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Add
//import androidx.compose.material3.FloatingActionButton
//import androidx.compose.material3.Icon
//import androidx.compose.material3.LocalTextStyle
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextField
//import androidx.compose.material3.TextFieldDefaults
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.Color.Companion.LightGray
//import androidx.compose.ui.graphics.Color.Companion.White
//import androidx.compose.ui.text.input.ImeAction
//import androidx.compose.ui.unit.dp
//import com.example.blooddonationsfrontend.utils.Routes
//
//
//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
//@Composable
//fun RequestList(onList: () -> Unit ) {
//    val searchText = remember { mutableStateOf("") }
//
//
//    Scaffold(
//        floatingActionButton = {
//            FloatingActionButton(
//                onClick = {},
//                containerColor = MaterialTheme.colorScheme.primary,
//            ) {
//                Icon(
//                    imageVector = Icons.Default.Add,
//                    contentDescription = "Add"
//                )
//            }
//        }
//    ) {
//
//
//        Column(modifier = Modifier.fillMaxSize()) {
//            TextField(
//                value = searchText.value,
//                onValueChange = { newText -> searchText.value = newText },
//                label = { Text("Tbara3") },
//                colors = TextFieldDefaults.colors(
//                    focusedContainerColor = LightGray,
//                    unfocusedContainerColor = LightGray,
//                    disabledContainerColor = LightGray,
//                    focusedIndicatorColor = Color.Transparent,
//                    unfocusedIndicatorColor = Color.Transparent,
//                    disabledIndicatorColor = Color.Transparent,
//                ),
//                modifier = Modifier
//                    .padding(12.dp, 16.dp)
//                    .fillMaxWidth(),
//                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
//                textStyle = LocalTextStyle.current.copy(color = White)
//            )
//            LazyColumn {
//                items(10) { index ->
//                    UserCard(
//                        userName = "User $index",
//                        userBlood = "O+",
//                        userPhone = "123-456-7890",
//                        onCardClick = onList,
//                    )
//                }
//            }
//        }
//    }
//
//}





@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun RequestList(onList: () -> Unit, toMyForm: () -> Unit,
) {
    val searchText = remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Blood Donations",
                        fontSize = 20.sp // Set the text size to 20sp
                    )
                },

                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        modifier = Modifier.clickable {
                            // Handle menu icon click
                            // You can navigate to another screen, show a drawer, etc.
                        }
                    )
                },
                actions = {
                    // Add any additional actions here
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {toMyForm()},
                containerColor = MaterialTheme.colorScheme.primary,
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add"
                )
            }
        },
        bottomBar = {
            BottomBar(
                onHomeClick = {  },
                onResearchClick = { /*TODO*/ },
                onProfileClick = { /*TODO*/ },
                onNeededClick = {/*TODO*/ })
        }

    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(it)) {
            LazyColumn {
                items(10) { index ->
                    UserCard(
                        userName = "User $index",
                        userBlood = "O+",
                        userPhone = "123-456-7890",
                        onCardClick = onList,
                    )
                }
            }
        }
    }
}
