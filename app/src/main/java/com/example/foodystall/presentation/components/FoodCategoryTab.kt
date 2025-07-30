package com.example.foodystall.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Tab
import androidx.compose.material.Text
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.foodystall.R
import com.example.foodystall.data.models.FoodCatagoryData

@Composable
fun FoodCategoryTabs(
    modifier: Modifier,
    selectedTabIndex: Int,
    onTabSelected:(Int)-> Unit
){
    val categories=listOf(
        FoodCatagoryData("All", R.drawable.allfood),
                FoodCatagoryData("Pizza", R.drawable.pizza_image),
        FoodCatagoryData("Chinese", R.drawable.chinese),
        FoodCatagoryData("Burgers", R.drawable.burger),
        FoodCatagoryData("Biryani", R.drawable.vegbiryani),
        FoodCatagoryData("Sweets", R.drawable.sweets),
        FoodCatagoryData("Pasta", R.drawable.pasta),
        FoodCatagoryData("Rolls", R.drawable.rolls),
        FoodCatagoryData("Ice Cream", R.drawable.ice_cream)
    )
    androidx.compose.material3.ScrollableTabRow(
        selectedTabIndex = selectedTabIndex,
        containerColor = Color.White,
        contentColor = Color.Black,
        edgePadding = 8.dp,
        indicator = {  tabPositions ->
            TabRowDefaults.Indicator(
                Modifier
                    .tabIndicatorOffset(tabPositions[selectedTabIndex])
                    .height(3.dp),
                color = Color.Red
            )

        },
        divider = {
            HorizontalDivider(color = Color.LightGray, thickness = 0.6.dp)
        }

    ){
        categories.forEachIndexed { index,category ->
            Tab(
                selected = selectedTabIndex ==index,
                onClick = {
                    onTabSelected(index)
                }
            ) {
                Column (
                    horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(8.dp)

                ){
                    AsyncImage(
                        model = category.image,
                        contentDescription = category.name,
                        modifier = Modifier.size(60.dp)

                    )
                    Text(
                        text = category.name,
                        fontSize = 12.sp,
                        fontWeight = if(selectedTabIndex==index) FontWeight.Bold else FontWeight.Normal,
                        color = if(selectedTabIndex==index) Color.Black else Color.DarkGray
                    )
                }
            }
        }
    }


}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FoodCategoryTabsPreview(){
    FoodCategoryTabs(
        modifier = Modifier,
        selectedTabIndex = 0,
        onTabSelected = {}
    )
}
