package com.example.gacha_domain.di

import com.example.core.data.preferences.Preferences
import com.example.gacha_domain.repository.GachaRepository
import com.example.gacha_domain.repository.use_cases.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
object GachaDomainModule {

    @Provides
    @ViewModelScoped
    fun provideGahcaUseCases(
        preferences: Preferences,
        repository: GachaRepository,
    ): GachaUseCases {
        return GachaUseCases(
            DetermineShouldPopulateDb(preferences, repository),
            GetCookieList(repository),
            UpdateCookieInfo(repository),
            PerformCookieGacha(repository),
            FilterCookieList(),
            DeleteInventory(repository)
        )
    }
}