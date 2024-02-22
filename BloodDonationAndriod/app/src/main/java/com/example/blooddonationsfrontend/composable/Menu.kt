package com.example.blooddonationsfrontend.composable

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.blooddonationsfrontend.R
import kotlinx.coroutines.launch

//@OptIn(ExperimentalMaterial3Api::class)
//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
//@Composable
//fun MyScreen() {
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { Text(text = "tbara3") },
//                navigationIcon = {
//                    IconButton(onClick = { /* Handle navigation icon click */ }) {
//                        Icon(
//                            painter = painterResource(id = R.drawable.info),
//                            contentDescription = "Menu",
//                            tint = Color.LightGray // Change the color here
//                        )
//                    }
//                },
//                actions = {
//                    IconButton(onClick = { /* Handle search action */ }) {
//                        Icon(
//                            painter = painterResource(id = R.drawable.powerr),
//                            contentDescription = "Log out",
//                            tint = Color.LightGray // Change the color here
//                        )
//                    }
//                }
//
//            )
//        },
//        content = {
//            // Content of the screen
//            Column(
//                modifier = Modifier.fillMaxSize(),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Text(text = "Hello, World!")
//            }
//        }
//    )
//}
//
//@Preview
//@Composable
//fun PreviewMyScreen() {
//    MyScreen()
//}


////// new way
//
//
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun DrawerMenu(navController: NavHostController) {
//   val scaffoldState = rememberScaffoldState()
//    val drawerContent: @Composable () -> Unit = {
//        Column {
//            DrawerMenuItem(text = "Contact Us") {
//                navController.navigate("contact_us") {
//                    popUpTo(navController.graph.startDestinationId) {
//                        saveState = true
//                    }
//                    launchSingleTop = true
//                }
//                scaffoldState.drawerState.close()
//            }
//            DrawerMenuItem(text = "Locations") {
//                navController.navigate("locations") {
//                    popUpTo(navController.graph.startDestinationId) {
//                        saveState = true
//                    }
//                    launchSingleTop = true
//                }
//                scaffoldState.drawerState.close()
//            }
//            DrawerMenuItem(text = "Logout") {
//                navController.navigate("logout") {
//                    popUpTo(navController.graph.startDestinationId) {
//                        saveState = true
//                    }
//                    launchSingleTop = true
//                }
//                scaffoldState.drawerState.close()
//            }
//        }
//    }
//
//    val scope = rememberCoroutineScope()
//
//    Scaffold(
//        scaffoldState = scaffoldState,
//        drawerContent = drawerContent,
//        drawerBackgroundColor = Color.White,
//        drawerContentColor = Color.Black,
//        drawerGesturesEnabled = true,
//        drawerScrimColor = Color.Transparent,
//        content = {
//            // Main content
//            Text(text = "Main Content")
//        },
//        topBar = {
//            // App bar
//            TopAppBar(
//                title = { Text(text = "Drawer Menu") },
//                navigationIcon = {
//                    IconButton(onClick = {
//                        scope.launch {
//                            scaffoldState.drawerState.open()
//                        }
//                    }) {
//                        Icon(
//                            imageVector = Icons.Default.Menu,
//                            contentDescription = "Menu"
//                        )
//                    }
//                }
//            )
//        }
//    )
//}
//
//@Composable
//fun DrawerMenuItem(text: String, onClick: () -> Unit) {
//    TextButton(
//        onClick = onClick,
//        modifier = Modifier.padding(16.dp)
//    ) {
//        Text(text = text)
//    }
//}