package com.example.core.data.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.example.core.data.local.CookieDatabase
import com.example.core.data.preferences.DefaultPreferences
import com.example.core.data.preferences.Preferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object CookieDataModule {

    @Provides
    @Singleton
    fun provideCookieDatabase(app: Application):CookieDatabase {
        return Room.databaseBuilder(
            app,
            CookieDatabase::class.java,
            "cookie.db"
        ).build()
    }

    @Provides
    @Singleton //provides the preferences with the shared preferences
    fun provideSharedPreferences(
        app: Application
    ): Preferences {
        return DefaultPreferences(
            app.getSharedPreferences("shared_pref", Context.MODE_PRIVATE)
        )
    }
}