package com.example.gacha_domain.repository.use_cases

import android.util.Log
import com.example.core.data.preferences.Preferences
import com.example.gacha_domain.repository.GachaRepository


class DetermineShouldPopulateDb(
    private val preferences: Preferences,
    private val repository: GachaRepository
) {

    suspend operator fun invoke() {
        when (!preferences.shouldPopulateDb()) {
            true -> {
                repository.prePopulateDb()
                preferences.saveDBisPopulated(false)
            }
            else -> {} //db is populated do nothing
        }
    }
}