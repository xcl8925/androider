package com.xiechunlei.android.dagger.injector.component

import com.xiechunlei.android.MainActivity
import com.xiechunlei.android.dagger.injector.module.ApplicationModule
import dagger.Component

@Component(modules = [ApplicationModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}