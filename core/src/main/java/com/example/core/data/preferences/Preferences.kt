package com.example.core.data.preferences

interface Preferences {

    fun shouldPopulateDb(): Boolean

    fun saveDBisPopulated(shouldPopulate: Boolean)

    fun getTotalCrystalsSpent(): Int
    fun updateTotalCrystalsSpent(total: Int)

    companion object {
        const val SHOULD_POPULATE_DB = "SHOULD_POPULATE_DB"
        const val SAVE_DB_IS_POPULATED = "SAVE_DB_IS_POPULATE"
        const val TOTAL_CRYSTALS_SPENT = "TOTAL_CRYSTALS_SPENT"
    }
}
