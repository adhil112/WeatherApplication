package com.grayseal.forecastapp.network

import com.grayseal.forecastapp.model.Weather
import com.grayseal.forecastapp.model.WeatherData
import com.grayseal.forecastapp.utils.Constants
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Singleton


@Singleton
interface WeatherApi {
    @GET(value = "data/2.5/forecast")
    suspend fun getWeather(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("units") units: String = "metric",
        @Query("appid") appid: String = Constants.API_KEY
    ): WeatherData

    @GET(value = "data/2.5/forecast")
    suspend fun getWeatherData(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("units") units: String = "metric",
        @Query("appid") appid: String = Constants.API_KEY
    ): WeatherData
}