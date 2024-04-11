package com.example.rescuemitraapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.selector)

        val button1 = findViewById<Button>(R.id.RescueAgency)
        val button2 = findViewById<Button>(R.id.Citizens)

        button1.setOnClickListener {
            // Handle button 1 click
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            // Handle button 2 click
            val intent = Intent(this,  CitiLogin ::class.java)
            startActivity(intent)
        }

    }
}