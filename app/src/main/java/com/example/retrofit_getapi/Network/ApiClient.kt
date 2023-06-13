package com.example.retrofit_getapi.Network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private const val BASE_URL = "https://apitani.burunghantu.id/sub/restapi-slim/public/"
    //url tanpa end poin

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val apiService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}
//disini terdapat URL tanpa End Point (datamahasiswa/)
//jadi end poin nya akan ditaruh di API Service