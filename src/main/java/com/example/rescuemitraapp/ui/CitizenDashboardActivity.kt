package com.example.rescuemitraapp.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.rescuemitraapp.R
<<<<<<< HEAD
=======
import com.example.rescuemitraapp.data.setTypeOfUser
import com.example.rescuemitraapp.data.setUserLoginStatus
import com.google.firebase.auth.FirebaseAuth
>>>>>>> 11d4601 (done)


class CitizenDashboardActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_citizen_dashboard)


        val buttons = findViewById<Button>(R.id.back)
        val button1 = findViewById<Button>(R.id.ongoing)
        val button2 = findViewById<Button>(R.id.Disaster)
        val button3 = findViewById<Button>(R.id.Emergency)
        val button4 = findViewById<Button>(R.id.Protocol)
<<<<<<< HEAD
=======
        val signOutButton = findViewById<Button>(R.id.sign_out_button)
>>>>>>> 11d4601 (done)

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
            val intent = Intent(this, Emergency::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            // Handle button 4click
            val intent = Intent(this, Protocol::class.java)
            startActivity(intent)

            buttons.setOnClickListener {
                // Handle buttons click
                val intent = Intent(this, TypeOfUserSelectorActivity::class.java)
                startActivity(intent)
            }
        }
<<<<<<< HEAD
=======

        signOutButton.setOnClickListener {
            setUserLoginStatus(this, false)
            setTypeOfUser(this, null)
            FirebaseAuth.getInstance().signOut()
            val intent = Intent(this, TypeOfUserSelectorActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
        }
>>>>>>> 11d4601 (done)
    }
}


























