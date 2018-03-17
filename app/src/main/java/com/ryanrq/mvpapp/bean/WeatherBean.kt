package com.ryanrq.mvpapp.bean

/**
 * Created by ryan-rq on 18-3-17.
 */
data class WeatherBean(
        val city_id: String = "",
        val day_weather: String = "",
        val night_weather: String = "",
        val day_temp: String = "",
        val night_temp: String = "",
        val day_wind: String = "",
        val night_wind: String = ""

) {
    override fun toString(): String {
        return "WeatherBean(city_id='$city_id', day_weather='$day_weather', night_weather='$night_weather', day_temp='$day_temp', night_temp='$night_temp', day_wind='$day_wind', night_wind='$night_wind')"
    }
}
