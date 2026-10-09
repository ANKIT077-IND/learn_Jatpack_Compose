package com.example.learncompose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.learncompose.repository.ProductRepository

class ProductViewModel(repo: ProductRepository = ProductRepository()) : ViewModel() {
    var productFlow = repo.getProduct().flow.cachedIn(viewModelScope)
}