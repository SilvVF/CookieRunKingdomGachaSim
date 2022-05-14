package com.example.gacha_domain.use_cases

import com.example.core.data.preferences.Preferences
import com.example.core.domain.CookieRepository


class DetermineShouldPopulateDb(
    private val preferences: Preferences,
    private val cookieRepository: CookieRepository,
) {

    suspend operator fun invoke() {
        when (preferences.shouldPopulateDb()) {
            true -> {}
            false -> {
                cookieRepository.prePopulateWithAllCookies()
            }
        }
    }
}