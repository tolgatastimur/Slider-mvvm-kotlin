package com.tolga.app.slidermvvmkotlin.di.module

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.tolga.app.slidermvvmkotlin.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(var app: App) {


    @Provides
    @Singleton
    fun provideApp(): App = app

    @Provides
    @Singleton
    fun provideContext(): Context = app.applicationContext

    @Provides
    @Singleton
    fun provideSharedPreferences(): SharedPreferences = PreferenceManager.getDefaultSharedPreferences(app)
}
