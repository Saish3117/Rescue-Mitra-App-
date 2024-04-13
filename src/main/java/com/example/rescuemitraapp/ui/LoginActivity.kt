package com.example.rescuemitraapp.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.util.PatternsCompat
import com.example.rescuemitraapp.R
import com.example.rescuemitraapp.data.setTypeOfUser
import com.example.rescuemitraapp.data.setUserLoginStatus
import com.example.rescuemitraapp.utils.USER_TYPE_CITIZEN
import com.example.rescuemitraapp.utils.USER_TYPE_INTENT_KEY
import com.example.rescuemitraapp.utils.USER_TYPE_RESCUE_AGENCY
import com.google.firebase.auth.FirebaseAuth


class LoginActivity : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    private var typeOfUser = USER_TYPE_CITIZEN
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        typeOfUser = intent.getStringExtra(USER_TYPE_INTENT_KEY) ?: USER_TYPE_CITIZEN

        firebaseAuth = FirebaseAuth.getInstance()

        val signInButton: Button = findViewById(R.id.sign_in_button)
        val signUpButton: Button = findViewById(R.id.sign_up_button)

        val emailEditText: EditText = findViewById(R.id.email_edit_text)
        val passwordEditText: EditText = findViewById(R.id.password_edit_text)

        if (typeOfUser == USER_TYPE_RESCUE_AGENCY) {
            signUpButton.visibility = View.GONE
        } else {
            signUpButton.visibility = View.VISIBLE
        }

        signInButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val pass = passwordEditText.text.toString()
            if (!checkIfEmailAddressIsValidOrNot(email)) {
                Toast.makeText(this, "Please enter valid Email Address", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (pass.isEmpty()) {
                Toast.makeText(this, "Password field can not be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            firebaseAuth.signInWithEmailAndPassword(email, pass)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Toast.makeText(this, "Sign In Successful", Toast.LENGTH_SHORT).show()
                        setUserLoginStatus(this, true)
                        if (typeOfUser == USER_TYPE_RESCUE_AGENCY) {
                            setTypeOfUser(this, USER_TYPE_RESCUE_AGENCY)
                            val intent = Intent(this, RescueDashboardActivity::class.java)
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
                            startActivity(intent)
                        } else {
                            setTypeOfUser(this, USER_TYPE_CITIZEN)
                            val intent = Intent(this, CitizenDashboardActivity::class.java)
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
                            startActivity(intent)
                        }
                    } else {
                        // If sign in fails, display a message to the user.
                        Toast.makeText(this, "Sign In Failed", Toast.LENGTH_SHORT).show()
                    }
                }
        }

        signUpButton.setOnClickListener {
            // Handle Sign Up button click
            val intent = Intent(this, Regsiter::class.java)
            startActivity(intent)

        }
    }

    private fun checkIfEmailAddressIsValidOrNot(emailAddress: String?): Boolean {
        if (emailAddress.isNullOrEmpty())
            return false
        return PatternsCompat.EMAIL_ADDRESS.matcher(emailAddress).matches();
    }

}