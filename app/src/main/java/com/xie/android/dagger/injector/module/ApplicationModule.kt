package com.xie.android.dagger.injector.module

import com.xie.android.App
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {
    @Provides
    fun provideApplication(): App {
        return App.instance
    }
}