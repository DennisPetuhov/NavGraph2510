package com.example.navgraph2510

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Dog(
    val name:String="Bjork",
    val age:Int=10
):Parcelable
