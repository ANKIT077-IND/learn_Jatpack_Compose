package com.example.learncompose.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MOdifier() {
    Column(
        modifier = Modifier.padding(top = 100.dp, start = 10.dp, end = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(30.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth(1f)
                .background(color = Color.Red)
                .padding(horizontal = 10.dp, vertical = 10.dp)
        ) {
            Text(text = "Apple")
            Text(text = "Banana")
            Text(text = "Grapes")
        }
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(color = Color.Yellow)
                .clickable(onClick = {})
                .border(width = 2.dp, color = Color.Black, shape = RoundedCornerShape(10.dp))
                .padding(top = 20.dp), contentAlignment = Alignment.Center
         ) {
            Text(text = "Center", fontSize = 20.sp, textAlign = TextAlign.Center)
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth(1f)
                .background(color = Color.Blue)
                .padding(horizontal = 10.dp, vertical = 10.dp)
        ) {
            Text(text = "Apple")
            Text(text = "Banana")
            Text(text = "Grapes")
        }
    }
}