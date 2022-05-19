package com.example.gacha_domain.repository.use_cases

data class GachaUseCases(

    val determineShouldPopulateDb: DetermineShouldPopulateDb,
    val getCookieList: GetCookieList,
    val updateCookieInfo: UpdateCookieInfo,
    val performCookieGacha: PerformCookieGacha,
    val filterCookieList: FilterCookieList,
    val deleteInventory: DeleteInventory
)
