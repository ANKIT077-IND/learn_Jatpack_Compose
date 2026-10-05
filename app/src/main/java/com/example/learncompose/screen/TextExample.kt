package com.example.learncompose.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextExample() {
    var name = remember { mutableStateOf("") }
    Column {
        Text(
            text = "Hello Android",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp,
            color = Color.Yellow,
            modifier = Modifier
                .padding(100.dp)
                .background(Color.Black),
            fontFamily = FontFamily.Serif
        )
        TextField(
            value = name.value,
            onValueChange = { name.value = it },
            placeholder = { Text(text = "Enter the name") },
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(horizontal = 10.dp),
            leadingIcon = { Icon(imageVector = Icons.Filled.Person, contentDescription = null) },
            shape = RoundedCornerShape(20.dp),
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            placeholder = { Text(text = "Enter the gender") },
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(horizontal = 10.dp),
            leadingIcon = { Icon(imageVector = Icons.Filled.Person, contentDescription = null) },
            shape = RoundedCornerShape(20.dp),
        )
    }


}