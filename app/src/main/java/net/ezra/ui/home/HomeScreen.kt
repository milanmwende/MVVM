package net.ezra.ui.home


import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import net.ezra.navigation.ROUTE_COURSES
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_MENTOR
import net.ezra.navigation.ROUTE_PROFILE
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_SIGNUP
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController) {





    Scaffold(
        bottomBar = { BottomBar(navController = navController)},
        content = {

            Column(
                modifier = Modifier
                    .fillMaxSize(),
            ) {
                LazyColumn {
                    item {

                        Column (modifier = Modifier
                            .padding(10.dp)
                        ){
                            Row {
                                Column {
                                    Text(text = "Hi, Milan!",
                                        fontWeight =  FontWeight.ExtraBold)

                                    Text(text = "What do you want to learn today?",
                                        fontWeight = FontWeight.Thin)


                                }

                                AsyncImage(
                                    model = "https://i.pinimg.com/736x/67/24/6c/67246c540cef5ddc27ff4c11b6223e84.jpg",
                                    contentDescription = null,

                                    modifier = Modifier
                                        .width(50.dp)
                                        .height(50.dp)
                                )


                            }
                            Spacer(modifier = Modifier
                                .height(15.dp)
                            )
                            Row {

                                var search by remember { mutableStateOf(TextFieldValue("")) }
                                OutlinedTextField(
                                    value = search,
        leadingIcon = { Icon(imageVector = Icons.Default.Search,
            contentDescription = "emailIcon") },
//        trailingIcon = { Icon(imageVector = Icons.AutoMirrored.Filled., contentDescription = null) },
                                    onValueChange = {
                                        search = it
                                    },
                                    placeholder = { Text(text = "Search...") },

                                    modifier = Modifier
                                        .height(10.dp)
                                        .fillMaxWidth()

                                )

                            }
                            Spacer(modifier = Modifier
                                .height(15.dp)
                            )
                            Row {
                                Column (

                                ){
                                    Text(text = "Categories",
                                        fontWeight = FontWeight.Bold
                                    )
                                }

                                Spacer(modifier = Modifier
                                    .width(250.dp)
                                )
                                Column {

                                    Text("View all", modifier = Modifier

                                        .clickable {
                                            navController.navigate(ROUTE_COURSES) {
                                                popUpTo(ROUTE_HOME) { inclusive = true }
                                            }
                                        })
                                }

                            }

                        }
                        Spacer(modifier = Modifier
                            .height(30.dp)
                        )
                        Row (
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                        ){
                            Column {
                                Card(
                                    modifier = Modifier
                                        .height(70.dp)
                                        .clickable {
                                            navController.navigate(ROUTE_COURSES) {
                                                popUpTo(ROUTE_HOME) { inclusive = true }
                                            }
                                        }
                                        .width(150.dp),
                                    colors = CardDefaults.cardColors(Color(0xffd1f9f4))



                                ){
                                    Button(onClick = { navController.navigate(ROUTE_SIGNUP) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }},
                                        colors = ButtonDefaults.buttonColors(Color(0xffd1f9f4))

                                    ) {
                                        Text(text = "Data Science",
                                            color = Color.Black)
                                    }







                                }}

                            Spacer(modifier = Modifier.width(25.dp))

                            Column {


                                Card(
                                    modifier = Modifier
                                        .height(70.dp)
                                        .clickable {
                                            navController.navigate(ROUTE_COURSES) {
                                                popUpTo(ROUTE_HOME) { inclusive = true }
                                            }
                                        }
                                        .width(150.dp)
                                    ,

                                    colors = CardDefaults.cardColors(Color(0xffd1e5f9))

                                ) {


                                    Text( "Data Science",
                                        modifier = Modifier
                                            .padding(20.dp)
                                    )

                                }



                            }

                        }
                        Spacer(modifier = Modifier
                            .height(10.dp)

                        )

                        Row (
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                        ){
                            Column {
                                Card(
                                    modifier = Modifier
                                        .height(70.dp)
                                        .clickable {
                                            navController.navigate(ROUTE_COURSES) {
                                                popUpTo(ROUTE_HOME) { inclusive = true }
                                            }
                                        }
                                        .width(150.dp),
                                    colors = CardDefaults.cardColors(Color(0xffd1e5f9))

                                ){
                                    Text(text = "Cyber Security",

                                        modifier = Modifier
                                            .padding(20.dp)
                                    )

                                }}

                            Spacer(modifier = Modifier.width(25.dp))

                            Column {
                                Card(
                                    modifier = Modifier
                                        .height(70.dp)
                                        .clickable {
                                            navController.navigate(ROUTE_COURSES) {
                                                popUpTo(ROUTE_HOME) { inclusive = true }
                                            }
                                        }
                                        .width(150.dp),

                                    colors = CardDefaults.cardColors(Color(0xffdcd1f9))
                                ){

                                    Column {
                                        Text(text = "Full-Stack Development",
                                            modifier = Modifier
                                                .padding(20.dp)

                                        )

                                    }

                                }
                            }

                        }
                        Spacer(modifier = Modifier
                            .height(30.dp)
                        )
                        Row (horizontalArrangement = Arrangement.SpaceBetween){

                            Text(text = "Recommended", fontWeight = FontWeight.Bold)
                            Spacer(modifier = Modifier
                                .width(230.dp)
                            )

                            SelectionContainer {
                                Text("View all")
                            }

                        }
                        Spacer(modifier = Modifier
                            .height(20.dp)
                        )
                        Row(
                        ) {
                            Column(modifier = Modifier
                                .fillMaxWidth()


                            ) {
                                Card (

//                                    colors = CardDefaults.cardColors(Color(0xffbfa2f4))
                                     modifier = Modifier
                                        .height(260.dp)
                                        .clickable {
                                            navController.navigate(ROUTE_COURSES) {
                                                popUpTo(ROUTE_HOME) { inclusive = true }
                                            }
                                        }
                                        .fillMaxWidth(),



                                    ){
                                   Box {

                                       androidx.compose.foundation.Image(
                                           painter = painterResource(id = R.drawable.code) ,
                                           contentDescription = "",
                                           modifier = Modifier.fillMaxSize(),
                                           contentScale = ContentScale.Crop

                                       )

                                       Text(text = "Introduction to PhP",
                                           fontWeight = FontWeight.ExtraBold ,
                                           fontSize = 30.sp,
                                           modifier = Modifier
                                               .padding(50.dp),
                                           fontFamily = FontFamily.Monospace



                                       )
                                   }
                                }
                            }

                        }










                    }





                }


            }




        })





        }


@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp) {
        BottomNavigationItem(icon = {
                                    Icons.Default.Home

        },
            label = { Text(text = "Home") }, selected = (selectedIndex.value == 0), onClick = {
                navController.navigate(ROUTE_COURSES) {
                popUpTo(ROUTE_HOME) { inclusive = true }
            }
                selectedIndex.value = 0
            })
        BottomNavigationItem(icon = {
            Icons.Default.Favorite
        },
            label = { Text(text = "Favorite") }, selected = (selectedIndex.value == 1), onClick = {
                navController.navigate(ROUTE_COURSES) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }
                selectedIndex.value = 1
            })
        BottomNavigationItem(icon = {
            Icons.Default.Person
        },
            label = { Text(text = "Profile") }, selected = (selectedIndex.value == 2), onClick = {
                navController.navigate(ROUTE_COURSES) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }
                selectedIndex.value = 2
            })
    }
}































@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

