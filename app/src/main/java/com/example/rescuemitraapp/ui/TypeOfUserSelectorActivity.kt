package com.example.rescuemitraapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.rescuemitraapp.R
import com.example.rescuemitraapp.utils.USER_TYPE_CITIZEN
import com.example.rescuemitraapp.utils.USER_TYPE_INTENT_KEY
import com.example.rescuemitraapp.utils.USER_TYPE_RESCUE_AGENCY

class TypeOfUserSelectorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_type_of_user_selector)

        val selectRescueAgencyButton = findViewById<Button>(R.id.select_rescue_agency_button)
        val selectCitizenUserButton = findViewById<Button>(R.id.select_citizen_button)

        selectRescueAgencyButton.setOnClickListener {
            // Handle button 1 click
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra(USER_TYPE_INTENT_KEY, USER_TYPE_RESCUE_AGENCY)
            startActivity(intent)
        }

        selectCitizenUserButton.setOnClickListener {
            // Handle button 2 click
            val intent = Intent(this,  LoginActivity ::class.java)
            intent.putExtra(USER_TYPE_INTENT_KEY, USER_TYPE_CITIZEN)
            startActivity(intent)
        }

    }
}