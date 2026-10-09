package com.example.learncompose.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.example.learncompose.model.Product
import com.example.learncompose.paging.ProductPaging

class ProductRepository {
    fun getProduct(): Pager<Int, Product> {
        return Pager(PagingConfig(pageSize = 10)) {
            ProductPaging()
        }
    }
}