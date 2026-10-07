package com.example.learncompose.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BottomAppBar() {
    BottomAppBar(
        containerColor = Color.Gray.copy(alpha = 0.4f)
    ) {
        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(onClick = {}) { Icon(Icons.Filled.Home, contentDescription = null) }
                Text(text = "Home", fontSize = 16.sp)
            }
            Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(onClick = {}) { Icon(Icons.Filled.Email, contentDescription = null) }
                Text(text = "Email", fontSize = 16.sp)
            }
            Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(onClick = {}) { Icon(Icons.Filled.Delete, contentDescription = null) }
                Text(text = "Delete", fontSize = 16.sp)
            }
            Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(onClick = {}) { Icon(Icons.Filled.Favorite, contentDescription = null) }
                Text(text = "Favorites", fontSize = 16.sp)
            }
            Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(onClick = {}) { Icon(Icons.Filled.Person, contentDescription = null) }
                Text(text = "Person", fontSize = 16.sp)
            }
        }
    }
}