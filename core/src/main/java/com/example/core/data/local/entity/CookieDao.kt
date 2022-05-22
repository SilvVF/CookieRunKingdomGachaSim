package com.example.core.data.local.entity

import androidx.room.*
import com.example.core.data.local.CookieDatabase
import kotlinx.coroutines.flow.Flow

@Dao
interface CookieDao {

    @Query("SELECT * FROM cookieentity")
    suspend fun getAllCookies(): List<CookieEntity>

    @Insert(
        onConflict = OnConflictStrategy.REPLACE
    )
    suspend fun upsertCookieInfo(cookieEntityList: List<CookieEntity>)

    @Update(
        entity = CookieEntity::class,
        onConflict = OnConflictStrategy.REPLACE
    )
    suspend fun updateCookieInfo(cookieEntity: CookieEntity)

    @Query("SELECT * FROM cookieentity WHERE :name = name")
    suspend fun getCookieByName(name: String): CookieEntity

    @Query("SELECT * FROM cookieentity WHERE id = :id")
    suspend fun getCookieById(id: Int): CookieEntity

    @Query("DELETE FROM cookieentity")
    fun nuke()
}