package com.example.learncompose.network

import android.util.Log
import com.example.learncompose.model.Product
import com.example.learncompose.model.ProductModel
import io.ktor.client.call.body
import io.ktor.client.request.get

object FactoryApi {
    suspend fun fetchProducts(): List<Product> {
        var response = ApiServices.httpClient.get("https://dummyjson.com/products?limit=0")
            .body<ProductModel>()
        Log.d("Product Log", "Product:" + response.products.size.toString())
        return response.products
    }
}