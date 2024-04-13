package com.example.rescuemitraapp.data

import android.content.Context
import android.content.SharedPreferences
<<<<<<< HEAD

const val MY_PREFS_NAME = "MyPrefsFile"
const val IS_USER_LOGIN_KEY = "IsUserLoginKey"
const val USER_TYPE_KEY = "USerTypeKey"
const val USER_TYPE_RESCUE_AGENCY = "RESCUE_USER"
const val USER_TYPE_CITIZEN = "CITIZEN_USER"

fun isUserLogin(context: Context): Boolean {
    val prefs: SharedPreferences = context.getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE)
    return prefs.getBoolean(IS_USER_LOGIN_KEY, false)
=======
import com.example.rescuemitraapp.utils.IS_USER_LOGIN_PREF_KEY
import com.example.rescuemitraapp.utils.MY_PREFS_NAME
import com.example.rescuemitraapp.utils.USER_TYPE_PREF_KEY


fun isUserLogin(context: Context): Boolean {
    val prefs: SharedPreferences = context.getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE)
    return prefs.getBoolean(IS_USER_LOGIN_PREF_KEY, false)
>>>>>>> 11d4601 (done)
}

fun setUserLoginStatus(context: Context, isLoggedIn: Boolean) {
    val editor: SharedPreferences.Editor = context.getSharedPreferences(MY_PREFS_NAME,
        Context.MODE_PRIVATE
    ).edit()
<<<<<<< HEAD
    editor.putBoolean(IS_USER_LOGIN_KEY, isLoggedIn)
=======
    editor.putBoolean(IS_USER_LOGIN_PREF_KEY, isLoggedIn)
>>>>>>> 11d4601 (done)
    editor.apply()
}

fun getTypeOfUser(context: Context): String? {
    val prefs: SharedPreferences = context.getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE)
<<<<<<< HEAD
    return prefs.getString(USER_TYPE_KEY, null)
=======
    return prefs.getString(USER_TYPE_PREF_KEY, null)
>>>>>>> 11d4601 (done)
}

fun setTypeOfUser(context: Context, userType: String?) {
    val editor: SharedPreferences.Editor = context.getSharedPreferences(MY_PREFS_NAME,
        Context.MODE_PRIVATE
    ).edit()
<<<<<<< HEAD
    editor.putString(USER_TYPE_KEY, userType)
=======
    editor.putString(USER_TYPE_PREF_KEY, userType)
>>>>>>> 11d4601 (done)
    editor.apply()
}



