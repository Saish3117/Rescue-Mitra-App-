package com.example.rescuemitraapp.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.rescuemitraapp.R

class CitizenRegister : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.citizenregsiter)

        val button1 = findViewById<Button>(R.id.SinIn)
        val button2 = findViewById<Button>(R.id.signini)

        button1.setOnClickListener {
            val intent = Intent(this, CitizenDashboardActivity::class.java)
            startActivity(intent)


            button2.setOnClickListener {
                // Handle Sign Up button click
                val intent = Intent(this, CitiLogin::class.java)
                startActivity(intent)

            }
        }
    }
}