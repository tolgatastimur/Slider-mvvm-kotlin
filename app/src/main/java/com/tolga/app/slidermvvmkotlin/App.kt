package com.tolga.app.slidermvvmkotlin

import com.tolga.app.slidermvvmkotlin.di.component.DaggerApplicationComponent
import com.tolga.app.slidermvvmkotlin.di.module.ApplicationModule

class App : android.app.Application() {

    val component by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}

