package com.example.rescuemitraapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.rescuemitraapp.R
import com.example.rescuemitraapp.CitizenSignin


class CitiLogin : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.citizenslogin)

        val button1 = findViewById<Button>(R.id.signinn)
        val button2 = findViewById<Button>(R.id.gethelpp)
        val button3 = findViewById<Button>(R.id.geelpp)

        button1.setOnClickListener {
            val intent = Intent(this, CitizenSignin::class.java)
            startActivity(intent)


            button2.setOnClickListener {
                // Handle Sign Up button click
                val intent = Intent(this, CitizenRegister::class.java)
                startActivity(intent)
                button3.setOnClickListener {
                    // Handle Sign In button click
                    val intent = Intent(this, CitizenRegister::class.java)
                    startActivity(intent)


                }
            }
        }
    }
}