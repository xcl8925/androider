package com.xiechunlei.android.dagger.model

import com.xiechunlei.android.extension.klog

class Engine constructor(var oil: Oil) {
    init {
        klog("engine init.")
    }
}