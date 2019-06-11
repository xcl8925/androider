package com.xiechunlei.android.dagger.injector.module

import com.xiechunlei.android.App
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {
    @Provides
    fun provideApplication(): App {
        return App.instance
    }
}