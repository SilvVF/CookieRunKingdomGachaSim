package com.example.gacha_domain.repository.use_cases

import com.example.gacha_domain.models.Cookie
import com.example.gacha_domain.repository.GachaRepository

class UpdateCookieInfo(
    val repository: GachaRepository
) {

   suspend operator fun invoke(
       cookie: Cookie
   ) {
       repository.updateCookie(cookie)
   }
}