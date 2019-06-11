package com.xie.android.dagger.injector.component

import com.xie.android.MainActivity
import com.xie.android.dagger.injector.module.ApplicationModule
import dagger.Component

@Component(modules = [ApplicationModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}