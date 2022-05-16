package com.example.gacha_domain.repository.use_cases


import com.example.gacha_domain.repository.GachaRepository

class UpdateCookieInfo(
    val repository: GachaRepository
) {

   suspend operator fun invoke(
       cookieName: String,
       soultStoneCount: Int,
   ) {
       repository.updateCookie(cookieName, soultStoneCount)
   }
}