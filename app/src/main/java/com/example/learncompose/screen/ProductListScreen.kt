package com.example.learncompose.screen

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.paging.compose.collectAsLazyPagingItems
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.example.learncompose.ProductViewModel
import com.example.learncompose.model.Product

@Composable
fun ProductListScreen(viewModel: ProductViewModel) {
    val productItem = viewModel.productFlow.collectAsLazyPagingItems()
    Scaffold { innerPadding ->
        LazyColumn(modifier = Modifier.padding(innerPadding)) {
            items(count = productItem.itemCount) { index ->
                productItem[index]?.let {
                    ListItem(it)
                }
            }
        }
    }
}

@Composable
fun ListItem(product: Product) {
    Log.d("Product Img", "Product Ima:" + product.thumbnail)
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(product.thumbnail)
                    .crossfade(true)
                    .build(),
                contentDescription = null,
                contentScale = ContentScale.Fit, modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
            )
            Text(text = product.title.toString())
            Text(text = product.description.toString())
            Text(text = product.price.toString())
        }
    }
}