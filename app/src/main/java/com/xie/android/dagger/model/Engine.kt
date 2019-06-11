package com.xie.android.dagger.model

import com.xie.android.extension.klog

class Engine constructor(var oil: Oil) {
    init {
        klog("engine init.")
    }
}