package com.example.inventory_domain.use_cases

import com.example.inventory_domain.models.InventoryCookie
import com.example.inventory_domain.repository.InventoryRepository

class GetAllCookiesFromDb(
    private val repository: InventoryRepository
) {

     suspend operator fun invoke(): List<InventoryCookie> {
         val list = repository.getListOfCookies()
         val seen = mutableMapOf<String, InventoryCookie>()
         list.forEach {
             if (it.name in seen){
                 if ((seen[it.name]?.soulStoneCount ?: 0) < it.soulStoneCount) {
                     seen[it.name] = it
                 }
                 return@forEach
             }
             seen[it.name] = it
         }
         return seen.values.toList()
     }
}