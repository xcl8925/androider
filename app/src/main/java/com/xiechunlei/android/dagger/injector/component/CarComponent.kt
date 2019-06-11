package com.xiechunlei.android.dagger.injector.component

import com.xiechunlei.android.dagger.injector.module.CarModule
import com.xiechunlei.android.dagger.model.Car
import dagger.Component

@Component(modules = [CarModule::class])
interface CarComponent {
    fun inject(car: Car)
}