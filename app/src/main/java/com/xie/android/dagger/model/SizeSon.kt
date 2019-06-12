package com.xie.android.dagger.model

import com.xie.android.App
import com.xie.android.extension.klog
import javax.inject.Inject

class SizeSon private constructor() {
    init {
        klog("sizeson init.")
    }

    @Inject
    constructor(app: App) : this() {
        klog("call app constructor$app")
    }
}