package com.example.oopdemo

import android.util.Log

open class Car {
    var maxSpeed = 30
   open fun start(){
        Log.i("My Tag", "Car is starting...")
        Log.i("My Tag", "Max Speed $maxSpeed")
    }
}