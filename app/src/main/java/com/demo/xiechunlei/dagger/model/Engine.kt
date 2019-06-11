package com.demo.xiechunlei.dagger.model

import com.demo.xiechunlei.extension.klog

class Engine constructor(var oil: Oil) {
    init {
        klog("engine init.")
    }
}