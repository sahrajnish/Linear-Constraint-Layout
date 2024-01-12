package com.example.linearconstraintlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
            val firstName = intent.getStringExtra("FIRSTNAME")
            val lastName = intent.getStringExtra("LASTNAME")
            val countryName = intent.getStringExtra("COUNTRYNAME")
            val textView = findViewById<TextView>(R.id.tvMessage)
            val message = "Hello $firstName $lastName. \nYou belongs to $countryName"
            textView.text = message
    }
}