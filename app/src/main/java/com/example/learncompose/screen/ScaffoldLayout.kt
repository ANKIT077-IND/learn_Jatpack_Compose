package com.example.learncompose.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ScaffoldLayout() {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = "Home Screen") },
            navigationIcon = { Icon(Icons.Filled.ArrowBack, contentDescription = null) },
            actions = {
                IconButton(
                    onClick = {},
                    colors = IconButtonDefaults.iconButtonColors(contentColor = Color.Yellow)
                ) { Icon(Icons.Filled.Search, contentDescription = null) }
                IconButton(onClick = {}) { Icon(Icons.Filled.MoreVert, contentDescription = null) }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Blue,
                titleContentColor = Color.White,
                actionIconContentColor = Color.White,
                navigationIconContentColor = Color.White
            )
        )
    }, bottomBar = { BottomAppBar() }, floatingActionButton ={FAB()}) { paddingValues -> Column(modifier = Modifier.padding(paddingValues)) {  LazyColumnAndLazyRowLayout()}}
}