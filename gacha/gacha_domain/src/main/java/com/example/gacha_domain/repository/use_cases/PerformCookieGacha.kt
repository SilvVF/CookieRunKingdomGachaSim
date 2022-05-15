package com.example.gacha_domain.repository.use_cases

import com.example.gacha_domain.models.GachaCookie
import com.example.gacha_domain.models.Rarity
import com.example.gacha_domain.repository.GachaRepository


class PerformCookieGacha(
    private val repository: GachaRepository
) {
    private val resultList = mutableListOf<GachaCookie>()
    private val ancientList = mutableListOf<GachaCookie>()
    private val commonList = mutableListOf<GachaCookie>()
    private val rareList = mutableListOf<GachaCookie>()
    private val epicList = mutableListOf<GachaCookie>()
    private val superEpicList = mutableListOf<GachaCookie>()
    private val specialList = mutableListOf<GachaCookie>()
    private val legendaryList = mutableListOf<GachaCookie>()

    //common - 41.615%
    //rare - 37.296%
    //epic & super-epic 19.218%
    //legendary & ancient 1.810%

    suspend operator fun invoke(): List<GachaCookie> {

       repository.getAllCookies().forEach { cookie ->
           when (cookie.rarity) {
               is Rarity.Ancient -> ancientList.add(cookie)
               is Rarity.Legendary -> legendaryList.add(cookie)
               is Rarity.Rare -> rareList.add(cookie)
               is Rarity.Epic -> epicList.add(cookie)
               is Rarity.SuperEpic -> superEpicList.add(cookie)
               is Rarity.Special -> specialList.add(cookie)
               is Rarity.Common -> commonList.add(cookie)
           }
       }

        when ((0..100000).random()) {
            in (0..41615) -> drawFromCommon()
            in (41616..78911) -> drawFromRare()
            in (78912..98192) -> drawFromEpic()
            else -> drawFromAncientAndLegendary()
        }
        return resultList
    }

    private suspend fun drawFromAncientAndLegendary() {
        val ancientOrLegendary = if ((0..1).random() == 0) Rarity.Ancient else Rarity.Legendary
        when ((0..1000).random()) {
            in (0..301) ->  {
                when (ancientOrLegendary) {
                    is Rarity.Ancient -> updateCookieSoulStone(legendaryList.random())
                    else -> updateCookieSoulStone(legendaryList.random())
                }
            }
            else -> {}
        }
    }

    private fun drawFromEpic() {
        TODO("Not yet implemented")
    }

    private fun drawFromRare() {
        TODO("Not yet implemented")
    }

    private fun drawFromCommon() {
        TODO("Not yet implemented")
    }

    private suspend fun updateCookieSoulStone(cookie: GachaCookie){
        val randomSoulStoneAmount = (3..5).random()
        repository.updateCookie(
            cookie.name,
            randomSoulStoneAmount
        )
        resultList.add(
            cookie.copy(
                isFullCookie = false,
                soulStoneCount = randomSoulStoneAmount
            )
        )
    }
    private suspend fun updateFullCookie(name: String){
        repository.updateCookie(
            name,
           20
        )
    }
}