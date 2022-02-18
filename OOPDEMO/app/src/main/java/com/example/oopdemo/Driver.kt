package com.example.oopdemo

import android.util.Log

class Driver(var name: String, credit: Int) {
   private var totalCredit = 50
//    var driverName = ""
//    lateinit var driverName : String

//    var driverName = name
   private var car = Car()

    init{
        totalCredit += credit
        car.maxSpeed = 150
        car.start()
//        driverName = name
    }

    fun showDetails(){
        Log.i("My Tag", "Driver name is $name with total $totalCredit credit")
    }
}