package com.example.navgraph2510.navigator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDirections
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

open class BaseViewModel : ViewModel() {

    private val _navigation = MutableLiveData<NavigationCommand>()
    val navigation: LiveData<NavigationCommand> get() = _navigation
//    private val _navigation : MutableStateFlow<NavigationCommand> = MutableStateFlow(NavigationCommand.Null)
//    val navigation: StateFlow<NavigationCommand> get() = _navigation


    fun navigate(navDirections: NavDirections) {
        _navigation.value = NavigationCommand.ToDirection(navDirections)
    }

    fun navigateBack() {
        _navigation.value = NavigationCommand.Back
    }


}