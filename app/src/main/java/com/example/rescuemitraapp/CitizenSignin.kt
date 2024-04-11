package com.example.rescuemitraapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class CitizenSignin : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.citizens)


        val buttons = findViewById<Button>(R.id.back)
        val button1 = findViewById<Button>(R.id.ongoing)
        val button2 = findViewById<Button>(R.id.Disaster)
        val button3 = findViewById<Button>(R.id.Emergency)
        val button4 = findViewById<Button>(R.id.Protocol)

        button1.setOnClickListener {
            // Handle button 1 click
            val intent = Intent(this, Ongoing::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            // Handle button 2 click
            val intent = Intent(this, Disaster::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            // Handle button 3 click
            val intent = Intent(this,Emergency::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            // Handle button 4click
            val intent = Intent(this, Protocol::class.java)
            startActivity(intent)

            buttons.setOnClickListener {
                // Handle buttons click
                val intent = Intent(this, Second::class.java)
                startActivity(intent)
            }
        }
    }
}


























