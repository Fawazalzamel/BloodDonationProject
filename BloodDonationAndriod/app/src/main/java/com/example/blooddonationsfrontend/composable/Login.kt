import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.blooddonationsfrontend.R
import com.example.blooddonationsfrontend.composable.InputField

@Composable
fun LoginScreen(onLogin: () -> Unit) {

    var password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(7.dp)
            .padding(top = 10.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "tbaraaa3",
            style = MaterialTheme.typography.headlineSmall,
            color = Color.Red,
            modifier = Modifier.fillMaxWidth()
        )
        Image(
            painter = painterResource(id = R.drawable.bloodtest), // Replace with your image
            contentDescription = null, // Provide a content description if necessary
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            alignment = Alignment.Center
        )
        InputField(
            value = email,
            onValueChange = { email = it },
            label = "Email"
        )
        InputField(
            value = password,
            onValueChange = { password = it },
            label = "Passowrd"
        )


        Text(
            text = "Forgot Password?",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
                .clickable { /* Handle forgot password click */ },
            color = Color.DarkGray,
            textAlign = TextAlign.End
        )

        // Login button
        Button(
            onClick = { onLogin() },
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
        ) {
            Text(
                text = "Login",
                color = Color.White
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "New member?",
                color = Color.Black
            )
            Text(
                text = " Register ",
                color = Color.Gray // Change color as needed
            )
            Text(
                text = " here.",
                color = Color.Black
            )
        }
    }
}

