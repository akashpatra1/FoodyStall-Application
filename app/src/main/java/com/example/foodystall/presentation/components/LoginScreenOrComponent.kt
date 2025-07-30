package com.example.foodystall.presentation.components

import android.R
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CheckboxComponent(value: String){
    val context= LocalContext.current
    val checkState= remember{ mutableStateOf(false) }
    Row(
        modifier = Modifier.fillMaxWidth().heightIn(45.dp).padding(start = 16.dp, end = 16.dp)
    ) {
        Checkbox(checked = checkState.value,
            onCheckedChange = {
                checkState.value !=checkState.value
            },
            colors = CheckboxDefaults.colors(uncheckedColor = Color.Gray))
        Text(value, Modifier.padding(top = 11.dp), fontSize = 11.sp)
        Text("Term", Modifier.padding(start = 2.dp, top = 11.dp).clickable{
            Toast.makeText(context, "Terms and Conditions", Toast.LENGTH_SHORT).show()
        },
            fontSize = 11.sp, color = colorResource(R.color.holo_purple))
        Text("and", Modifier.padding(start = 2.dp, top = 11.dp, end = 2.dp), fontSize = 11.sp)
        Text("Conditions", Modifier.padding(top = 11.dp).clickable{
            Toast.makeText(context,"Terms and Conditions", Toast.LENGTH_SHORT).show()

        },
            fontSize =11.sp, color = colorResource(R.color.holo_purple)

        )

    }
}
