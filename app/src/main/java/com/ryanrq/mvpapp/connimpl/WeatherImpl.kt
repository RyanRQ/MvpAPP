package com.ryanrq.mvpapp.connimpl

import com.ryanrq.mvpapp.bean.WeatherBean

/**
 * Created by ryan-rq on 18-3-17.
 */
interface WeatherImpl {
    interface WeatherModleImpl {
        fun requestWeather(cityId: String,weather_Date:String)
    }

    interface WeatherPresenterImpl {
        fun weatherResult(weatherBean: WeatherBean)
        fun requestWeather(cityId: String,weather_Date:String)
    }

    interface WeatherViewImpl {
        fun weatherResult(weatherBean: WeatherBean)
    }
}