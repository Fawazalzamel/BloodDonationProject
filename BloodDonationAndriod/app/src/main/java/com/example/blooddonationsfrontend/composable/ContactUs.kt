package com.example.blooddonationsfrontend.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.blooddonationsfrontend.R
@Preview
@Composable
fun ContactUsScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(7.dp)
            .padding(top = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.blood_donation),
                contentDescription = "Your Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.FillWidth
            )
        }
        item {
            AppInfoItem()
        }
        item {
            AppInfoItem(text1 = "Company", text2 = "coded x kfh", icon = R.drawable.ic_email)
        }
        item {
            AppInfoItem(text1 = "Phone", text2 = "+965 99999999", icon = R.drawable.ic_phone)
        }
        item {
            AppInfoItem(text1 = "Website", text2 = "https://tabara3.app/", icon = R.drawable.ic_website)
        }
        item {
            AppInfoItem(text1 = "Version", text2 = "1.0", icon = R.drawable.info)
        }
    }
}
@Composable
fun AppInfoItem(text1: String = "", text2: String = "", icon: Int = 0) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(horizontal = 5.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier.run {
                size(60.dp)
                    .background(color = Color.White, shape = CircleShape)
            }
        ) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Fit
            )
        }
        Column(
            modifier = Modifier
                .padding(start = 10.dp)
        ) {
            Text(
                text = text1,
                color = Color.Black,
                fontSize = 18.sp
            )
            Text(
                text = text2,
                color = Color.Gray,
                fontSize = 12.sp
            )
        }
    }
}
