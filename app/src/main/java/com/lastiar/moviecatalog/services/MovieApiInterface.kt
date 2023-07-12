package com.lastiar.moviecatalog.services

import retrofit2.Call
import com.lastiar.moviecatalog.models.MovieResponse
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=31a3ee807378c96dbae5e6dd5ae86879")
    fun getMovieList(): Call<MovieResponse>

}