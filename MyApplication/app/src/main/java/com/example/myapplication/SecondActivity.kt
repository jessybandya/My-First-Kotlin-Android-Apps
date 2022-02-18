package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("MyTag", "Second Activity: onCreate")
        val userName = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvOffer)

        textView.text = "$userName ,you will get free access to all the contents for free..."
    }

    override fun onStart() {
        super.onStart()
        Log.i("MyTag", "Second Activity: OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MyTag", "Second Activity: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MyTag", "Second Activity: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MyTag", "Second Activity: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MyTag", "Second Activity: onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MyTag", "Second Activity: onRestart")
    }
    
}