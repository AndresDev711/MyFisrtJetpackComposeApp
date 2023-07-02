package com.andre.dev.demo.firstappcompose.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun MainScreen(navController: NavHostController) {
  Box(
    modifier = Modifier
      .fillMaxSize()
      .background(Color.Cyan)
  ) {
    Text(text = "Main", Modifier.clickable { navController.navigate("secondScreen") })
  }
}

@Composable
fun SecondScreen(navController: NavHostController) {
  Box(
    modifier = Modifier
      .fillMaxSize()
      .background(Color.Red)
  ) {
    Text(text = "Second", Modifier.clickable { navController.navigate("thirdScreen") })
  }
}

@Composable
fun ThirdScreen(navController: NavHostController) {
  Box(
    modifier = Modifier
      .fillMaxSize()
      .background(Color.Blue)
  ) {
    Text(text = "Third")
  }
}