package com.example.blooddonationsfrontend.composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.blooddonationsfrontend.R


@Composable
fun UserCard(
    userName: String,
    userBlood: String,
    userDivision: String,
    userDistrict: String,
    userPhone: String
) {
    Card(
        // backgroundColor = Color.LightGray,
        shape = RoundedCornerShape(12.dp),
        // elevation = 8.dp,
        modifier = Modifier
            .padding(2.dp)
            .height(200.dp)
            //.align(LineHeightStyle.Alignment.Top)
    ) {
        Column(modifier = Modifier.padding(7.dp)) {
            Text(
                text = userName,
                color = Color.Gray,
                fontSize = 20.sp
            )
            Text(
                text = userBlood,
                color = Color.Gray,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Row(modifier = Modifier.weight(1f)) {
                Text(
                    text = userDivision,
                    color = Color.Gray,
                    fontSize = 20.sp,
                    modifier = Modifier.weight(1f)
                )
                Text(
                    text = userDistrict,
                    color = Color.Gray,
                    fontSize = 20.sp,
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier.weight(1f)) {
                Text(
                    text = userPhone,
                    color = Color.Gray,
                    fontSize = 20.sp,
                    modifier = Modifier.weight(1f)
                )
                Image(
                    painter = painterResource(id = R.drawable.blood),
                    contentDescription = null,
                    modifier = Modifier
                        .size(160.dp)
                        .weight(0.2f)
                )
            }
        }
    }
}

@Preview
@Composable
fun UserCardPagePreview() {
    UserCard(
        userName = "Maha Awadh",
        userBlood = "A+",
        userDivision = "kuwait 1",
        userDistrict = " almsayel A",
        userPhone = "123-456-7890"
    )
}