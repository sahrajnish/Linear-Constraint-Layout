package com.example.linearconstraintlayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val firstName = findViewById<EditText>(R.id.etFirstName)
            val lastName = findViewById<EditText>(R.id.etLastName)
            val DOB = findViewById<EditText>(R.id.etDOB)
            val countryName = findViewById<EditText>(R.id.etcountryName)
            val applyButton = findViewById<Button>(R.id.btApply)

            applyButton.setOnClickListener {
                if(firstName.text.toString() != "" && lastName.text.toString() != "" && countryName.text.toString() != ""){
                    val intent = Intent(this, secondActivity::class.java)
                    intent.putExtra("FIRSTNAME", firstName.text.toString())
                    intent.putExtra("LASTNAME", lastName.text.toString())
                    intent.putExtra("COUNTRYNAME", countryName.text.toString())
                    startActivity(intent)
                }else{
                    Toast.makeText(
                        this@MainActivity,
                        "Please! enter all fields.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
    }
}
