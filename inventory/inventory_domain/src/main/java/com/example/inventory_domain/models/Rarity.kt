package com.example.inventory_domain.models

sealed class Rarity(
    val name: String
) {
    object Common: Rarity("common")
    object Rare: Rarity("rare")
    object Special: Rarity("special")
    object Epic: Rarity("epic")
    object SuperEpic: Rarity("super_epic")
    object Legendary: Rarity("legendary")
    object Ancient: Rarity("ancient")

    companion object {
        fun fromString(name: String): Rarity {
           return when (name) {
               "common" -> Common
               "rare" -> Rare
               "special" -> Special
               "epic" -> Epic
               "super_epic" -> SuperEpic
               "legendary" -> Legendary
               "ancient" -> Ancient
               else ->  Epic
            }
        }
    }
}