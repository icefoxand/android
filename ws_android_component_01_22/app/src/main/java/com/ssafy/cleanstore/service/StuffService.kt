package com.ssafy.cleanstore.service

import com.ssafy.cleanstore.dto.Fruit
import retrofit2.http.GET

interface StuffService {
    @GET("items.json")
    suspend fun getAllItems() : MutableList<Fruit>
}