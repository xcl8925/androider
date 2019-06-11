package com.xiechunlei.android.dagger.injector.module

import com.xiechunlei.android.dagger.model.Engine
import com.xiechunlei.android.dagger.model.Oil
import com.xiechunlei.android.dagger.model.Seat
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