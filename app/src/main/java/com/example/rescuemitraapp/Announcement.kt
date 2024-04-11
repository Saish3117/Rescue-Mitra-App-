package com.example.rescuemitraapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.rescuemitraapp.R
import com.example.rescuemitraapp.Rescue

class Announcement : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.announcement)

        val button1 = findViewById<Button>(R.id.back)
        button1.setOnClickListener {
            val intent = Intent(this, Rescue::class.java)
            startActivity(intent)

        }
    }
}