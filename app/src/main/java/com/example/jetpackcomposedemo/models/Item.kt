package com.example.jetpackcomposedemo.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Item (val puppy_name:String, val image_url:String,val desc:String):Parcelable