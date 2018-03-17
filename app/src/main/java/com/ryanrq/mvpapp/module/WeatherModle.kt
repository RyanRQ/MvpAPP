package com.ryanrq.mvpapp.module

import android.util.Log
import com.ryanrq.mvpapp.application.Conntool
import com.ryanrq.mvpapp.bean.BaseBean
import com.ryanrq.mvpapp.bean.WeatherBean
import com.ryanrq.mvpapp.connimpl.WeatherImpl
import com.ryanrq.mvpapp.request.WeatherRequest
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers

/**
 * Created by ryan-rq on 18-3-17.
 */
class WeatherModle(private val presenter: WeatherImpl.WeatherPresenterImpl) : WeatherImpl.WeatherModleImpl {

    override fun requestWeather(cityId: String, weather_Date: String) {
        //todo 请求天气数据
        val request = Conntool.getInstance().create(WeatherRequest::class.java)
        val observable = request.requestWeather(cityId, weather_Date)
        observable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Consumer<BaseBean<WeatherBean>>{
                    override fun accept(t: BaseBean<WeatherBean>?) {
                        Log.e("---数据",t!!.result.toString())
                    }

                })
//        request.requestWeather(cityId, weather_Date).enqueue(object : Callback<BaseBean<WeatherBean>> {
//            override fun onResponse(call: Call<BaseBean<WeatherBean>>?, response: Response<BaseBean<WeatherBean>>?) {
//                Log.e("---数据", response!!.body()!!.result!!.toString())
//            }
//
//            override fun onFailure(call: Call<BaseBean<WeatherBean>>?, t: Throwable?) {
//                Log.e("---数据", call.toString())
//            }
//        })
    }
}

