package com.example.counterapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Minimize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CounterScreen(){
    var count  by remember { mutableStateOf(0) }

    fun inc(){
        if(count<1000)  count += 1
    }

    fun dec(){
        if(count>0) count-=1
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF6f6bfe)),
        contentAlignment = Alignment.Center
    ){
        Box(
        modifier = Modifier
            .size(height = 100.dp, width = 280.dp)
            .clip(RoundedCornerShape(50.dp))
            .background(Color(0xFF9198fe)),
        ){
            // Add Icon
            IconButton (onClick = {inc()},
                modifier = Modifier
                    .size(80.dp)
                    .align(Alignment.CenterStart),
                colors = IconButtonDefaults.iconButtonColors(
                contentColor = Color.White,)

            ) {
            Icon(Icons.Filled.Add,
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp),

            )
            }

            Card(
                modifier = Modifier.align(Alignment.Center).size(100.dp),
                shape= CircleShape,
                elevation= CardDefaults.cardElevation(40.dp)
                , colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Box( // Wrap Text in a Box
                    modifier = Modifier.fillMaxSize(), // Fill the entire Card
                    contentAlignment = Alignment.Center // Center the Text inside
                ) {
                    Text("$count", fontSize = 50.sp, color = Color(0xFF6f6bfe))
                }
            }

            //Minus Icon
            IconButton (onClick = {dec()},
                modifier = Modifier
                    .size(80.dp)
                    .align(Alignment.CenterEnd),
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