package com.example.inventory_domain.models

import java.util.*

sealed class Position(
    val position: String
) {
    object FRONT : Position("front")
    object BACK : Position("back")
    object MIDDLE : Position("middle")

    companion object {
        fun fromString(position: String): Position {
            return when(position) {
                "front" -> FRONT
                "back" -> BACK
                "middle" -> MIDDLE
                else -> {MIDDLE}
            }
        }
    }
}
