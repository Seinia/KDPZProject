package com.example.kdpzproject.data.interfaces

import com.example.kdpzproject.data.models.CatData
import retrofit2.http.GET
import retrofit2.http.Query

interface AnimeApiInterface {
    @GET("facts")
suspend fun getCat(@Query("limit") limit: Int): CatData
}