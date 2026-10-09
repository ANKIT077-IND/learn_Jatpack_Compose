package com.example.learncompose.model

import kotlinx.serialization.Serializable

@Serializable
data class Product(
    val title: String,
    val thumbnail: String,
    val description: String,
    val price: String,
)