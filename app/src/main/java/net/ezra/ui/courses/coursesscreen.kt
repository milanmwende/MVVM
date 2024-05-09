package net.ezra.ui.courses

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage


@Composable
fun AboutScreen(navController: NavHostController) {

LazyColumn {
item { Column (modifier = Modifier
    .fillMaxSize()
    .padding(20.dp)

){

    Row (modifier = Modifier.padding(start = 0.dp)){
        Column {
            Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "" )

        }
        Column(modifier = Modifier.padding(start = 1.dp, top = 3.dp)) {
            Text(text = "Courses",
                fontWeight = FontWeight.Bold
            )
        }

    }
    Spacer(modifier = Modifier.height(20.dp))
    Row {
        var search by remember { mutableStateOf(TextFieldValue("")) }
        OutlinedTextField(
            value = search,
//        leadingIcon = { Icon(imageVector = Icons.Default.Search,
//            contentDescription = "emailIcon") },
            trailingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = null) },
            onValueChange = {
                search = it
            },
            placeholder = { Text(text = "Search Course...", color = Color.Black) },
            modifier = Modifier
                .height(5.dp)
                .padding(start = 2.dp)

        )
    }
    Spacer(modifier = Modifier.height(30.dp))

Row(horizontalArrangement = Arrangement.Center) {
    Card (modifier = Modifier
        .height(100.dp)
        .width(70.dp)
        .clickable {  }

        ,
        colors = CardDefaults.cardColors(Color(0xfff3faba))

        ){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "HTML", textAlign = TextAlign.Center)
        }
    }

Spacer(modifier = Modifier
    .width(20.dp)

)

    Card (modifier = Modifier
        .height(100.dp)
        .width(80.dp)
        .clickable {  },
        colors = CardDefaults.cardColors(Color(0xfff6b3d6))

    ){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Python", textAlign = TextAlign.Center)
        }
    }
}
Spacer(modifier = Modifier
    .height(10.dp)

)

    Row(horizontalArrangement = Arrangement.Center) {
        Card (modifier = Modifier
            .height(100.dp)
            .width(70.dp)
            .clickable {  },
            colors = CardDefaults.cardColors(Color(0xfff6e2a0))

        ){
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "PhP", textAlign = TextAlign.Center)
            }
        }

        Spacer(modifier = Modifier
            .width(20.dp)

        )

        Card (modifier = Modifier
            .height(100.dp)
            .width(80.dp)
            .clickable {  },

            colors = CardDefaults.cardColors(Color(0xfff7b8aa))

        ){
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Data Science", textAlign = TextAlign.Center)
            }
        }
    }



























































} }
}




}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    AboutScreen(rememberNavController())
}

