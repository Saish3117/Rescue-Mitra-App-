package com.example.rescuemitraapp.data

import android.content.Context
import android.content.SharedPreferences

const val MY_PREFS_NAME = "MyPrefsFile"
const val IS_USER_LOGIN_KEY = "IsUserLoginKey"
const val USER_TYPE_KEY = "USerTypeKey"
const val USER_TYPE_RESCUE_AGENCY = "RESCUE_USER"
const val USER_TYPE_CITIZEN = "CITIZEN_USER"

fun isUserLogin(context: Context): Boolean {
    val prefs: SharedPreferences = context.getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE)
    return prefs.getBoolean(IS_USER_LOGIN_KEY, false)
}

fun setUserLoginStatus(context: Context, isLoggedIn: Boolean) {
    val editor: SharedPreferences.Editor = context.getSharedPreferences(MY_PREFS_NAME,
        Context.MODE_PRIVATE
    ).edit()
    editor.putBoolean(IS_USER_LOGIN_KEY, isLoggedIn)
    editor.apply()
}

fun getTypeOfUser(context: Context): String? {
    val prefs: SharedPreferences = context.getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE)
    return prefs.getString(USER_TYPE_KEY, null)
}

fun setTypeOfUser(context: Context, userType: String?) {
    val editor: SharedPreferences.Editor = context.getSharedPreferences(MY_PREFS_NAME,
        Context.MODE_PRIVATE
    ).edit()
    editor.putString(USER_TYPE_KEY, userType)
    editor.apply()
}



