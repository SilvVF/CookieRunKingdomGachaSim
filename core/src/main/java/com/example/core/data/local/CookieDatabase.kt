package com.example.core.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.core.data.local.entity.CookieDao
import com.example.core.data.local.entity.CookieEntity

@Database(
    entities = [CookieEntity::class],
    version = 1
)
abstract class CookieDatabase: RoomDatabase() {

     abstract val dao: CookieDao
}