package com.xie.android.dagger.injector.module

import com.xie.android.dagger.model.Engine
import com.xie.android.dagger.model.Oil
import com.xie.android.dagger.model.Seat
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