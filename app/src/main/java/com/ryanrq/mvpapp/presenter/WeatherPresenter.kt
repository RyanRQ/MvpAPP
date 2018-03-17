package com.ryanrq.mvpapp.presenter

import com.ryanrq.mvpapp.bean.WeatherBean
import com.ryanrq.mvpapp.connimpl.WeatherImpl
import com.ryanrq.mvpapp.module.WeatherModle

/**
 * Created by ryan-rq on 18-3-17.
 */
class WeatherPresenter(private val control: WeatherImpl.WeatherViewImpl) : WeatherImpl.WeatherPresenterImpl {
    val modle = WeatherModle(this)
    override fun weatherResult(weatherBean: WeatherBean) {
        control.weatherResult(weatherBean)
    }

    override fun requestWeather(cityId: String, weather_Date: String) {
        modle.requestWeather(cityId, weather_Date)
    }
}