package com.example.blooddonationsfrontend.composable

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(navController, startDestination = "SignUp"){
        composable("SignUp"){ ProfileScreen(navController) }
        composable("RequestList"){ RequestList(navController) }
        composable("RequestList"){ RequestList(navController) }
        composable("UserProfileScreen"){ UserProfileScreen(navController) }

    }
}


