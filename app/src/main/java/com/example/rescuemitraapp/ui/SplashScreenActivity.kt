package com.example.rescuemitraapp.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.rescuemitraapp.R
import com.example.rescuemitraapp.data.getTypeOfUser
import com.example.rescuemitraapp.data.isUserLogin
import com.example.rescuemitraapp.data.setTypeOfUser
import com.example.rescuemitraapp.data.setUserLoginStatus
import com.example.rescuemitraapp.utils.USER_TYPE_CITIZEN
import com.example.rescuemitraapp.utils.USER_TYPE_RESCUE_AGENCY
import com.google.firebase.auth.FirebaseAuth

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val auth: FirebaseAuth = FirebaseAuth.getInstance()

        // Delay the navigation to SecondActivity for 2 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            if (isUserLogin(this)) {
                if (getTypeOfUser(this) == USER_TYPE_RESCUE_AGENCY) {
                    val intent = Intent(this, RescueDashboardActivity::class.java)
                    startActivity(intent)
                    finish() // Finish MainActivity to prevent going back to it using the back button
                } else if (getTypeOfUser(this) == USER_TYPE_CITIZEN) {
                    val intent = Intent(this, CitizenDashboardActivity::class.java)
                    startActivity(intent)
                    finish() // Finish MainActivity to prevent going back to it using the back button
                } else {
                    //Logging Out User and also reset the User type and go to user selection Screen
                    setUserLoginStatus(this, false)
                    setTypeOfUser(this, null)
                    goToTypeOfUserSelectScreenAndFinish()
                }
            } else {
                goToTypeOfUserSelectScreenAndFinish()
            }
        }, 2000) // 2000 milliseconds = 2 seconds
    }

    private fun goToTypeOfUserSelectScreenAndFinish() {
        val intent = Intent(this, TypeOfUserSelectorActivity::class.java)
        startActivity(intent)
        finish() // Finish MainActivity to prevent going back to it using the back button
    }
}

