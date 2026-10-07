package com.example.learncompose.screen

import kotlinx.serialization.Serializable

@Serializable
sealed class NavBarRoutes() {
    @Serializable
    object NavBarHomeScreen : NavBarRoutes()

    @Serializable
    object NavBarNotificationScreen : NavBarRoutes()

    @Serializable
    object NavBarProfileScreen : NavBarRoutes()

    @Serializable
    object NavBarSearchScreen : NavBarRoutes()
}