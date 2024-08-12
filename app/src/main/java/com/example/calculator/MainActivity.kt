package com.example.calculator

import android.icu.text.DecimalFormat
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    val ADD = "+"
    val SUBS = "-"
    val MULTIPLY = "*"
    val DIVIDE = "/"
    val PERCENTAGE = "%"

    var operateNow = ""

    var firstNumber:Double = Double.NaN
    var secondNumber:Double = Double.NaN
    lateinit var tvTemp:TextView
    lateinit var tvResult:TextView
    lateinit var formatDecimal:DecimalFormat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        formatDecimal = DecimalFormat("#.##########")
        tvTemp = findViewById(R.id.tvTemp)
        tvResult = findViewById(R.id.tvResult)


    }

    fun changeOperator(b:View){
        val button:Button = b as Button
        if(button.text.toString().trim()=="÷"){
           operateNow = "/"
        }else if(button.text.toString().trim()=="X"){
            operateNow = "*"
        }else {
            operateNow = button.text.toString().trim()
        }
    }

    fun calculate(b: View){
        if(Double.NaN != firstNumber)
    }

}