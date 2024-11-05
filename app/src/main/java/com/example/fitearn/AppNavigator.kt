package com.example.fitearn

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigator() {
    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginPage(navController) }
        composable("dashboard") { DashboardPage(navController) }
        composable("registration") { RegistrationPage(navController) }
    }
}

@Composable
fun DashboardPage(navController: NavHostController) {

}


