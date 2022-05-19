package com.example.gacha_domain.repository.use_cases

import com.example.gacha_domain.models.GachaCookie

class FilterCookieList {

    operator fun invoke(list: List<List<GachaCookie>>): List<List<GachaCookie>>{
        return list.filter { it.size == 10 }
    }
}