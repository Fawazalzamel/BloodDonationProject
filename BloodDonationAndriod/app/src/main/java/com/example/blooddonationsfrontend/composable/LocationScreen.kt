package com.example.blooddonationsfrontend.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.blooddonationsfrontend.R
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun LocationCardList() {
    Column(
        modifier = Modifier.padding(16.dp),

    ) {
        LocationCard(
            name = "Jabriya Center",
            Time = "Sun to Thu from 7:30 am to 8:30 pm \nFriday from 1 pm to 7 pm \nSaturday from 7:30 am to 7 pm",
            phone = "Phone: +965 25339511"
        )
        LocationCard(
            name = "Jaber Alahmad Hospital",
            Time = "Sun to Thu \nfrom 7:30 am to 8:30 pm",
            phone = "Phone: +965 25305000"
        )
        LocationCard(
            name = "New Aljahraa Hospital",
            Time = "Sun to Thu \nfrom 7:30 am to 8:30 pm",
            phone = "Phone: +965 25339511"
        )
    }
}

@Composable
fun LocationCard(name: String, Time: String, phone: String) {
    Card(

        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = name,
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp)
            )
            Text(
                text = Time,
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = phone,
                modifier = Modifier.padding(top = 8.dp)
            )
            Button(
                onClick = { /* Handle button click */ },
                modifier = Modifier
                    .height(30.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_location),
                    contentDescription = "View Location"
                )
            }
        }
    }

}
