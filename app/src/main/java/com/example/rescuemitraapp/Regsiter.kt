package com.example.rescuemitraapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class Regsiter : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private lateinit var firebaseAuth: FirebaseAuth;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
        firebaseAuth = FirebaseAuth.getInstance()
        val signInButton: Button = findViewById(R.id.sign_in)
        val signUpButton: Button = findViewById(R.id.sign_up)
        val emailEditText: EditText = findViewById(R.id.editTextEmail)
        val passwordEditText: EditText = findViewById(R.id.password)

        signInButton.setOnClickListener {
            val intent = Intent(this, Rescue::class.java)
            startActivity(intent)
        }

        signUpButton.setOnClickListener {
            /*// Handle Sign Up button click
            val intent = Intent(this, Login::class.java)
            startActivity(intent)*/
            val email = emailEditText.text.toString()
            val pass = passwordEditText.text.toString()
            if (email.isNotEmpty() && pass.isNotEmpty()) {
                firebaseAuth.createUserWithEmailAndPassword(email, pass)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            // Sign in success, update UI with the signed-in user's information
                            Toast.makeText(this, "Sign Up Successful", Toast.LENGTH_SHORT).show()
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(this, "Sign Up Failed", Toast.LENGTH_SHORT).show()
                        }
                    }
            } else {
                Toast.makeText(this, "Error : Email or Password Field Is Empty", Toast.LENGTH_SHORT).show()
            }


        }
    }
}