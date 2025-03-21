package com.example.counterapp

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Minimize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CounterScreen(viewModel: CounterViewModel = viewModel()){
    Box(
        modifier = Modifier.fillMaxSize().background(Color(0xFF6f6bfe)),
        contentAlignment = Alignment.Center
    ){
        Box(
        modifier = Modifier
            .size(height = 100.dp, width = 280.dp)
            .clip(RoundedCornerShape(50.dp))
            .background(Color(0xFF9198fe)),
        ){
            // Add Icon
            IconButton (onClick = {Log.d("Sd","Sd")},
                modifier = Modifier.size(80.dp).align(Alignment.CenterStart),
                colors = IconButtonDefaults.iconButtonColors(
                contentColor = Color.White,)

            ) {
            Icon(Icons.Filled.Add,
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp),

            )
            }


            //Minus Icon
            IconButton (onClick = {Log.d("Sd","Sd")},
                modifier = Modifier.size(80.dp).align(Alignment.CenterEnd),
                colors = IconButtonDefaults.iconButtonColors(
                    contentColor = Color.White,)

            ) {
                Icon(Icons.Filled.Minimize,
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                        .offset(y = (-17).dp)
                )
            }
        }
    }
}