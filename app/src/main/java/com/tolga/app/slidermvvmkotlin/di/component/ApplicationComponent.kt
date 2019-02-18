package com.tolga.app.slidermvvmkotlin.di.component

import android.content.Context
import android.content.SharedPreferences
import com.tolga.app.slidermvvmkotlin.App
import com.tolga.app.slidermvvmkotlin.di.module.ApplicationModule
import com.tolga.app.slidermvvmkotlin.di.module.DatabaseModule
import com.tolga.app.slidermvvmkotlin.ui.main.MainActivityViewModel

import com.tolga.app.slidermvvmkotlin.di.module.NetModule
import com.tolga.app.slidermvvmkotlin.ui.main.homepage.HomePageAdapterViewModel
import com.tolga.app.slidermvvmkotlin.ui.main.homepage.HomePageViewModel

import dagger.Component
import javax.inject.Singleton


@Singleton

@Component(modules = arrayOf(ApplicationModule::class,NetModule::class,DatabaseModule::class))


interface ApplicationComponent {
    fun app(): App


    fun context(): Context

    fun preferences(): SharedPreferences

    fun inject(mainActivityViewModel: MainActivityViewModel)
    fun inject(homePageViewModel: HomePageViewModel)
    fun inject(homePageAdapterViewModel: HomePageAdapterViewModel)
}
