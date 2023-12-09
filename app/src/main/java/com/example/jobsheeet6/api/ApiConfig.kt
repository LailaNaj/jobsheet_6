package com.example.jobsheeet6.api

import com.example.jobsheeet6.api.ApiConfig.getRetrofit
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiConfig {
    const val baseURL = "https://rickandmortyapi.com/api/"

    fun getRetrofit() : Retrofit{
        return Retrofit.Builder().baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getService() : ApiService {
        return getRetrofit().create(ApiService::class.java)
    }


}