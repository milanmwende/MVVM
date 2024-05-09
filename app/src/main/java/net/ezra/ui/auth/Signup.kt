package net.ezra.ui.auth

import android.content.Intent
import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.MainActivity
import net.ezra.R
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.ui.theme.AppTheme
import net.ezra.ui.theme.spacing

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen(navController: NavHostController) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)

    )


    {
        var password by remember { mutableStateOf(TextFieldValue("")) }
        OutlinedTextField(value = password,
            onValueChange = { password = it },

            label = { Text(text = "Search Groups...") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),

            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") }
        )

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            colors = CardDefaults.cardColors(Color.White)

        ) {
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = "" , modifier = Modifier.size(25.dp))
            Spacer(modifier = Modifier.width(10.dp))



            Spacer(modifier = Modifier.height(20.dp))


            Text(
                text = "John's Small Group",
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "All Members",
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.width(15.dp))
            val login = LocalContext.current
            Button(onClick = {


                login.startActivity(Intent(login, MainActivity::class.java))

            }, modifier = Modifier, colors = ButtonDefaults.buttonColors(Color.Black)) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "")


                Text(text = "Request to join", color = Color.White)


            }
            Spacer(modifier = Modifier.height(10.dp))


        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            colors = CardDefaults.cardColors(Color.White)


        ) {
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = "" , modifier = Modifier.size(25.dp))


            Spacer(modifier = Modifier.height(20.dp))


            Text(
                text = "Philip Volunteers",
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "All Members",
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.width(15.dp))
            val login = LocalContext.current
            Button(onClick = {


                login.startActivity(Intent(login, MainActivity::class.java))

            }, modifier = Modifier, colors = ButtonDefaults.buttonColors(Color.Black)) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "")


                Text(text = "Request to join", color = Color.White)


            }


        }


        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            colors = CardDefaults.cardColors(Color.White)

        ) {
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = "" , modifier = Modifier.size(25.dp))


            Spacer(modifier = Modifier.height(20.dp))


            Text(
                text = "Anne's  Group",
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "All Members",
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.width(15.dp))
            val login = LocalContext.current
            Button(onClick = {


                login.startActivity(Intent(login, MainActivity::class.java))

            }, modifier = Modifier, colors = ButtonDefaults.buttonColors(Color.Black)) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "")


                Text(text = "Request to join", color = Color.White)


            }

        }



        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
                    colors = CardDefaults.cardColors(Color.White)

        ) {
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = "" , modifier = Modifier.size(25.dp))


            Spacer(modifier = Modifier.height(20.dp))


            Text(
                text = "Anne's Group",
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "All Members",
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.width(15.dp))
            val login = LocalContext.current
            Button(onClick = {


                login.startActivity(Intent(login, MainActivity::class.java))

            }, modifier = Modifier, colors = ButtonDefaults.buttonColors(Color.Black)) {
                Icon(imageVector = Icons.Default.Add, contentDescription = ""  )



                Text(text = "Request to join", color = Color.White)


            }

        }


        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            colors = CardDefaults.cardColors(Color.White)

        ) {
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = "" , modifier = Modifier.size(25.dp))


            Spacer(modifier = Modifier.height(20.dp))


            Text(
                text = "Maxwell's Group",
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "All Members",
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.width(15.dp))
            val login = LocalContext.current
            Button(onClick = {


                login.startActivity(Intent(login, MainActivity::class.java))

            }, modifier = Modifier,  colors = ButtonDefaults.buttonColors(Color.Black)) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "")


                Text(text = "Request to join", color = Color.White)


            }

        }
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun SignupScreenPreviewLight() {
    SignupScreen(rememberNavController())
}

