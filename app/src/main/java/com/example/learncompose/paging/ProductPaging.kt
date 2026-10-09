package com.example.learncompose.paging

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.learncompose.model.Product
import com.example.learncompose.network.FactoryApi

class ProductPaging : PagingSource<Int, Product>() {
    override fun getRefreshKey(state: PagingState<Int, Product>): Int? {
        return null
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Product> {
        return try {
            var currentPage = params.key ?: 0
            var response = FactoryApi.fetchProducts()
            Log.d("Product Info", "info1:" + response.size)
            LoadResult.Page(
                data = response,
                prevKey = if (currentPage == 0) null else currentPage - 10,
                nextKey = (if (response.isEmpty()) null else currentPage + 10)
            )
        } catch (e: Exception) {
            Log.d("Product Info", "info2:" + e.toString())
            LoadResult.Error(e)
        }
    }
}