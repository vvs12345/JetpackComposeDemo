package com.example.jetpackcomposedemo.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.jetpackcomposedemo.AppBarItem
import com.example.jetpackcomposedemo.composables.ShowImage
import com.example.jetpackcomposedemo.models.Item
import com.example.jetpackcomposedemo.ui.theme.JetpackComposeDemoTheme

@ExperimentalFoundationApi
@Composable
fun ListScreen(navController: NavHostController, puppiesList: List<Item>) {

    JetpackComposeDemoTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            Scaffold(
                topBar = {
                    AppBarItem("List of Puppies")
                }, content = {
                    val grouped=puppiesList.toMutableStateList()
                    LazyVerticalGrid(
                        cells = GridCells.Fixed(2),
                        contentPadding = PaddingValues(16.dp),
                        content = {
                            itemsIndexed(puppiesList) { pos, item ->
                                Card(
                                    elevation = 3.dp,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(8.dp)
                                        .clickable {
                                            navController.currentBackStackEntry
                                                ?.arguments?.putParcelable(
                                                    "puppy_item",
                                                    puppiesList[pos]
                                                )
                                            navController.navigate("list_detail")
                                        })
                                {
                                    Column {
                                        ShowImage(5.dp,0.dp,100.dp, item)
                                        Column {
                                            Text(
                                                item.puppy_name,
                                                fontSize = 18.sp,
                                                modifier = Modifier.padding(8.dp),
                                                fontWeight = FontWeight.ExtraBold,
                                                color = Color.Black,
                                                textAlign = TextAlign.Center
                                            )
                                        }
                                    }
                                }
                                Spacer(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(16.dp)
                                )
                            }
                        })
                })
        }
    }
}