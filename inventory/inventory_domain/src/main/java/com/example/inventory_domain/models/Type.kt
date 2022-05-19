package com.example.inventory_domain.models


import com.example.core.util.CookieConstants.AMBUSH
import com.example.core.util.CookieConstants.BOMBER
import com.example.core.util.CookieConstants.CHARGE
import com.example.core.util.CookieConstants.DEFENSE
import com.example.core.util.CookieConstants.HEALING
import com.example.core.util.CookieConstants.MAGIC
import com.example.core.util.CookieConstants.RANGED
import com.example.core.util.CookieConstants.SUPPORT

sealed class Type (
    val type: String
) {
    object Ranged: Type(RANGED)
    object Healing: Type(HEALING)
    object Support: Type(SUPPORT)
    object Charge: Type(CHARGE)
    object Defense: Type(DEFENSE)
    object Bomber: Type(BOMBER)
    object Magic: Type(MAGIC)
    object Ambush: Type(AMBUSH)

    companion object {
        fun fromString(type: String): Type {
            return when (type) {
                RANGED -> Ranged
                HEALING -> Healing
                SUPPORT -> Support
                CHARGE -> Charge
                DEFENSE -> Defense
                BOMBER -> Bomber
                MAGIC -> Magic
                AMBUSH -> Ambush
                else -> { Support }
            }
        }
    }
}
