package com.example.rescuemitraapp.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.rescuemitraapp.R

class RescueDashboardActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rescue_dashboard)


        val buttonn = findViewById<Button>(R.id.homer)
        val button1 = findViewById<Button>(R.id.Announcement)
        val button2 = findViewById<Button>(R.id.current)
        val button3 = findViewById<Button>(R.id.past)
        val button4 = findViewById<Button>(R.id.geelp)


        button1.setOnClickListener {
            val intent = Intent(this, Announcement::class.java)
            startActivity(intent)


            button2.setOnClickListener {
                // Handle Sign Up button click
                val intent = Intent(this, Current::class.java)
                startActivity(intent)
                button3.setOnClickListener {
                    // Handle Sign In button click
                    val intent = Intent(this, Past::class.java)
                    startActivity(intent)

                    buttonn.setOnClickListener {
                        val intent = Intent(this, TypeOfUserSelectorActivity::class.java)
                        startActivity(intent)

                    }
                }
            }
        }
    }
}

