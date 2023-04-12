package com.haliltprkk.rickandmortyapplication.presentation.character_list

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.haliltprkk.rickandmortyapplication.presentation.character_list.components.CharacterListItem

@Composable
fun CharacterListScreen(navController: NavController) {
    val characterList = listOf("Slow Rick", "Jeff", "Plane Crash Survivor", "Japheth's Eldest Son")
    val context = LocalContext.current
    return Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 12.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            items(characterList) { character ->
                CharacterListItem(character) {
                    Toast.makeText(context, character, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}