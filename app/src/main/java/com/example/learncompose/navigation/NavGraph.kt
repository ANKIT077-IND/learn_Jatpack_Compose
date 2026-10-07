package com.example.learncompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavGraph() {
    var navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavRoute.LoginScreen
    ) {
        composable<NavRoute.LoginScreen> { LoginScreen(navController) }
        composable<NavRoute.HomeScreen> { HomeScreen(navController) }
    }
}