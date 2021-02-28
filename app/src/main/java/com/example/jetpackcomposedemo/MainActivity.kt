package com.example.jetpackcomposedemo

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposedemo.models.Item
import com.example.jetpackcomposedemo.ui.ListDetailScreen
import com.example.jetpackcomposedemo.ui.ListScreen

class MainActivity : AppCompatActivity() {

    private val listItems = com.example.jetpackcomposedemo.utils.ListItem.getList()

    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting(listItems)
        }
    }
}

@Composable
fun AppBarItem(title: String) {
    TopAppBar(
        title = {
            Text(text = title)
        },
        backgroundColor = Color.Blue,
        contentColor = Color.White,
        elevation = 12.dp,
    )
}

@ExperimentalFoundationApi
@Preview()
@Composable
fun Greeting(stateList: List<Item>) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "list") {
        composable("list") {
            ListScreen(navController, stateList)
        }
        composable("list_detail") {
            ListDetailScreen(navController)
        }
    }
}
