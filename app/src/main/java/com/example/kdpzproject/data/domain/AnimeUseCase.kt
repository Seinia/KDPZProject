package com.example.kdpzproject.data.domain

import com.example.kdpzproject.data.models.CatData
import com.example.kdpzproject.data.factories.ApiFactory

object AnimeUseCase {

    val api = ApiFactory.animeApi

    suspend fun getCat() : CatData
    {
        val anime = api.getCat(4)
        return anime
    }
}