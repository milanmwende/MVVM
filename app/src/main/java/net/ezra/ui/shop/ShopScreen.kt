package net.ezra.ui.shop


import android.content.Intent
import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.MainActivity
import net.ezra.R
import net.ezra.navigation.ROUTE_COURSES
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.ui.theme.AppTheme



@Composable
fun ShopScreen(navController: NavHostController) {


    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {


//            Box(modifier = Modifier
//                .fillMaxSize(),
//            ){
//                Image(painter = painterResource
//                    (id = R.drawable.ic_app_logo),
//                    contentDescription = "Impala Shop",
//                    modifier = Modifier
//                        .fillMaxSize()
////                .clip(CircleShape)
//                    ,
//                    contentScale = ContentScale.Fit
//                )
//
//                Column(
////                horizontalAlignment = Alignment.CenterHorizontally,
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(10.dp),
//                ) {
//
//                    Row(
//                        horizontalArrangement = Arrangement.SpaceEvenly,
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .background(color = Color.Cyan)
//                    ) {
//                        Image(imageVector = Icons.Default.Home, contentDescription = "")
//                        Text ("IMPALA SHOPPING MALL ")
//                        Image(imageVector = Icons.Default.Menu, contentDescription = "")
//                    }
//                    Spacer(modifier = Modifier.height(20.dp))
//                    Row(
//                        horizontalArrangement = Arrangement.SpaceEvenly,
//                        modifier = Modifier
//                            .fillMaxSize()
//                    ) {
//                        val hotel = LocalContext.current
//                        Button(
//                            onClick = {hotel.startActivity(Intent(hotel, MainActivity::class.java))},
//                            shape = RoundedCornerShape(10.dp),
//                            colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
//                            border = BorderStroke(1.5.dp, Color.LightGray),
//                            contentPadding = PaddingValues(15.dp),
//                            modifier = Modifier
//                                .height(50.dp)
//                                .width(150.dp)
//                        ){
//                            Image(imageVector = Icons.Default.Home, contentDescription = "")
//
//                            Text("Hotels", color = Color.Black)
//                        }
//
//
//
//                        val holiday = LocalContext.current
//                        Button(
//                            onClick = {holiday.startActivity(Intent(holiday, MainActivity::class.java))},
//                            shape = RoundedCornerShape(10.dp),
//                            colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
//                            border = BorderStroke(1.5.dp, Color.LightGray),
//                            contentPadding = PaddingValues(15.dp),
//                            modifier = Modifier
//                                .height(50.dp)
//                                .width(150.dp)
//
//                        ){
//                            Image(imageVector = Icons.Default.Home, contentDescription = "")
//                            Text("Holiday", color = Color.Black)
//                        }
//                    }
//
//                    Spacer(modifier = Modifier.height(10.dp))
//
//                    Row(
//                        horizontalArrangement = Arrangement.SpaceEvenly,
//                        modifier = Modifier
//                            .fillMaxSize()
//                    ) {
//                        val taxi = LocalContext.current
//                        Button(
//                            onClick = {taxi.startActivity(Intent(taxi, MainActivity::class.java))},
//                            shape = RoundedCornerShape(10.dp),
//                            colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
//                            border = BorderStroke(1.5.dp, Color.LightGray),
//                            modifier = Modifier
//                                .height(50.dp)
//                                .width(150.dp)
//                        ){
//                            Image(imageVector = Icons.Default.Home, contentDescription = "")
//                            Text("Taxi", color = Color.Black)
//                        }
//
//
//
//                        val ticket = LocalContext.current
//                        Button(
//                            onClick = {ticket.startActivity(Intent(ticket, MainActivity::class.java))},
//                            shape = RoundedCornerShape(10.dp),
//                            colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
//                            border = BorderStroke(1.5.dp, Color.LightGray),
//                            modifier = Modifier
//                                .height(50.dp)
//                                .width(150.dp)
//                        ){
//                            Image(imageVector = Icons.Default.Home, contentDescription = "")
//                            Text("Ticket", color = Color.Black)
//                        }
//                    }
//
//                    Spacer(modifier = Modifier.height(10.dp))
//
//                    Row(
//                        horizontalArrangement = Arrangement.SpaceEvenly,
//                        modifier = Modifier
//                            .fillMaxSize()
//                    ) {
//                        val airplane = LocalContext.current
//                        Button(
//                            onClick = {airplane.startActivity(Intent(airplane, MainActivity::class.java))},
//                            shape = RoundedCornerShape(10.dp),
//                            colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
//                            border = BorderStroke(1.5.dp, Color.LightGray),
//                            modifier = Modifier
//                                .height(50.dp)
//                                .width(150.dp)
//                        ){
//                            Image(imageVector = Icons.Default.Home, contentDescription = "")
//                            Text("Airplane", color = Color.Black)
//                        }
//
//
//
//                        val harbour = LocalContext.current
//                        Button(
//                            onClick = {harbour.startActivity(Intent(harbour, MainActivity::class.java))},
//                            shape = RoundedCornerShape(10.dp),
//                            colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
//                            border = BorderStroke(1.5.dp, Color.LightGray),
//                            modifier = Modifier
//                                .height(50.dp)
//                                .width(150.dp)
//                        ){
//                            Image(imageVector = Icons.Default.Home, contentDescription = "")
//                            Text("Harbour", color = Color.Black)
//                        }
//                    }
//
//                    Spacer(modifier = Modifier.height(20.dp))
//
//                    Row(
//                        horizontalArrangement = Arrangement.Absolute.SpaceEvenly,
//                        modifier = Modifier
//                            .fillMaxSize()
//                    ) {
//                        Text(text = "Popular in Town", textAlign = TextAlign.Justify)
//
//                        Text(text = "View all", color = Color.Blue, textAlign = TextAlign.End)
//                    }
//                    Spacer(modifier = Modifier.height(20.dp))

            Row() {

                Card(
                    elevation = CardDefaults.cardElevation(100.dp),
                    border = BorderStroke(1.5.dp, color = Color.Black),
                    modifier = Modifier
                        .padding(10.dp)
                        .size(150.dp)


                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_9),
                        contentDescription = "Bible"
                    )
                    Row(
                        modifier = Modifier
                            .padding(0.dp)
                            .fillMaxWidth(),


                        ) {
                        Text(
                            text = "Bible",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Card(
                    elevation = CardDefaults.cardElevation(100.dp),
                    border = BorderStroke(1.5.dp, color = Color.Black),
                    modifier = Modifier
                        .padding(10.dp)
                        .size(150.dp)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_8),
                        contentDescription = "Tanah Lot", modifier = Modifier
                            .padding(17.dp)
                    )

                    Row(
                        modifier = Modifier
                            .padding(0.dp),
//                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "T-shirt", fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.Black,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row() {

                Card(
                    elevation = CardDefaults.cardElevation(100.dp),
                    border = BorderStroke(1.5.dp, color = Color.Black),
                    modifier = Modifier
                        .padding(10.dp)
                        .size(150.dp)


                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_7),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(17.dp)
                    )
                    Row(
                        modifier = Modifier
                            .padding(0.dp)
                    ) {
                        Text(
                            text = "Calendars",
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.fillMaxWidth().padding(7.dp)
                        )


                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Card(
                    elevation = CardDefaults.cardElevation(100.dp),
                    border = BorderStroke(1.5.dp, color = Color.Black),
                    modifier = Modifier
                        .padding(10.dp)
                        .size(150.dp)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_app_logo),
                        contentDescription = ""
                    )
                    Row(
                        modifier = Modifier
                            .padding(0.dp)
                    ) {
                        Text(text = " Notebook")
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))



            Row() {

                Card(
                    elevation = CardDefaults.cardElevation(100.dp),
                    border = BorderStroke(1.5.dp, color = Color.Black),
                    modifier = Modifier
                        .padding(10.dp)
                        .size(150.dp)


                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_app_logo),
                        contentDescription = "Nusa Penida"
                    )
                    Row(
                        modifier = Modifier
                            .padding(0.dp)
                    ) {
                        Text(text = "Books")
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Card(
                    elevation = CardDefaults.cardElevation(100.dp),
                    border = BorderStroke(1.5.dp, color = Color.Black),
                    modifier = Modifier
                        .padding(10.dp)
                        .size(150.dp)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_app_logo),
                        contentDescription = "Tanah Lot"
                    )
                    Row(
                        modifier = Modifier
                            .padding(0.dp)
                    ) {
                        Text(text = "Pens")
                    }
                }
            }
            Spacer(modifier = Modifier.height(5.dp))


        }


    }
}
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ShopScreen(rememberNavController())
}

