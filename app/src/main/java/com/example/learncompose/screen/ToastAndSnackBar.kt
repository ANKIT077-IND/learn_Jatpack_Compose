package com.example.learncompose.screen

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ToastAndSnackBar() {
    var context = LocalContext.current
    var snackbarHostState = remember { SnackbarHostState() }
    var scope = rememberCoroutineScope()

    Scaffold(snackbarHost = {
        SnackbarHost(hostState = snackbarHostState)
    }) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = {
            Toast.makeText(context,"Toast show", Toast.LENGTH_SHORT).show()
        }, modifier = Modifier.size(height = 50.dp, width = 200.dp)) { Text(text = "Submit") }
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = {scope.launch { snackbarHostState.showSnackbar(message = "Hello Jatpack Compose") }
            }, modifier = Modifier.size(height = 50.dp, width = 200.dp)) { Text(text = "show SnackBar") } }
    }
}