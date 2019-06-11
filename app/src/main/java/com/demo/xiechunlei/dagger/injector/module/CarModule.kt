package com.demo.xiechunlei.dagger.injector.module

import com.demo.xiechunlei.dagger.model.Engine
import com.demo.xiechunlei.dagger.model.Oil
import com.demo.xiechunlei.dagger.model.Seat
import dagger.Module
import dagger.Provides

@Module
class CarModule {
    @Provides
    fun provideEngine(oil: Oil): Engine {
        return Engine(oil)
    }

    @Provides
    fun provideOil(): Oil {
        return Oil()
    }

    @Provides
    fun provideSeat(): Seat {
        return Seat(12.1)
    }
}