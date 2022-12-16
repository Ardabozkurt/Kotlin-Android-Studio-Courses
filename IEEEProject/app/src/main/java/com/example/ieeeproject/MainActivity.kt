package com.example.ieeeproject

import android.content.ComponentCallbacks2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val random = (1..9).random()

        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.edit_text)

        button.setOnClickListener{
            val number : Int = Integer.parseInt(editText.text.toString())

            Toast.makeText(this, Toast.LENGTH_LONG).show()
        }
        }
    }
