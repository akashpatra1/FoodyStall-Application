package com.example.foodystall.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.lerp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.foodystall.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarDinningScreen(scrollBehavior: TopAppBarScrollBehavior,navController: NavController){
    val collapsedfraction=scrollBehavior.state.collapsedFraction
    val contentColor= lerp(
        Color.White,
        Color.Transparent,
        collapsedfraction
    )
    val contentAlpha=1f-collapsedfraction
    TopAppBar(
        title = {
            Column(modifier = Modifier.alpha(contentAlpha)) {
                Row (
                    modifier = Modifier.fillMaxWidth().height(22.dp)
                ){
                    Text(
                        text = "Home",
                        color = contentColor,
                        fontSize = 20.sp, fontWeight = FontWeight.Bold

                    )
                    Icon(
                        painter = painterResource(R.drawable.down_arrow),
                        modifier = Modifier.size(30.dp).padding(top=6.dp),
                        tint = contentColor,
                        contentDescription = "Down Arrow"

                    )
                }
                Text(text = "565, Shiv Vihar, Bahrampur, Shanti Nagar",
                    fontWeight = FontWeight.SemiBold,
                    color = contentColor,
                    fontSize = 15.sp
                    )
            }
        },
        actions = {
            IconButton(onClick = {
          //      navController.navigate(Routes.ProfileScreen)
            }) {
                Icon(painter = painterResource(R.drawable.profile),
                    tint = contentColor,
                    contentDescription = "Profile"
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent,

    ),
        scrollBehavior=scrollBehavior,
        modifier = Modifier.fillMaxWidth()
    )







}