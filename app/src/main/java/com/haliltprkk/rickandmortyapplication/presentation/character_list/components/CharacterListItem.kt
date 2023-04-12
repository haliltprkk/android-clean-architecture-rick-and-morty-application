package com.haliltprkk.rickandmortyapplication.presentation.character_list.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.haliltprkk.rickandmortyapplication.R
import com.haliltprkk.rickandmortyapplication.presentation.ui.theme.Lato

@Composable
fun CharacterListItem(
    character: String,
    onItemClick: (String) -> Unit,
) {
    Box(modifier = Modifier
        .padding(horizontal = 12.dp)
        .clip(RoundedCornerShape(6.dp))
        .background(color = colorResource(id = R.color.tuna))
        .fillMaxWidth()
        .height(140.dp)
        .clickable { onItemClick(character) }) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.sample_rick),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxHeight()
                    .widthIn(max = 120.dp)
            )
            Column(
                modifier = Modifier.padding(
                    horizontal = 12.dp, vertical = 12.dp
                )
            ) {
                Text(
                    text = character,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    style = TextStyle(
                        fontFamily = Lato,
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Black
                    )
                )
                Spacer(modifier = Modifier.height(4.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .size(6.dp)
                            .background(colorResource(id = R.color.apple))
                    )
                    Spacer(modifier = Modifier.size(4.dp))
                    Text(
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        text = "Alive - Human",
                        style = TextStyle(
                            fontFamily = Lato,
                            color = Color.White,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    text = "Last known location:",
                    style = TextStyle(
                        fontFamily = Lato,
                        color = colorResource(id = R.color.silver_chalice),
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    text = "Earth (Replacement Dimension)",
                    style = TextStyle(
                        fontFamily = Lato,
                        color = Color.White,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    text = "Last known location:",
                    style = TextStyle(
                        fontFamily = Lato,
                        color = colorResource(id = R.color.silver_chalice),
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    text = "Earth (Replacement Dimension)",
                    style = TextStyle(
                        fontFamily = Lato,
                        color = Color.White,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
    }
}