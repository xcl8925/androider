package com.xie.android.dagger.model

import com.xie.android.extension.klog
import javax.inject.Inject

class Seat @Inject constructor() {

    constructor(height: Double) : this() {
        klog("height:$height")
    }

    constructor(color: String) : this() {
        klog("color:$color")
    }

    init {
        klog("Seat init.")
    }

    fun seat() {
        klog("seat seat")
    }
}