package com.elyeproj.DaggerExp.network

import com.elyeproj.DaggerExp.module.GetPropertyDetails
import com.elyeproj.DaggerExp.module.MovieResponse
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.*

const val authURL                           = "user.info?handles=DmitriyH;Fefer_Ivan"

interface ApiInterface {
    fun goApi()
    @GET(authURL)
    fun getInfo(): Observable<GetPropertyDetails>
    @GET(authURL)
    fun getInfos(): Call<GetPropertyDetails>

    @GET("/filippella/Sample-API-Files/master/json/movies-api.json")
    fun getMovies(): Observable<MovieResponse>
}