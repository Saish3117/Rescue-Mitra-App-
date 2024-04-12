package com.example.rescuemitraapp.data

import android.content.Context
import android.content.SharedPreferences
import com.example.rescuemitraapp.utils.IS_USER_LOGIN_PREF_KEY
import com.example.rescuemitraapp.utils.MY_PREFS_NAME
import com.example.rescuemitraapp.utils.USER_TYPE_PREF_KEY


fun isUserLogin(context: Context): Boolean {
    val prefs: SharedPreferences = context.getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE)
    return prefs.getBoolean(IS_USER_LOGIN_PREF_KEY, false)
}

fun setUserLoginStatus(context: Context, isLoggedIn: Boolean) {
    val editor: SharedPreferences.Editor = context.getSharedPreferences(MY_PREFS_NAME,
        Context.MODE_PRIVATE
    ).edit()
    editor.putBoolean(IS_USER_LOGIN_PREF_KEY, isLoggedIn)
    editor.apply()
}

fun getTypeOfUser(context: Context): String? {
    val prefs: SharedPreferences = context.getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE)
    return prefs.getString(USER_TYPE_PREF_KEY, null)
}

fun setTypeOfUser(context: Context, userType: String?) {
    val editor: SharedPreferences.Editor = context.getSharedPreferences(MY_PREFS_NAME,
        Context.MODE_PRIVATE
    ).edit()
    editor.putString(USER_TYPE_PREF_KEY, userType)
    editor.apply()
}



