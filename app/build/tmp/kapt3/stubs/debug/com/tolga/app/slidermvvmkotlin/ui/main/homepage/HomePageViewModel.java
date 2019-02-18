package com.tolga.app.slidermvvmkotlin.ui.main.homepage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\u0006\u0010\u0017\u001a\u00020\u0018R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/tolga/app/slidermvvmkotlin/ui/main/homepage/HomePageViewModel;", "Lcom/tolga/app/slidermvvmkotlin/core/BaseViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "api", "Lcom/tolga/app/slidermvvmkotlin/service/NbrbAPI;", "getApi", "()Lcom/tolga/app/slidermvvmkotlin/service/NbrbAPI;", "setApi", "(Lcom/tolga/app/slidermvvmkotlin/service/NbrbAPI;)V", "db", "Lcom/tolga/app/slidermvvmkotlin/db/AppDatabase;", "getDb", "()Lcom/tolga/app/slidermvvmkotlin/db/AppDatabase;", "setDb", "(Lcom/tolga/app/slidermvvmkotlin/db/AppDatabase;)V", "getCur", "Lio/reactivex/Observable;", "", "Lcom/tolga/app/slidermvvmkotlin/service/response/CurResponse;", "getOfficialRate", "Lcom/tolga/app/slidermvvmkotlin/service/response/OfficialRateResponse;", "abbreviation", "", "app_debug"})
public final class HomePageViewModel extends com.tolga.app.slidermvvmkotlin.core.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.tolga.app.slidermvvmkotlin.db.AppDatabase db;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Anonym")
    @javax.inject.Inject()
    public com.tolga.app.slidermvvmkotlin.service.NbrbAPI api;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tolga.app.slidermvvmkotlin.db.AppDatabase getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.NotNull()
    com.tolga.app.slidermvvmkotlin.db.AppDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tolga.app.slidermvvmkotlin.service.NbrbAPI getApi() {
        return null;
    }
    
    public final void setApi(@org.jetbrains.annotations.NotNull()
    com.tolga.app.slidermvvmkotlin.service.NbrbAPI p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.tolga.app.slidermvvmkotlin.service.response.CurResponse>> getCur() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.tolga.app.slidermvvmkotlin.service.response.OfficialRateResponse> getOfficialRate(@org.jetbrains.annotations.NotNull()
    java.lang.String abbreviation) {
        return null;
    }
    
    public HomePageViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}