package com.example.jetpackcomposedemo.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.jetpackcomposedemo.AppBarItem
import com.example.jetpackcomposedemo.composables.ShowImage
import com.example.jetpackcomposedemo.models.Item
import com.example.jetpackcomposedemo.ui.theme.JetpackComposeDemoTheme

@Composable
fun ListDetailScreen(navController: NavHostController) {
    val stateInfo = navController.previousBackStackEntry
        ?.arguments?.getParcelable<Item>("puppy_item")

    JetpackComposeDemoTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            Scaffold(
                topBar = {
                    AppBarItem("Details of ".plus(stateInfo?.puppy_name.toString()))
                }, content = {
                    LazyColumn(
                        Modifier
                            .padding(30.dp)
                            .fillMaxWidth()
                            .fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally
                    )
                    {
                        item {
                            ShowImage(50.dp, 20.dp, 150.dp, stateInfo)
                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(16.dp)
                            )
                            Text(
                                text = "Description: ".plus(stateInfo?.desc.toString()),
                                fontSize = 20.sp
                            )
                        }
                    }
                })
        }
    }
}