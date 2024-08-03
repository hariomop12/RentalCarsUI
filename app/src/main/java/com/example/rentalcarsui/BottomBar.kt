package com.example.rentalcarsui

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BottomBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(26.dp))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        bottomBarItem.forEach {
            if (it.isSelected) {
                Box(
                    modifier = Modifier
                        .size(38.dp)
                        .border(
                            width = 1.dp,
                            color = Color.Black,
                            shape = RoundedCornerShape(14.dp)
                        )
                        .clip(RoundedCornerShape(14.dp))
                        .padding(4.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = it.icon,
                        contentDescription = it.title,
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                }
            } else run {
                Icon(
                    imageVector = it.icon,
                    contentDescription = it.title,
                    tint = Color.Black,
                    modifier = Modifier.size(28.dp)
                )
            }
        }
    }
}

data class BottomBarItem(
    val title: String,
    val icon: ImageVector,
    val isSelected: Boolean
)

val bottomBarItem = listOf(
    BottomBarItem(
        title = "Home",
        icon = Icons.Default.AccountBox,
        isSelected = true
    ),
    BottomBarItem(
        title = "Home",
        icon = Icons.Default.Home,
        isSelected = false
    ),
    BottomBarItem(
        title = "Home",
        icon = Icons.Default.Search,
        isSelected = false
    ),
    BottomBarItem(
        title = "Home",
        icon = Icons.Default.Favorite,
        isSelected = false
    )
)


@Preview
@Composable
private fun see() {
    BottomBar()
}