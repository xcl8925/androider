package com.xie.android.dagger.model

import android.util.Log
import com.xie.android.dagger.injector.component.DaggerCarComponent
import com.xie.android.dagger.injector.module.CarModule
import com.xie.android.dagger.injector.qualifier.SeatColor
import javax.inject.Inject
import javax.inject.Named

class Car {

    @Inject
    lateinit var engine: Engine
    @Inject
    @field:Named("0")
    lateinit var seat: Seat

    init {
        Log.e(this.javaClass.simpleName, "car init.")

        DaggerCarComponent.builder().carModule(CarModule()).build().inject(this)
    }
}

