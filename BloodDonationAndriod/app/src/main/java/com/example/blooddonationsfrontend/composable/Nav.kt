package com.example.blooddonationsfrontend.composable

import LoginScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.blooddonationsfrontend.utils.Routes

@Composable
fun NavigationGraph(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = Routes.signinRoute
    ) {
        composable(Routes.signinRoute) {
            LoginScreen({})
        }

        composable(Routes.signUpRoute) {
            RegistrationScreen()
        }
        composable(Routes.donationRequestRoute) {

        }
        composable(Routes.UserProfileRoute) {

        }
        composable(Routes.ForgetScreen) {

        }
        composable(Routes.UserCardRoute) {

        }
        composable(Routes.MenuRoute) {
        }
        composable(Routes.LocationScreenRoute) {

        }
        composable(Routes.contactUsRoutes) {
        }
    }
}