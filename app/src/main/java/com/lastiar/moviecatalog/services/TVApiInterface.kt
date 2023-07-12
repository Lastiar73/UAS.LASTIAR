package com.lastiar.moviecatalog.services

import com.lastiar.moviecatalog.models.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/movie/popular?api_key=31a3ee807378c96dbae5e6dd5ae86879")
    fun getTVList(): Call<TVResponse>

}