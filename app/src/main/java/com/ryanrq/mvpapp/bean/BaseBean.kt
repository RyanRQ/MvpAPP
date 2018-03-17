package com.ryanrq.mvpapp.bean

/**
 * Created by ryan-rq on 18-3-17.
 */
open class BaseBean<T>(
        val reason: String = "",
        val error_code: String = "",
        val result: T? = null
)