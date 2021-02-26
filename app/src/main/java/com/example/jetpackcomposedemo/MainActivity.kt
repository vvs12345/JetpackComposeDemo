package com.example.jetpackcomposedemo

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposedemo.models.Item
import com.example.jetpackcomposedemo.ui.theme.JetpackComposeDemoTheme

class MainActivity : AppCompatActivity() {

    private val listItems = com.example.jetpackcomposedemo.utils.ListItem.getList()

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

@Composable
fun ListDetailScreen(navController: NavHostController) {
    val stateInfo = navController.previousBackStackEntry
        ?.arguments?.getParcelable<Item>("state_item")

    JetpackComposeDemoTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            Scaffold(
                topBar = {
                    AppBarItem("Details of ".plus(stateInfo?.state.toString()))
                }, content = {
                    Column(
                        Modifier
                            .padding(30.dp)
                            .fillMaxWidth()
                            .fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier = Modifier
                                .clip(CircleShape)
                                .size(130.dp)
                                .background(Color.Cyan),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = stateInfo?.state.toString(),
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black
                            )
                        }
                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(16.dp)
                        )
                        Text(text = "City: ".plus(stateInfo?.city.toString()), fontSize = 20.sp)

                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(16.dp)
                        )
                        Text(text = "Zip Code: ".plus(stateInfo?.zip_code.toString()), fontSize = 20.sp)

                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(16.dp)
                        )
                        Text(text = "Description: ".plus(stateInfo?.desc.toString()), fontSize = 20.sp)
                    }
                })
        }
    }
}

@Composable
fun ListScreen(navController: NavHostController, stateList: List<Item>) {

    JetpackComposeDemoTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            Scaffold(
                topBar = {
                    AppBarItem("List of States")
                }, content = {
                    LazyColumn(modifier = Modifier
                        .padding(8.dp), content = {
                        itemsIndexed(stateList) { pos, item ->
                            Card(
                                elevation = 3.dp, modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .clickable {
                                        navController.currentBackStackEntry
                                            ?.arguments?.putParcelable("state_item", stateList[pos])
                                        navController.navigate("list_detail")
                                    })
                            {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Box(
                                        modifier = Modifier
                                            .size(40.dp)
                                            .clip(CircleShape)
                                            .background(Color.Green),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(
                                            item.state[0].toString(),
                                            fontSize = 18.sp,
                                            fontWeight = FontWeight.ExtraBold,
                                            color = Color.White,
                                        )
                                    }
                                    Column {
                                        Text(
                                            item.state,
                                            fontSize = 18.sp,
                                            modifier = Modifier.padding(8.dp),
                                            fontWeight = FontWeight.ExtraBold,
                                            color = Color.Black,
                                        )
                                        Text(
                                            item.city, fontSize = 18.sp, modifier = Modifier
                                                .padding(start = 8.dp, bottom = 8.dp)
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
