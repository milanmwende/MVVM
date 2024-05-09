package net.ezra.ui.mit

import android.content.Intent
import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.MainActivity
import net.ezra.navigation.ROUTE_COURSES
import net.ezra.navigation.ROUTE_HOME
import net.ezra.ui.theme.AppTheme
import net.ezra.R



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MitScreen(navController: NavHostController) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
            ) {

                Card(
                    elevation = CardDefaults.cardElevation(100.dp),
                    border = BorderStroke(1.5.dp, color = Color.Black
                    )
                ) {
                    Image(painter = painterResource(id = R.drawable.ic_app_logo), contentDescription = "")
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                    ) {
                        Text(text = "Impala")
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(text = "Impala design")

                    }
                }
                Spacer(modifier = Modifier.width(5.dp))


                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    item {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(10.dp),
                        ) {

                            Card(
                                elevation = CardDefaults.cardElevation(100.dp),
                                border = BorderStroke(1.5.dp, color = Color.Black
                                )
                            ) {
                                Image(painter = painterResource(id = R.drawable.logo), contentDescription = "")
                                Row(
                                    modifier = Modifier
                                        .padding(10.dp)
                                ) {
                                    Text(text = "Impala")
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Text(text = "Impala design")

                                }
                            }

                        }
                    }
                }

            }
        }
    }


}
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    MitScreen(rememberNavController())
}

