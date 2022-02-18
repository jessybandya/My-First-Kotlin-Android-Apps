package com.example.oopdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val car = Car()
//        car.start()
//
//        val d = Driver(" Jaby", 100)
//        d.showDetails()
        val myCar = MyCar()
        myCar.maxSpeed

    }
}