package com.example.core.data.local.entity

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface CookieDao {

    @Query("SElECT * FROM cookieentity")
    fun getAllCookies(): Flow<CookieEntity>

    @Insert(
        onConflict = OnConflictStrategy.REPLACE
    )
    suspend fun upsertCookieInfo(cookieEntityList: List<CookieEntity>)

    @Update(
        entity = CookieEntity::class,
        onConflict = OnConflictStrategy.REPLACE
    )
    suspend fun updateCookieInfo(cookieEntity: CookieEntity)

    @Query(
            """
            SELECT * FROM cookieentity
            WHERE LOWER(name) = LOWER(:name)
            LIMIT 1
            """
    )
    suspend fun getCookieByName(name: String): CookieEntity
}