package com.example.rescuemitraapp.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
<<<<<<< HEAD
import com.example.rescuemitraapp.R
=======
import androidx.core.util.PatternsCompat
import com.example.rescuemitraapp.R
import com.example.rescuemitraapp.data.setTypeOfUser
import com.example.rescuemitraapp.data.setUserLoginStatus
import com.example.rescuemitraapp.utils.USER_TYPE_CITIZEN
import com.example.rescuemitraapp.utils.USER_TYPE_INTENT_KEY
>>>>>>> 11d4601 (done)
import com.google.firebase.auth.FirebaseAuth

class Regsiter : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private lateinit var firebaseAuth: FirebaseAuth;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
        firebaseAuth = FirebaseAuth.getInstance()
<<<<<<< HEAD
        val signInButton: Button = findViewById(R.id.sign_in)
        val signUpButton: Button = findViewById(R.id.sign_up)
        val emailEditText: EditText = findViewById(R.id.editTextEmail)
        val passwordEditText: EditText = findViewById(R.id.password)
=======
        val signInButton: Button = findViewById(R.id.sign_in_button)
        val signUpButton: Button = findViewById(R.id.sign_up_button)
        val emailEditText: EditText = findViewById(R.id.email_edit_text)
        val passwordEditText: EditText = findViewById(R.id.password_edit_text)
        val passwordConfirmEditText: EditText = findViewById(R.id.confirm_password_edit_text)
>>>>>>> 11d4601 (done)

        signInButton.setOnClickListener {
            val intent = Intent(this, RescueDashboardActivity::class.java)
            startActivity(intent)
        }

        signUpButton.setOnClickListener {
<<<<<<< HEAD
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
=======
            val email = emailEditText.text.toString()
            val pass = passwordEditText.text.toString()
            val confirmPass = passwordConfirmEditText.text.toString()
            if (!checkIfEmailAddressIsValidOrNot(email)) {
                Toast.makeText(this, "Please enter valid Email Address", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (pass.isEmpty()) {
                Toast.makeText(this, "Password field can not be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (pass != confirmPass) {
                Toast.makeText(this, "Password and Confirm Password are not Equal", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            firebaseAuth.createUserWithEmailAndPassword(email, pass)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Toast.makeText(this, "Sign Up Successful", Toast.LENGTH_SHORT).show()
                        setUserLoginStatus(this, true)
                        setTypeOfUser(this, USER_TYPE_CITIZEN)

                        val intent = Intent(this, CitizenDashboardActivity::class.java)
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
                        startActivity(intent)
                    } else {
                        // If sign in fails, display a message to the user.
                        Toast.makeText(this, "Sign Up Failed", Toast.LENGTH_SHORT).show()
                    }
                }

            signInButton.setOnClickListener {
                val intent = Intent(this, LoginActivity::class.java)
                intent.putExtra(USER_TYPE_INTENT_KEY, USER_TYPE_CITIZEN)
                startActivity(intent)
            }

        }
    }

    private fun checkIfEmailAddressIsValidOrNot(emailAddress: String?): Boolean {
        if (emailAddress.isNullOrEmpty())
            return false
        return PatternsCompat.EMAIL_ADDRESS.matcher(emailAddress).matches();
    }
>>>>>>> 11d4601 (done)
}