package com.ryanrq.mvpapp.presenter

/**
 * Created by ryan-rq on 18-3-17.
 */
interface BasePresenter<T> {
    val ERROR_TIME_OUT: Int
        get() = 0

    val ERROR_REQUEST_ERROR: Int
        get() = 1

    fun onSuccess(t: T)
    fun onError(code: Int)
}