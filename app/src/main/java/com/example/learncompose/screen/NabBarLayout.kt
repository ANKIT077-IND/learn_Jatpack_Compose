package com.example.learncompose.screen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController

@Composable
fun NabBarLayout(navBarController: NavHostController) {
    val navItems = listOf<NavItem>(
        NavItem("Home", Icons.Filled.Home, NavBarRoutes.NavBarHomeScreen),
        NavItem("Notification", Icons.Filled.Notifications, NavBarRoutes.NavBarNotificationScreen),
        NavItem("Profile", Icons.Filled.Person, NavBarRoutes.NavBarProfileScreen),
        NavItem("Search", Icons.Filled.Search, NavBarRoutes.NavBarSearchScreen)
    )

    NavigationBar {
        navItems.forEach { item ->
            NavigationBarItem(
                selected = true,
                onClick = {
                    navBarController.navigate(item.routes) {
                        popUpTo(navBarController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop=true
                        restoreState=true
                    }
                },
                label = { Text(text = item.title) },
                icon = { Icon(imageVector = item.icons, contentDescription = null) }
            )
        }
    }
}

data class NavItem(val title: String, val icons: ImageVector, val routes: NavBarRoutes)