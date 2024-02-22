import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.blooddonationsfrontend.R
import com.example.blooddonationsfrontend.composable.InputField

@Composable
fun ForgotPasswordScreen(navController: NavController) {

    var email by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(7.dp)
            .padding(top = 10.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.bloodtest),
            contentDescription = "image",
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

//        TextInputLayout(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 7.dp)
//        ) {
//            TextField(
//                modifier = Modifier.fillMaxWidth(),
//                value = "", // Pass the value of email field here
//                onValueChange = {}, // Pass the value change listener here
//                label = { Text(text = stringResource(id = R.string.enter_email)) },
//                keyboardOptions = KeyboardOptions.Default.copy(
//                    keyboardType = KeyboardType.Email,
//                    imeAction = ImeAction.Done
//                ),
//                keyboardActions = KeyboardActions(onDone = { /* Perform action when done button is clicked */ })
//            )
//        }

        Button(
            onClick = { /* Handle forgot password button click */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
        ) {
            Text(
                text = stringResource(id = R.string.forgot_password),
                color = Color.Black
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(7.dp)
                .padding(top = 7.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { /* Handle go back button click */ },
                modifier = Modifier.height(40.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.go_back),
                    color = Color.Black
                )
            }
        }
    }
}

