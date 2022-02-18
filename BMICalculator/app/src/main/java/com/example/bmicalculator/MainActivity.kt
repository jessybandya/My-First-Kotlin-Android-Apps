package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private lateinit var cardViewResults : CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weightText = findViewById<EditText>(R.id.etWeight)
        val heightText = findViewById<EditText>(R.id.etHeight)
        val calcButton = findViewById<Button>(R.id.btnCalculate)
        cardViewResults = findViewById(R.id.cvResults)

        calcButton.setOnClickListener {
            val weight = weightText.text.toString()
            val height = heightText.text.toString()

            if(validateInput(weight,height)){
                val bmi = weight.toFloat()/((height.toFloat()/100)*(height.toFloat()/100))
                //get result with 2 decimal places
                val bmi2Digital = String.format("%.2f", bmi).toFloat()

                displayResult(bmi2Digital)
            }


        }

    }

    private fun validateInput(weight:String?, height:String?):Boolean{
        return when{
            weight.isNullOrEmpty() ->{
                cardViewResults.visibility = INVISIBLE
                Toast.makeText(this,"Weight is empty", Toast.LENGTH_LONG).show()
                return false
            }
            height.isNullOrEmpty() ->{
                cardViewResults.visibility = INVISIBLE
                Toast.makeText(this,"Height is empty", Toast.LENGTH_LONG).show()
                return false
            }
            else ->{
                cardViewResults.visibility = VISIBLE
                return true
            }
        }
    }
    private fun displayResult(bmi: Float){
        val resultIndex = findViewById<TextView>(R.id.tvIndex)
        val resultDescription = findViewById<TextView>(R.id.tvResults)
        val info = findViewById<TextView>(R.id.tvInfo)

        resultIndex.text = bmi.toString()
        info.text = "(Normal range is 18.5 - 24.9)"

        var resultText = ""
        var color = 0

        when{
            bmi<18.50 ->{
                resultText = "Underweight"
                color = R.color.under_weight
            }
            bmi in 18.50..24.99 ->{
                resultText = "Healthy"
                color = R.color.normal
            }
            bmi in 25.00..29.99 ->{
                resultText = "Overweight"
                color = R.color.over_weight
            }
            bmi > 29.99 ->{
                resultText = "Obese"
                color = R.color.obese
            }
        }
        resultDescription.setTextColor(ContextCompat.getColor(this,color))
        resultDescription.text = resultText
    }
}