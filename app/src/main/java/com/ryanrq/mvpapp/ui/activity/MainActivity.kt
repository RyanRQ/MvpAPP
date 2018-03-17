package com.ryanrq.mvpapp.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ryanrq.mvpapp.R
import com.ryanrq.mvpapp.bean.WeatherBean
import com.ryanrq.mvpapp.connimpl.WeatherImpl
import com.ryanrq.mvpapp.presenter.WeatherPresenter

class MainActivity : AppCompatActivity(), WeatherImpl.WeatherViewImpl {
    lateinit var presenter: WeatherImpl.WeatherPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = WeatherPresenter(this)
        presenter.requestWeather("83", "2017-03-15")
    }

    override fun weatherResult(weatherBean: WeatherBean) {
    }
}
