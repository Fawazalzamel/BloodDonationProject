import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//
//package com.example.blooddonationsfrontend.composable
//
//import androidx.compose.foundation.layout.Row
//import androidx.compose.material.BottomNavigation
//import androidx.compose.material.BottomNavigationItem
//import androidx.compose.material3.Icon
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.tooling.preview.Preview
//import com.example.blooddonationsfrontend.R
//
//@Composable
//fun MyBottomBar() {
//    BottomNavigation {
//        BottomNavigationItem(
//            selected = false,
//            onClick = { /* Handle item click */ },
//            icon = {
//                Icon(
//                    painter = painterResource(id = R.drawable.ic_home),
//                    contentDescription = "Home"
//                )
//            },
//            label = { Text("Home") }
//        )
//
//        BottomNavigationItem(
//            selected = false,
//            onClick = { /* Handle item click */ },
//            icon = {
//                Icon(
//                    painter = painterResource(id = R.drawable.ic_user),
//                    contentDescription = "Profile"
//                )
//            },
//            label = { Text("Profile") }
//        )
//    }
//}
//
//@Preview
//@Composable
//fun PreviewMyBottomBar() {
//    MyBottomBar()
//}
@Composable
fun BottomBar(onHomeClick: () -> Unit,
              onResearchClick: () -> Unit,
              onProfileClick: () -> Unit,
              onNeededClick: () -> Unit,
              ){


    BottomAppBar {
        Row(Modifier.weight(1f)) {
            IconButton(onClick = onHomeClick, modifier = Modifier.weight(1f)) {
                Icon(Icons.Filled.Home, contentDescription = "Home")
                // nbe
            }
            IconButton(onClick = onResearchClick, modifier = Modifier.weight(1f)) {
                Icon(Icons.Filled.Create, contentDescription = "Research")

            }
            IconButton(onClick = onNeededClick, modifier = Modifier.weight(1f)) {
                Icon(Icons.Filled.LocationOn, contentDescription = "Location")
                //nbe
            }
            IconButton(onClick = onProfileClick, modifier = Modifier.weight(1f)) {
                Icon(Icons.Filled.AccountCircle, contentDescription = "Profile")
                //nbe
            }
        }
    }

}




@Preview
@Composable
fun PreviewBottomBar() {
    BottomBar(
        onHomeClick = { /*TODO*/ },
        onResearchClick = { /*TODO*/ },
        onProfileClick = { /*TODO*/ },
        onNeededClick = {/*TODO*/ })

}
