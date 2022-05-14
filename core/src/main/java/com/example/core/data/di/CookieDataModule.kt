package com.example.core.data.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import com.example.core.data.DefaultCookieList
import com.example.core.data.local.CookieDatabase
import com.example.core.data.local.entity.CookieEntity
import com.example.core.data.preferences.Preferences
import com.example.core.data.repository.CookieRepositoryImpl
import com.example.core.domain.CookieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CookieDataModule {

    @Provides
    @Singleton
    fun provideCookieDatabase(app: Application):CookieDatabase {
        return Room.databaseBuilder(
            app,
            CookieDatabase::class.java,
            "cookie.db"
        ).enableMultiInstanceInvalidation()
            .build()
    }

    @Provides
    @Singleton //provides the preferences with the shared preferences
    fun provideSharedPreferences(
        app: Application
    ): SharedPreferences {
        return app.getSharedPreferences("shared_pref", Context.MODE_PRIVATE)
    }

    @Provides
    @Singleton
    fun provideDefaultCookieList(): DefaultCookieList = DefaultCookieList()

    @Provides
    @Singleton
    fun provideCookieRepository(
        db: CookieDatabase,
        defaultCookieList: DefaultCookieList
    ): CookieRepository = CookieRepositoryImpl(dao = db.dao, defaultCookieList)

}