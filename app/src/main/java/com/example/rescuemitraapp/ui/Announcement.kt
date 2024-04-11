package com.example.rescuemitraapp.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.rescuemitraapp.R

class Announcement : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.announcement)

        val button1 = findViewById<Button>(R.id.back)
        button1.setOnClickListener {
            val intent = Intent(this, RescueDashboardActivity::class.java)
            startActivity(intent)

        }
    }
}