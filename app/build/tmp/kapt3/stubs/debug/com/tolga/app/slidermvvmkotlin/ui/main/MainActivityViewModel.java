package com.tolga.app.slidermvvmkotlin.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/tolga/app/slidermvvmkotlin/ui/main/MainActivityViewModel;", "Lcom/tolga/app/slidermvvmkotlin/core/BaseViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "db", "Lcom/tolga/app/slidermvvmkotlin/db/AppDatabase;", "getDb", "()Lcom/tolga/app/slidermvvmkotlin/db/AppDatabase;", "setDb", "(Lcom/tolga/app/slidermvvmkotlin/db/AppDatabase;)V", "getAppName", "", "kotlin.jvm.PlatformType", "app_debug"})
public final class MainActivityViewModel extends com.tolga.app.slidermvvmkotlin.core.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.tolga.app.slidermvvmkotlin.db.AppDatabase db;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tolga.app.slidermvvmkotlin.db.AppDatabase getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.NotNull()
    com.tolga.app.slidermvvmkotlin.db.AppDatabase p0) {
    }
    
    public final java.lang.String getAppName() {
        return null;
    }
    
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}