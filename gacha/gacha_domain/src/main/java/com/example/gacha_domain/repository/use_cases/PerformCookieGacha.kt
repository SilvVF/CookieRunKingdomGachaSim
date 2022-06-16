package com.example.gacha_domain.repository.use_cases

import android.util.Log
import com.example.gacha_domain.models.GachaCookie
import com.example.gacha_domain.models.Rarity
import com.example.gacha_domain.repository.GachaRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext
import java.lang.Math.random
import kotlin.random.Random


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
        resultList.clear()
        ancientList.clear()
        commonList.clear()
        rareList.clear()
        epicList.clear()
        superEpicList.clear()
        specialList.clear()
        ancientList.clear()
        legendaryList.clear()
       repository.getDefaultList().forEach { cookie ->
           when (cookie.rarity) {
               is Rarity.Ancient -> ancientList.add(cookie)
               is Rarity.Legendary -> legendaryList.add(cookie)
               is Rarity.Rare -> rareList.add(cookie)
               is Rarity.SuperEpic -> superEpicList.add(cookie)
               is Rarity.Special -> specialList.add(cookie)
               is Rarity.Common -> commonList.add(cookie)
               else -> epicList.add(cookie)
           }
       }
        val rand = Random
        repeat(10) {
            withContext(Dispatchers.IO) {
                when (rand.nextInt(0,100000)) {
                    in (0..41615) -> drawFromCommon()
                    in (41616..78911) -> drawFromRare()
                    in (78912..98192) -> drawFromEpic()
                    else -> drawFromAncientAndLegendary()
                }
            }
        }
        return resultList.map { it }.toList()
    }

    private suspend fun drawFromAncientAndLegendary() {
        val ancientOrLegendary = if ((0..1).random() == 0) Rarity.Ancient else Rarity.Legendary
        when ((0..1000).random()) {
            in (0..301) ->  {
                when (ancientOrLegendary) {
                    is Rarity.Ancient -> updateFullCookie(ancientList.random())
                    else -> updateFullCookie(legendaryList.random())
                }
            }
            else -> {
                when (ancientOrLegendary) {
                    is Rarity.Ancient -> updateCookieSoulStone(ancientList.random())
                    else -> updateCookieSoulStone(legendaryList.random())
                }
            }
        }
    }

    private suspend fun drawFromEpic() {
        when((0..482).random()) {
            in (0..72) -> updateFullCookie(epicList.random())
            else -> updateCookieSoulStone(epicList.random())
        }
    }

    private suspend fun drawFromRare(){
        when ((0..2682).random()){
            in (0..375) -> updateFullCookie(rareList.random())
            else -> updateCookieSoulStone(rareList.random())
        }
    }

    private suspend fun drawFromCommon() {
        when ((0..5981).random()) {
            in (0..1367) -> updateFullCookie(commonList.random())
            else -> updateCookieSoulStone(commonList.random())
        }
    }

    private suspend fun updateCookieSoulStone(cookie: GachaCookie) {
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
    private suspend fun updateFullCookie(cookie: GachaCookie){
        repository.updateCookie(
            cookie.name,
            20
        )
        resultList.add(
            cookie.copy(
                isFullCookie = true,
                soulStoneCount = 20
            )
        )
    }
}