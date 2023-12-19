package com.example.projectpertamasadham.Network.Movies

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
object   MoviesNetwork {
    val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("http://192.168.191.23:5000")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MoviesAPI::class.java)
    }
}