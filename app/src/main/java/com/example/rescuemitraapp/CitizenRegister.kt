package com.example.rescuemitraapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.rescuemitraapp.R
import com.example.rescuemitraapp.CitizenSignin

class CitizenRegister : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.citizenregsiter)

        val button1 = findViewById<Button>(R.id.SinIn)
        val button2 = findViewById<Button>(R.id.signini)

        button1.setOnClickListener {
            val intent = Intent(this, CitizenSignin::class.java)
            startActivity(intent)


            button2.setOnClickListener {
                // Handle Sign Up button click
                val intent = Intent(this, CitiLogin::class.java)
                startActivity(intent)

            }
        }
    }
}