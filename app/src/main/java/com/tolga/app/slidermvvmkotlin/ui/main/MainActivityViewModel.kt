package com.tolga.app.slidermvvmkotlin.ui.main

import android.app.Application
import com.tolga.app.slidermvvmkotlin.db.AppDatabase
import com.tolga.app.slidermvvmkotlin.R
import com.tolga.app.slidermvvmkotlin.App
import com.tolga.app.slidermvvmkotlin.core.BaseViewModel
import javax.inject.Inject

class MainActivityViewModel(app: Application) : BaseViewModel(app) {
    // private var examples: LiveData<List<Example>>? = null

    @Inject
    lateinit var db: AppDatabase

    init {
        (app as? App)?.component?.inject(this)
    }

    fun getAppName() = getApplication<Application>().resources.getString(R.string.app_name)


}