package com.demo.xiechunlei.dagger.injector.component

import com.demo.xiechunlei.dagger.MainActivity
import com.demo.xiechunlei.dagger.injector.module.ApplicationModule
import dagger.Component

@Component(modules = [ApplicationModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}