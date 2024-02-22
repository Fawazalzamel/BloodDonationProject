package com.example.blooddonationsfrontend.composable

import LoginScreen
import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.blooddonationsfrontend.utils.Routes

@SuppressLint("ComposableDestinationInComposeScope")
@Composable
fun navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.loginRoute

    ) {

        composable(Routes.loginRoute) {
            LoginScreen(onLogin = {
                navController.navigate(Routes.requestRoute)
            })
        }

        composable(Routes.requestRoute) {
            RequestList(onList = {
                navController.navigate(Routes.UserCardRoute)
            })
        }

        composable(Routes.requestRoute) {
            RequestList(onList = {
                navController.navigate(Routes.donationRequestRoute)
            })
        }

    }


}