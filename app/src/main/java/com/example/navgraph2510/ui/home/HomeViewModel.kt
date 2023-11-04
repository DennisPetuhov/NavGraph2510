package com.example.navgraph2510.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import com.example.navgraph2510.navigator.BaseViewModel

class HomeViewModel : BaseViewModel() {



    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text



    private val _text1 = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text1: LiveData<String> = _text1


    fun txt(txt:String){
         _text.value = txt
    }

    fun txt1(txt:String){
        _text1.value = txt
    }
    }
