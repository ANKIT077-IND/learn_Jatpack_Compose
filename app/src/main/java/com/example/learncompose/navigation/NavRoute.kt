package com.example.learncompose.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class NavRoute {
    @Serializable
    object LoginScreen : NavRoute()

    @Serializable
    object HomeScreen : NavRoute()
}
