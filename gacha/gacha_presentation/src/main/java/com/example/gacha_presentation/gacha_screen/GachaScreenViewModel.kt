package com.example.gacha_presentation.gacha_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gacha_domain.repository.use_cases.DetermineShouldPopulateDb
import com.example.gacha_domain.repository.use_cases.GachaUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GachaScreenViewModel @Inject constructor(
    private val gachaUseCases: GachaUseCases
): ViewModel() {

    init {
        viewModelScope.launch {
            gachaUseCases.determineShouldPopulateDb()
        }
    }

}