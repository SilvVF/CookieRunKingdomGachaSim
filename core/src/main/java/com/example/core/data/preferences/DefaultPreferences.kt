package com.example.core.data.preferences

import android.content.SharedPreferences


class DefaultPreferences(
    private val sharedPref: SharedPreferences
): Preferences {

    override fun shouldPopulateDb(): Boolean {
        return sharedPref.getBoolean(Preferences.SAVE_DB_IS_POPULATED, false)
    }

    override fun saveDBisPopulated(shouldPopulate: Boolean) {
        sharedPref.edit()
            .putBoolean(Preferences.SAVE_DB_IS_POPULATED, shouldPopulate)
            .apply()
    }
}