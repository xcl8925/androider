package com.xie.android.dagger.model

import com.xie.android.extension.klog
import javax.inject.Inject

class Oil @Inject constructor() {
    init {
        klog("oil init.")
    }
}