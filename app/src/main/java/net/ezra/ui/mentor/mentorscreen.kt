package net.ezra.ui.mentor


import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage


@Composable
fun ContactScreen(navController: NavHostController) {
   LazyColumn {
       item {
           Column (modifier = Modifier.fillMaxSize()){
               Row (modifier = Modifier.padding(start =10.dp)){
                   Column {
                       Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "" )

                   }
                   Column(modifier = Modifier.padding(start = 10.dp, top = 3.dp)) {
                       Text(text = "Mentor",
                           fontWeight = FontWeight.Bold
                       )
                   }

               }
           }
Spacer(modifier = Modifier
    .height(20.dp)
)

           var search by remember { mutableStateOf(TextFieldValue("")) }
           OutlinedTextField(
               value = search,
               leadingIcon = { Icon(imageVector = Icons.Default.Search,
                   contentDescription = "emailIcon") },
               //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
               onValueChange = {
                   search = it
               },
               placeholder = { Text(text = "Search Mentor", color = Color.Black) },
               modifier = Modifier
                   .height(10.dp)

           )
Spacer(modifier = Modifier
    .height(20.dp)
)
LazyRow {
    item { 
        Card (modifier = Modifier
            .height(20.dp)
            .width(70.dp)
            .clickable { }

        ){
Text(text = "PhP",
    textAlign = TextAlign.Center,
    modifier = Modifier
        .padding(start = 10.dp)

)
        }
        Spacer(modifier = Modifier
            .width(10.dp)
        )

        Card (modifier = Modifier
            .height(20.dp)
            .width(70.dp)
            .clickable { }

        ){
            Text(text = "Python",
                textAlign = TextAlign.Center,
                modifier = Modifier
                .padding(start = 10.dp))
        }
        Spacer(modifier = Modifier
            .width(10.dp)
        )

        Card (modifier = Modifier
            .height(20.dp)
            .width(50.dp)
            .clickable { }

        ){
            Text(text = "HTML",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(start = 10.dp)
                )
        }
        Spacer(modifier = Modifier
            .width(10.dp)
        )

        Card (modifier = Modifier
            .height(20.dp)
            .width(70.dp)
            .clickable { }

        ){
            Text(text = "Cyber Security", textAlign = TextAlign.Center)
        }
        Spacer(modifier = Modifier
            .width(10.dp)
        )




    }
}
Spacer(modifier = Modifier
    .height(20.dp)
)
Column (){

    Row(modifier = Modifier
    .padding(start = 10.dp),
        
//        horizontalArrangement = Arrangement.SpaceBetween
) {
    Card (modifier = Modifier
        .height(40.dp)
    ){
//        Column {
//            AsyncImage(
//                model = "data:image/png;base64,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",
//                contentDescription = null,
//            )
//        }
        Row {
            Column (modifier = Modifier
                .padding(start = 10.dp, top = 7.dp)

            ){
                Text(text = "Daniel Levi",
                    color = Color.Black
                )
            }

            Spacer(modifier = Modifier
                .width(200.dp)
            )

            Icon(imageVector = Icons.Default.Send, contentDescription = "",modifier = Modifier
                .padding(top = 5.dp, end = 10.dp))

        }
        Row {
            Text(text = "Web development",
                fontWeight = FontWeight.Light,
                fontSize = 10.sp,
                modifier = Modifier
                    .padding(start = 10.dp)

            )
        }






    }
//        BottomAppBar {
//            BottomNavigationItem(selected = , onClick = { /*TODO*/ }, icon = { /*TODO*/ })
//
//
//        }


    }









           }

Spacer(modifier = Modifier
    .height(10.dp)

)


           Card (modifier = Modifier
               .height(40.dp)
               .padding(start = 10.dp)
           ){
//        Column {
//            AsyncImage(
//                model = "data:image/png;base64,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",
//                contentDescription = null,
//            )
//        }
               Row {
                   Column (modifier = Modifier
                       .padding(start = 10.dp, top = 7.dp)

                   ){
                       Text(text = "Daniel Levi",
                           color = Color.Black
                       )
                   }

                   Spacer(modifier = Modifier
                       .width(200.dp)
                   )

                   Icon(imageVector = Icons.Default.Send, contentDescription = "",modifier = Modifier
                       .padding(top = 5.dp, end = 10.dp))

               }
               Row {
                   Text(text = "Web development",
                       fontWeight = FontWeight.Light,
                       fontSize = 10.sp,
                       modifier = Modifier
                           .padding(start = 10.dp)

                   )
               }






           }




           Spacer(modifier = Modifier
               .height(10.dp)

           )


           Card (modifier = Modifier
               .height(40.dp)
               .padding(start = 10.dp)
           ){
//        Column {
//            AsyncImage(
//                model = "data:image/png;base64,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",
//                contentDescription = null,
//            )
//        }
               Row {
                   Column (modifier = Modifier
                       .padding(start = 10.dp, top = 7.dp)

                   ){
                       Text(text = "Daniel Levi",
                           color = Color.Black
                       )
                   }

                   Spacer(modifier = Modifier
                       .width(200.dp)
                   )

                   Icon(imageVector = Icons.Default.Send, contentDescription = "",modifier = Modifier
                       .padding(top = 5.dp, end = 10.dp))

               }
               Row {
                   Text(text = "Web development",
                       fontWeight = FontWeight.Light,
                       fontSize = 10.sp,
                       modifier = Modifier
                           .padding(start = 10.dp)

                   )
               }






           }



           Spacer(modifier = Modifier
               .height(10.dp)

           )


           Card (modifier = Modifier
               .height(40.dp)
               .padding(start = 10.dp)
           ){
//        Column {
//            AsyncImage(
//                model = "data:image/png;base64,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",
//                contentDescription = null,
//            )
//        }
               Row {
                   Column (modifier = Modifier
                       .padding(start = 10.dp, top = 7.dp)

                   ){
                       Text(text = "Daniel Levi",
                           color = Color.Black
                       )
                   }

                   Spacer(modifier = Modifier
                       .width(200.dp)
                   )

                   Icon(imageVector = Icons.Default.Send, contentDescription = "",modifier = Modifier
                       .padding(top = 5.dp, end = 10.dp))

               }
               Row {
                   Text(text = "Web development",
                       fontWeight = FontWeight.Light,
                       fontSize = 10.sp,
                       modifier = Modifier
                           .padding(start = 10.dp)

                   )
               }






           }




           Spacer(modifier = Modifier
               .height(10.dp)

           )


           Card (modifier = Modifier
               .height(40.dp)
               .padding(start = 10.dp)
           ){
//        Column {
//            AsyncImage(
//                model = "data:image/png;base64,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",
//                contentDescription = null,
//            )
//        }
               Row {
                   Column (modifier = Modifier
                       .padding(start = 10.dp, top = 7.dp)

                   ){
                       Text(text = "Daniel Levi",
                           color = Color.Black
                       )
                   }

                   Spacer(modifier = Modifier
                       .width(200.dp)
                   )

                   Icon(imageVector = Icons.Default.Send, contentDescription = "",modifier = Modifier
                       .padding(top = 5.dp, end = 10.dp))

               }
               Row {
                   Text(text = "Web development",
                       fontWeight = FontWeight.Light,
                       fontSize = 10.sp,
                       modifier = Modifier
                           .padding(start = 10.dp)

                   )
               }






           }







       }








































   }
   }


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ContactScreen(rememberNavController())
}

