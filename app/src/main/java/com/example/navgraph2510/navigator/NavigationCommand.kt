package com.example.navgraph2510.navigator

import androidx.navigation.NavDirections

sealed class NavigationCommand {
    data class ToDirection(val directions: NavDirections) : NavigationCommand()
    object Back : NavigationCommand()
    object Null:NavigationCommand()
}