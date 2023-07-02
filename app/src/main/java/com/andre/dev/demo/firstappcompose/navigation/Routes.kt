package com.andre.dev.demo.firstappcompose.navigation

sealed class Routes(val route: String) {
  object MainScreen : Routes("mainScreen")
  object SecondScreen : Routes("secondScreen")
  object ThirdScreen : Routes("thirdScreen")
}
