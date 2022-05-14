package com.example.core.data.preferences

interface Preferences {

    fun shouldPopulateDb(): Boolean

    fun saveDBisPopulated(shouldPopulate: Boolean)

    companion object {
        const val SHOULD_POPULATE_DB = "SHOULD_POPULATE_DB"
        const val SAVE_DB_IS_POPULATED = "SAVE_DB_IS_POPULATE"
    }
}
