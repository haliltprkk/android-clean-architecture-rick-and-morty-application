package com.haliltprkk.rickandmortyapplication.presentation.character_list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun CharacterListScreen(navController: NavController) {
    return Box(
        Modifier.fillMaxSize()
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center), text = "Hi There", style = TextStyle(
                fontSize = 24.sp, color = Color.DarkGray, fontWeight = FontWeight.Bold
            )
        )
    }
}