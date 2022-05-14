package com.example.gacha_data.di

import com.example.core.data.DefaultCookieList
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class GachaDataModule {

    fun provideDefaultCookieList(): DefaultCookieList {
        return DefaultCookieList()
    }
}