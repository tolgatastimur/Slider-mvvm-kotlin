package com.tolga.app.slidermvvmkotlin.service

import com.tolga.app.slidermvvmkotlin.service.response.OfficialRateResponse
import com.tolga.app.slidermvvmkotlin.service.response.CurResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface NbrbAPI {
    @GET("Currencies")
    fun getCategoriesById(): Observable<List<CurResponse>>

    @GET("Rates/{abbreviation}?ParamMode=2")
    fun getOfficialRate(@Path("abbreviation") id: String): Observable<OfficialRateResponse>
}