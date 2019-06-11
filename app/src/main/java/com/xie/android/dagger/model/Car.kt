package com.xie.android.dagger.model

import android.util.Log
import com.xie.android.dagger.injector.component.DaggerCarComponent
import com.xie.android.dagger.injector.module.CarModule
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

