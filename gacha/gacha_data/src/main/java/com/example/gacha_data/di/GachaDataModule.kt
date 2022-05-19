package com.example.gacha_data.di

import com.example.core.data.local.CookieDatabase
import com.example.gacha_data.local.DefaultCookieList
import com.example.gacha_data.repository.GachaRepositoryImpl
import com.example.gacha_domain.repository.GachaRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object GachaDataModule {

    @Singleton
    @Provides
    fun provideDefaultCookieList(): DefaultCookieList {
        return DefaultCookieList
    }

    @Singleton
    @Provides
    fun provideGachaRepository(
        db: CookieDatabase,
        defaultCookieList: DefaultCookieList
    ): GachaRepository {
        return GachaRepositoryImpl(db.dao, defaultCookieList)
    }
}