package com.example.linearconstraintlayouts

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class imageActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
            val addImageButton = findViewById<Button>(R.id.btAddImage)
            val imageView = findViewById<ImageView>(R.id.ivImage1)

            addImageButton.setOnClickListener {
                imageView.setImageResource(R.drawable.spiderman)
            }
    }
}