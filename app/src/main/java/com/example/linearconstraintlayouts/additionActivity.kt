package com.example.linearconstraintlayouts

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class additionActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addition)
            val etFirstNumber = findViewById<EditText>(R.id.etFirstNumber)
            val etSecondNumber = findViewById<EditText>(R.id.etSecondNumber)
            val sumButton = findViewById<Button>(R.id.btAddition)
            val result = findViewById<TextView>(R.id.tvResult)
            val next = findViewById<Button>(R.id.btNextToImage)

            sumButton.setOnClickListener {
                val firstNumber = etFirstNumber.text.toString().toInt()
                val secondNumber = etSecondNumber.text.toString().toInt()
                val addition = firstNumber + secondNumber
                result.text = addition.toString()
            }

            next.setOnClickListener {
                val intent = Intent(this, imageActivity::class.java)
                startActivity(intent)
            }
    }
}