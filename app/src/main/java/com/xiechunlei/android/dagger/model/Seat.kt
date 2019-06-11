package com.xiechunlei.android.dagger.model

import com.xiechunlei.android.extension.klog

class Seat constructor() {

    constructor(height: Double) : this() {
        klog("height:$height")
    }

    init {
        klog("Seat init.")
    }

    fun seat() {
        klog("seat seat")
    }
}