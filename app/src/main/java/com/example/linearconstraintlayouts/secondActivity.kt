package com.example.linearconstraintlayouts

import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle as Bundle1


class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle1?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
            val btApplyButton = findViewById<Button>(R.id.btApplyButton)
            btApplyButton.setOnClickListener {
                val intent = Intent(this, thirdActivity::class.java)
                startActivity(intent)
            }
    }
}