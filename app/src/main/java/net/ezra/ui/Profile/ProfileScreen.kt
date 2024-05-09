package net.ezra.ui.Profile

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_COURSES
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_PROFILE

@Composable
fun EveningScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .padding(top = 10.dp)

    ){
       Row {
           Column {
               Text(text = "PROFILE PHOTO")
               
           }
           Spacer(modifier = Modifier
               .width(80.dp)
           )
           
           Column {
               Row {
                   Text(text = "Milan Mwende", fontWeight = FontWeight.Bold)
               }
               Row {
                   
                   Text(text = "Milanmwende@gmail.com")
               }
               
               Row {
                   Button(onClick = { /*TODO*/ }) {
                       Text(text = "Edit Profile")
                   }
               }
               
               
               
               
           }
           
       }
        
        Spacer(modifier = Modifier
            .height(10.dp)
        )
      Row {
          Text(text = "Courses Complete", fontWeight = FontWeight.Bold)
Spacer(modifier = Modifier
    .width(200.dp)
)
          Text(text = "See all",Modifier.clickable {  })
      }
        Spacer(modifier = Modifier
            .height(10.dp)

        )
        
  Row {
      Card (modifier = Modifier
          .height(100.dp)
          .width(400.dp)


      ){



      }


  }
        
        
        
        
        
        
        
        
        
        
        
        



    }

}









@Composable
fun BottomBar() {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp) {
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"")
        },
            label = { androidx.compose.material.Text(text = "Home" ) }, selected = (selectedIndex.value == 0), onClick = {
                selectedIndex.value = 0
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite,"")
        },
            label = { androidx.compose.material.Text(text = "Courses",
                ) }, selected = (selectedIndex.value == 1), onClick = {
                selectedIndex.value = 1
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "")
        },
            label = { androidx.compose.material.Text(text = "Profile",
               ) }, selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
            })
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    EveningScreen(rememberNavController())
}

