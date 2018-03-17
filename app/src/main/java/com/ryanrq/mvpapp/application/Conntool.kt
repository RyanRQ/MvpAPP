package com.ryanrq.mvpapp.application

import DefaultValue
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by ryan-rq on 18-3-17.
 */

object Conntool {
    private val client = OkHttpClient.Builder()
            .connectTimeout(2000, TimeUnit.MILLISECONDS)
            .addInterceptor(CommonInterceptor())
            .build()
    private val retrofit = Retrofit.Builder()
            .baseUrl("http://v.juhe.cn/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(client)
            .build()

    fun getInstance(): Retrofit {
        return retrofit
    }

    class CommonInterceptor : Interceptor {
        override fun intercept(p0: Interceptor.Chain?): okhttp3.Response {
            val new_request = p0!!.request().newBuilder()
                    .url(p0.request().url().newBuilder().addQueryParameter("key", DefaultValue.API_KEY).build())
                    .build()
            return p0.proceed(new_request)
        }
    }
}