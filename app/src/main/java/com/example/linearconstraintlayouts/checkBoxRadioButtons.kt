package com.example.linearconstraintlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class checkBoxRadioButtons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box_radio_buttons)

        val btnOrder = findViewById<Button>(R.id.btOrder)
        val radioGroupButtons = findViewById<RadioGroup>(R.id.rgMeatType)
        val cbCheese = findViewById<CheckBox>(R.id.cbCheese)
        val cbOnion = findViewById<CheckBox>(R.id.cbOnion)
        val cbSalad = findViewById<CheckBox>(R.id.cbSalad)
        val tvOrder = findViewById<TextView>(R.id.tvDisplay)

        btnOrder.setOnClickListener {
            val selectedMeatType = radioGroupButtons.checkedRadioButtonId
            val meat = findViewById<RadioButton>(selectedMeatType)
            val orderString = "You ordered a Burger with:\n" +
                    "${meat.text}\n" +
                    (if(cbOnion.isChecked) "${cbOnion.text}\n" else "") +
                    (if(cbCheese.isChecked) "Cheese\n" else "") +
                    (if(cbSalad.isChecked) "${cbSalad.text}\n" else "")
            tvOrder.text = orderString
        }
    }
}