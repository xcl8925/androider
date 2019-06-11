package com.xie.android.dagger.model

import com.xie.android.extension.klog

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