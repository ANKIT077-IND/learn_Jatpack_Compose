package com.example.learncompose.screen

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ButtonLayout() {
    val context = LocalContext.current
    Column(modifier = Modifier.padding(top = 100.dp, start = 10.dp, end = 10.dp)) {
        Button(onClick = {}, shape = RoundedCornerShape(10.dp),colors = ButtonDefaults.buttonColors(
            contentColor = Color.White, containerColor = Color.Black
        )) {
            Text(text = "Submit")
        }
        IconButton(onClick = {},modifier = Modifier.padding(top = 10.dp)) {
            Icon(
                imageVector = Icons.Filled.Search,
                contentDescription = null
            )
        }
        OutlinedButton(onClick = {},modifier = Modifier.padding(top = 10.dp)) {
            Text(text = "Submit")
        }
        ElevatedButton(onClick = {},modifier = Modifier.padding(top = 10.dp)) { Text(text = "Submit") }
        TextButton(onClick = {
            Toast.makeText(context,"this is text button", Toast.LENGTH_LONG).show()
        }, modifier = Modifier.padding(top = 10.dp)) {Text(text = "Submit")}
    }
}