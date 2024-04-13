package com.example.rescuemitraapp.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.rescuemitraapp.R
import com.google.firebase.auth.FirebaseAuth


class Login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        firebaseAuth = FirebaseAuth.getInstance()

        val signInButton: Button = findViewById(R.id.sign_in)
        val button2: Button = findViewById(R.id.gethelp)
        val button3: Button = findViewById(R.id.geelp)

        val emailEditText: EditText = findViewById(R.id.editTextEmail)
        val passwordEditText: EditText = findViewById(R.id.password)


        signInButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val pass = passwordEditText.text.toString()
            if (email.isNotEmpty() && pass.isNotEmpty()) {
                firebaseAuth.signInWithEmailAndPassword(email, pass)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            // Sign in success, update UI with the signed-in user's information
                            Toast.makeText(this, "Sign In Successful", Toast.LENGTH_SHORT).show()

                            val intent = Intent(this, RescueDashboardActivity::class.java)
                            startActivity(intent)
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(this, "Sign In Failed", Toast.LENGTH_SHORT).show()
                        }
                    }
            } else {
                Toast.makeText(this, "Error : Email or Password Field Is Empty", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        button2.setOnClickListener {
            // Handle Sign Up button click
            val intent = Intent(this, Regsiter::class.java)
            startActivity(intent)

        }

        button3.setOnClickListener {
            // Handle Sign In button click
            val intent = Intent(this, Regsiter::class.java)
            startActivity(intent)
        }
    }

}