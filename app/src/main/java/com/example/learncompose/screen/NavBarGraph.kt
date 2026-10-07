package com.example.learncompose.screen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavBarGraph() {
    var navBarController = rememberNavController()
    NavHost(
        navController = navBarController,
        startDestination = NavBarRoutes.NavBarHomeScreen
    ) {
        composable<NavBarRoutes.NavBarHomeScreen> { NavBarHomeScreen(navBarController) }
        composable<NavBarRoutes.NavBarProfileScreen> { NavBarProfileScreen(navBarController) }
        composable<NavBarRoutes.NavBarSearchScreen> { NavBarSearchScreen(navBarController) }
        composable<NavBarRoutes.NavBarNotificationScreen> {
            NavBarNotificationScreen(
                navBarController
            )
        }
    }
}