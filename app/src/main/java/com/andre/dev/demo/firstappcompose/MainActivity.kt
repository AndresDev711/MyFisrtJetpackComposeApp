package com.andre.dev.demo.firstappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.andre.dev.demo.firstappcompose.navigation.MainScreen
import com.andre.dev.demo.firstappcompose.navigation.Routes
import com.andre.dev.demo.firstappcompose.navigation.SecondScreen
import com.andre.dev.demo.firstappcompose.navigation.ThirdScreen
import com.andre.dev.demo.firstappcompose.ui.theme.FirstAppComposeTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      FirstAppComposeTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
          val navigationController = rememberNavController()
          NavHost(
            navController = navigationController,
            startDestination = Routes.MainScreen.route
          ) {
            composable(Routes.MainScreen.route) { MainScreen(navigationController) }
            composable(Routes.SecondScreen.route) { SecondScreen(navigationController) }
            composable(Routes.ThirdScreen.route) { ThirdScreen(navigationController) }
          }
        }
      }
    }
  }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  Text(
    text = "Hello $name!",
    modifier = modifier
  )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  FirstAppComposeTheme {
    Greeting("Android")
  }
}