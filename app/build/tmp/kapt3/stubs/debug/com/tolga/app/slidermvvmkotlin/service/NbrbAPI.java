package com.tolga.app.slidermvvmkotlin.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/tolga/app/slidermvvmkotlin/service/NbrbAPI;", "", "getCategoriesById", "Lio/reactivex/Observable;", "", "Lcom/tolga/app/slidermvvmkotlin/service/response/CurResponse;", "getOfficialRate", "Lcom/tolga/app/slidermvvmkotlin/service/response/OfficialRateResponse;", "id", "", "app_debug"})
public abstract interface NbrbAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "Currencies")
    public abstract io.reactivex.Observable<java.util.List<com.tolga.app.slidermvvmkotlin.service.response.CurResponse>> getCategoriesById();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "Rates/{abbreviation}?ParamMode=2")
    public abstract io.reactivex.Observable<com.tolga.app.slidermvvmkotlin.service.response.OfficialRateResponse> getOfficialRate(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "abbreviation")
    java.lang.String id);
}