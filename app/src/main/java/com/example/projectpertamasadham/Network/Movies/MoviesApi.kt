package com.example.projectpertamasadham.Network.Movies

import retrofit2.http.GET

interface MoviesAPI {

    @GET("api/movies")
    suspend fun getMovies(): ResponseMovies


}