package com.example.act11_uf1

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitButton: Button = findViewById(R.id.buttonSubmit)
        submitButton.setOnClickListener {
            val selectedGenderId = findViewById<RadioGroup>(R.id.radioGroupGender).checkedRadioButtonId
            val selectedGender = if (selectedGenderId != -1) findViewById<RadioButton>(selectedGenderId).text else "No seleccionat"
            Toast.makeText(this, "Registre complet. Gènere: $selectedGender", Toast.LENGTH_SHORT).show()
        }
    }
}
