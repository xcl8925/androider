package com.xie.android.dagger.injector.component

import com.xie.android.dagger.injector.module.ApplicationModule
import com.xie.android.dagger.model.Size
import dagger.Component

@Component(modules = [ApplicationModule::class])
interface SizeComponent {
    fun inject(size: Size)
}