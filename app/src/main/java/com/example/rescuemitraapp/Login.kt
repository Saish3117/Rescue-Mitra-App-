package com.example.rescuemitraapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val button1 = findViewById<Button>(R.id.signin)
        val button2 = findViewById<Button>(R.id.gethelp)
        val button3 = findViewById<Button>(R.id.geelp)

        button1.setOnClickListener {
            val intent = Intent(this, Rescue::class.java)
            startActivity(intent)


            button2.setOnClickListener {
                // Handle Sign Up button click
                val intent = Intent(this, Regsiter::class.java)
                startActivity(intent)
                button3.setOnClickListener {
                    // Handle Sign In button click
                    val intent = Intent(this,Regsiter ::class.java)
                    startActivity(intent)


                }
            }
        }
    }
}