package com.example.core.util

import android.content.Context

sealed class UiText {

    data class DynamicString(val text: String): UiText()
    data class StringResource(val resId: Int): UiText()

    fun asString(context: Context): String {
        return  when(this) {
            is DynamicString -> this.text
            is StringResource -> context.getString(this.resId)
        }
    }
}
