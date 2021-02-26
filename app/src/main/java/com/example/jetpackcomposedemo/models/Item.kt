package com.example.jetpackcomposedemo.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Item (val state:String, val city:String,val zip_code:String,val desc:String):Parcelable