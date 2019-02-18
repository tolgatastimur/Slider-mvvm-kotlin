package com.tolga.app.slidermvvmkotlin.ui.main.homepage

import android.app.Application
import com.tolga.app.slidermvvmkotlin.App
import com.tolga.app.slidermvvmkotlin.core.BaseViewModel
import com.tolga.app.slidermvvmkotlin.db.AppDatabase
import com.tolga.app.slidermvvmkotlin.service.NbrbAPI
import com.tolga.app.slidermvvmkotlin.service.response.CurResponse
import com.tolga.app.slidermvvmkotlin.service.response.OfficialRateResponse
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Named

class HomePageViewModel(app: Application):BaseViewModel(app ) {
    @Inject
    lateinit var db: AppDatabase

    @field:[Inject Named("Anonym")]
    lateinit var api: NbrbAPI

    init {
        (app as? App)?.component?.inject(this)
    }

     fun getCur(): Observable<List<CurResponse>> {
        return api.getCategoriesById()
    }

    fun getOfficialRate(abbreviation: String): Observable<OfficialRateResponse> {
        return api.getOfficialRate(abbreviation)
    }
}