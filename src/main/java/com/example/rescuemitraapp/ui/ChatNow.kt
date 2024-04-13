package com.example.rescuemitraapp.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.rescuemitraapp.R


class ChatNow : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chatnow)

        val button1 = findViewById<Button>(R.id.chathome)
        button1.setOnClickListener {
            // Handle button 1 click
            val intent = Intent(this, CitizenDashboardActivity::class.java)
            startActivity(intent)
        }


    }}