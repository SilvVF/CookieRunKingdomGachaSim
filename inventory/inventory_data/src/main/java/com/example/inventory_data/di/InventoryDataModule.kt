package com.example.inventory_data.di

import com.example.core.data.local.CookieDatabase
import com.example.inventory_data.repository.InventoryRepositoryImpl
import com.example.inventory_domain.repository.InventoryRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object InventoryDataModule {


    @Singleton
    @Provides
    fun provideInventoryRepository(
        cookieDatabase: CookieDatabase
    ): InventoryRepository = InventoryRepositoryImpl(cookieDatabase.dao)


}