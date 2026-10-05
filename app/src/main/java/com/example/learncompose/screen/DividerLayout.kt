package com.example.learncompose.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun DividerLayout() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 100.dp, start = 10.dp, end = 10.dp)) {
        Text(text = "Hello Ankit")
        HorizontalDivider(modifier = Modifier.height(height = 10.dp), color = Color.Blue)
        Text(text = "Hello Ankit")
        VerticalDivider(modifier = Modifier.size(width = 10.dp, height = 20.dp),color = Color.Blue)
    }
}