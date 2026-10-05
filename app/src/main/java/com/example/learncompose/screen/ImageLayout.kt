package com.example.learncompose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learncompose.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ImageLayout() {
    Column(modifier = Modifier.padding(top = 100.dp)) {
        Image(
            painter = painterResource(R.drawable.meditation),
            contentDescription = null,
            modifier = Modifier.size(70.dp),
            contentScale = ContentScale.Inside
        )
        Image(imageVector = Icons.Filled.Build,contentDescription = null)
        Image(imageVector = Icons.Outlined.Phone,contentDescription = null)
        Icon(imageVector = Icons.Rounded.Call,contentDescription = null)
    }
}