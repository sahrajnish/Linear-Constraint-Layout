package com.example.linearconstraintlayouts

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.ImageView

class imageActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
            val addImageButton = findViewById<Button>(R.id.btAddImage)
            val imageView = findViewById<ImageView>(R.id.ivImage1)
            val nextButton = findViewById<Button>(R.id.btNext)

            addImageButton.setOnClickListener {
                imageView.setImageResource(R.drawable.spiderman)
                nextButton.visibility = VISIBLE
            }

            nextButton.setOnClickListener {
                val intent = Intent(this, checkBoxRadioButtons::class.java)
                startActivity(intent)
            }
    }
}