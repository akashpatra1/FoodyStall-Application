package com.example.foodystall.presentation.screen.CategoryScreen

import FiltersRow
import android.R
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.foodystall.presentation.components.HomeScreenCard
import java.nio.file.WatchEvent
import kotlin.math.E

@Composable
fun ChineeseCategoryScreen(navController: NavController) {
    ChineeseCategoryCards(navController)
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun ChineeseCategoryCards(navController: NavController) {
    val LazyListState = rememberLazyListState()
    val filters=listOf("Filter","Flase Sale","Under 30 mins","Rating","Schedule")


    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)

    ){
        FiltersRow(filters)
        Text(text = "RECOMMENDED FOR YOU",
           style = TextStyle(
               fontSize = 14.sp,
               color = Color.Gray,
               fontWeight = FontWeight.Normal,
               letterSpacing = 2.sp,
               fontFamily = FontFamily.SansSerif
           ),
            modifier = Modifier.padding(vertical = 16.dp)
                .padding(start = 10.dp),
            textAlign = TextAlign.Center

            )
        Spacer(modifier = Modifier.height(18.dp))
        Row(
            modifier = Modifier.padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.Start
        ) {
            Column (){
                Text(
                    text = "553 RESTAURANTS DELIVERING TO YOU",
                    modifier = Modifier,
                    color = Color.Gray
                )
                Text(
                    text = "Feature",
                    modifier = Modifier.padding(start = 5.dp),
                    color = Color.Gray
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        HomeScreenCard(navController=navController)
        Spacer(modifier = Modifier.height(16.dp))
        HomeScreenCard(navController)
        Spacer(modifier = Modifier.height(16.dp))
        HomeScreenCard(navController)
        Spacer(modifier = Modifier.height(16.dp))
    }
}
@Composable
fun CategoryCard(
    foodimagebacground1: Int,
    textblackone1: String,
    cardtextname1: String,
    timingtext1: String,
    timerimage1: Int,
    foodimagebacground2: Int,
    textblackone2: String,
    cardtextname2: String,
    timingtext2: String,
    timerimage2: Int,
){
    Column(
        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp)
            .background(Color.White)
    ) {
        Card(
            modifier = Modifier
                .width(140.dp)
                .height(100.dp)
                .padding(horizontal = 2.dp),
            shape = RoundedCornerShape(12.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)

        ) {
            Box(modifier = Modifier.fillMaxSize()){
                Image(
                    painter = painterResource(id=foodimagebacground1),
                    contentDescription = "Burger1",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop

                )
                Text(
                    text=textblackone1,
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(bottom = 8.dp)
                        .background(Color.Black.copy(alpha = 0.80f)),
                    color = Color.White,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold

                )
                Icon(
                    painter = painterResource(com.example.foodystall.R.drawable.outline_bookmark_24),
                    contentDescription = "bookmark",
                    modifier = Modifier
                        .size(30.dp)
                        .align(Alignment.TopEnd)
                        .padding(8.dp),
                    tint = Color.White
                )
            }

        }
        Column{
            Text(
                text=cardtextname1,
                modifier = Modifier.padding(start = 10.dp),
                fontSize = 14.sp,
                color = Color.Black,
                fontWeight = FontWeight.SemiBold
            )
            Row (
                modifier = Modifier.padding(start = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(
                    painter = painterResource(id = com.example.foodystall.R.drawable.timer),
                    contentDescription = "timer",
                    modifier = Modifier.size(14.dp),
                    tint = Color.Green

                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text=timingtext1,
                    fontSize = 12.sp,
                    color = Color.Gray
                )

            }
        }
        Spacer(modifier = Modifier.height(14.dp))
       Card(
           modifier = Modifier
               .width(140.dp)
               .height(100.dp)
               .padding(horizontal = 2.dp),
           shape = RoundedCornerShape(12.dp),
           elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)

       ) {
           Box(
               modifier = Modifier.fillMaxSize()
           ) {
               Image(
                   painter = painterResource(id=foodimagebacground2),
                   contentDescription = "Burger",
                   modifier = Modifier.fillMaxSize(),
                   contentScale = ContentScale.Crop
               )
               Text(
                   text=textblackone2,
                   modifier = Modifier
                       .align(Alignment.BottomStart)
                       .padding(bottom = 8.dp)
                       .background(Color.Black.copy(alpha = 0.80f)),
                   color = Color.White,
                   fontSize = 10.sp,
                   fontWeight = FontWeight.SemiBold
               )
               Icon(
                   painter = painterResource(com.example.foodystall.R.drawable.outline_bookmark_24),
                   contentDescription = "bookmark",
                   modifier = Modifier
                       .size(30.dp)
                       .align(Alignment.TopEnd)
                       .padding(8.dp),
                   tint = Color.White

               )
           }
       }
        Column {
            Text(
                text=cardtextname2,
                modifier = Modifier.padding(start = 10.dp),
                fontSize = 14.sp,
                color = Color.Black,
                fontWeight = FontWeight.SemiBold

            )
            Row (
                modifier = Modifier.padding(start = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(
                    painter = painterResource(id = timerimage2),
                    contentDescription = "timer",
                    tint = Color.Green
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text=timingtext2,
                    fontSize = 12.sp,
                    color = Color.LightGray

                )
            }
        }

    }




}




















