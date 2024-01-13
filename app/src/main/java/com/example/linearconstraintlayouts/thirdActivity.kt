package com.example.linearconstraintlayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class thirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
            val display = findViewById<TextView>(R.id.tvCount)
            val plus1 = findViewById<Button>(R.id.btPlus1)
            val minus1 = findViewById<Button>(R.id.btMinus1)
            val nextButton = findViewById<Button>(R.id.btNext)
            var count = 0

            plus1.setOnClickListener {
                count+=1
                display.setBackgroundResource(R.color.green)
                display.text = count.toString()
            }

            minus1.setOnClickListener {
                count-=1
                display.setBackgroundResource(R.color.red)
                display.text = count.toString()
            }

            nextButton.setOnClickListener {
                val intent = Intent(this, additionActivity::class.java)
                startActivity(intent)
            }
    }
}