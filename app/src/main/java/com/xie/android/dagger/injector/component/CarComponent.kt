package com.xie.android.dagger.injector.component

import com.xie.android.dagger.injector.module.CarModule
import com.xie.android.dagger.model.Car
import dagger.Component

@Component(modules = [CarModule::class])
interface CarComponent {
    fun inject(car: Car)
}