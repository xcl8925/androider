package com.demo.xiechunlei.dagger.injector.component

import com.demo.xiechunlei.dagger.injector.module.CarModule
import com.demo.xiechunlei.dagger.model.Car
import dagger.Component

@Component(modules = [CarModule::class])
interface CarComponent {
    fun inject(car: Car)
}