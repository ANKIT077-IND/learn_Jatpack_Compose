package com.example.learncompose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learncompose.PostModel
import com.example.learncompose.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LazyColumnAndLazyRowLayout() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(count = buildList().size) { index ->
            BuildItem(
                buildList().get(index).title,
                buildList().get(index).subTitle,
                buildList().get(index).location
            )
        }

    }
}

@Composable
fun BuildItem(title: String, subTitle: String, location: String) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {

        Row(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(R.drawable.meditation),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )
            Spacer(
                modifier = Modifier
                    .width(10.dp)
                    .fillMaxWidth()
            )
            Column {
                Text(text = title.toString(), fontSize = 20.sp)
                Text(text = subTitle.toString(), fontSize = 16.sp)
                Text(text = location.toString(), fontSize = 12.sp)
            }
        }

    }
}

fun buildList(): MutableList<PostModel> {
    var list = mutableListOf<PostModel>()
    list.add(
        PostModel(
            "Morning Coffee Meetup",
            "Start your day with great coffee and new connections.",
            "Downtown Coffee House, New York"
        )
    )
    list.add(
        PostModel(
            "Tech Community Meetup",
            "Connect with developers and discuss the latest technology",
            "Downtown Coffee House, New York"
        )
    )
    list.add(
        PostModel(
            "Weekend Photography Walk",
            "Explore the city and capture beautiful moments.",
            "Central Park, New York"
        )
    )
    list.add(
        PostModel(
            "Morning Coffee Meetup",
            "Start your day with great coffee and new connections.",
            "Downtown Coffee House, New York"
        )
    )
    list.add(
        PostModel(
            "Morning Coffee Meetup",
            "Start your day with great coffee and new connections.",
            "Downtown Coffee House, New York"
        )
    )
    list.add(
        PostModel(
            "Morning Coffee Meetup",
            "Start your day with great coffee and new connections.",
            "Downtown Coffee House, New York"
        )
    )
    list.add(
        PostModel(
            "Morning Coffee Meetup",
            "Start your day with great coffee and new connections.",
            "Downtown Coffee House, New York"
        )
    )
    list.add(
        PostModel(
            "Morning Coffee Meetup",
            "Start your day with great coffee and new connections.",
            "Downtown Coffee House, New York"
        )
    )
    list.add(
        PostModel(
            "Morning Coffee Meetup",
            "Start your day with great coffee and new connections.",
            "Downtown Coffee House, New York"
        )
    )
    list.add(
        PostModel(
            "Morning Coffee Meetup",
            "Start your day with great coffee and new connections.",
            "Downtown Coffee House, New York"
        )
    )
    list.add(
        PostModel(
            "Morning Coffee Meetup",
            "Start your day with great coffee and new connections.",
            "Downtown Coffee House, New York"
        )
    )
    list.add(
        PostModel(
            "Morning Coffee Meetup",
            "Start your day with great coffee and new connections.",
            "Downtown Coffee House, New York"
        )
    )
    list.add(
        PostModel(
            "Morning Coffee Meetup",
            "Start your day with great coffee and new connections.",
            "Downtown Coffee House, New York"
        )
    )
    list.add(
        PostModel(
            "Morning Coffee Meetup",
            "Start your day with great coffee and new connections.",
            "Downtown Coffee House, New York"
        )
    )
    list.add(
        PostModel(
            "Morning Coffee Meetup",
            "Start your day with great coffee and new connections.",
            "Downtown Coffee House, New York"
        )
    )

    return list
}