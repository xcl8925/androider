package com.demo.xiechunlei.dagger.injector.module

import com.demo.xiechunlei.dagger.App
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {
    @Provides
    fun provideApplication(): App {
        return App.instance
    }
}