package com.example.inventory_domain.di

import com.example.inventory_domain.repository.InventoryRepository
import com.example.inventory_domain.use_cases.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object InventoryDomainModule {

    @ViewModelScoped
    @Provides
    fun provideInventoryUseCases(
        repository: InventoryRepository
    ): InventoryUseCases {
        return InventoryUseCases(
            getAllCookiesFromDb = GetAllCookiesFromDb(repository),
            getCookieById = GetCookieById(repository),
            getCookieByName = GetCookieByName(repository),
        )
    }
}