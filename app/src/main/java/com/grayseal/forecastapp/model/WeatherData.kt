package com.grayseal.forecastapp.model

data class WeatherData(
    val city: City,
    val cnt: Int,
    val cod: String,
    val list: List<Item0>,
    val message: Int
)