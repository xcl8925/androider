package com.xie.android.dagger.model

import com.xie.android.extension.klog
import javax.inject.Inject

class Size constructor() {
    @Inject
    lateinit var oil: Oil

    @Inject
    lateinit var sizeSon: SizeSon

    init {
        klog("size init.")
    }
}