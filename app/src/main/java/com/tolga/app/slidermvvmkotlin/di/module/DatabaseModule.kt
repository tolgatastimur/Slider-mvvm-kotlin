package com.tolga.app.slidermvvmkotlin.di.module

import android.arch.persistence.room.Room
import android.content.Context
import com.tolga.app.slidermvvmkotlin.db.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun getDatabase(context: Context): AppDatabase {
        return Room.databaseBuilder(context,
                AppDatabase::class.java, "example-db").build()
    }

}