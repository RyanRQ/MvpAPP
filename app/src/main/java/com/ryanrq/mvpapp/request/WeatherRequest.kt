package com.ryanrq.mvpapp.request

import com.ryanrq.mvpapp.bean.BaseBean
import com.ryanrq.mvpapp.bean.WeatherBean
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by ryan-rq on 18-3-17.
 */
interface WeatherRequest {
    @GET("historyWeather/weather")
    fun requestWeather(@Query("city_id") city_id: String, @Query("weather_date") weather_date: String): Observable<BaseBean<WeatherBean>>
}