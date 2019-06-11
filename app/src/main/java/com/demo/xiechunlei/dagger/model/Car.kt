package com.demo.xiechunlei.dagger.model

import android.util.Log
import com.demo.xiechunlei.dagger.injector.component.DaggerCarComponent
import com.demo.xiechunlei.dagger.injector.module.CarModule
import javax.inject.Inject

class Car {

    @Inject
    lateinit var engine: Engine
    @Inject
    lateinit var seat: Seat

    init {
        Log.e(this.javaClass.simpleName, "car init.")

        DaggerCarComponent.builder().carModule(CarModule()).build().inject(this)
    }
}

