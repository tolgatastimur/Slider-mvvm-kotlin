package com.tolga.app.slidermvvmkotlin.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.tolga.app.slidermvvmkotlin.db.dao.ExampleDao
import com.tolga.app.slidermvvmkotlin.db.entities.Example

@Database(entities = arrayOf(Example::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao
}