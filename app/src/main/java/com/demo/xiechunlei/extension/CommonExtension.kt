package com.demo.xiechunlei.extension

import android.util.Log

inline fun <reified T> T.klog(msg: String) {
    Log.e(T::class.java.simpleName, msg)
}