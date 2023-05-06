package com.example.kdpzproject.data.factories

import com.example.kdpzproject.data.interfaces.AnimeApiInterface
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiFactory {


    const val BASE_URL = "https://catfact.ninja/"

    val animeApi: AnimeApiInterface = createRetrofit().create(AnimeApiInterface::class.java)

    private fun createRetrofit(): Retrofit
    {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY

        val client = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


        return retrofit
    }


}