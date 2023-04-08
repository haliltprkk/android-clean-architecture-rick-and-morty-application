package com.haliltprkk.rickandmortyapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.haliltprkk.rickandmortyapplication.presentation.character_list.CharacterListScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.CharacterListScreen.route) {
        composable(route = Screen.CharacterListScreen.route) {
            CharacterListScreen(navController = navController)
        }
    }
}