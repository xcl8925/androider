package com.demo.xiechunlei.dagger.model

import com.demo.xiechunlei.extension.klog

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