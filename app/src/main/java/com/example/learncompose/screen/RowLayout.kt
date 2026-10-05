package com.example.learncompose.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RowLayout() {
    Row(
        verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Absolute.SpaceEvenly, modifier = Modifier
            .padding(top = 100.dp).fillMaxWidth(1f)
    ) {
        Text(text = "Hello Ankit")
        Text(text = "Hello Ram")
        Text(text = "Hello Sita")
    }
}