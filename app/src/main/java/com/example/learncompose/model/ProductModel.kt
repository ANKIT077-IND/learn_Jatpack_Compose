package com.example.learncompose.model

import kotlinx.serialization.Serializable

@Serializable
data class ProductModel(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)