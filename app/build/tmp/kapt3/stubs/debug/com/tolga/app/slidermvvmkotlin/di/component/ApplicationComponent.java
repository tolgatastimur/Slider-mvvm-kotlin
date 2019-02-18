package com.tolga.app.slidermvvmkotlin.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&\u00a8\u0006\u0010"}, d2 = {"Lcom/tolga/app/slidermvvmkotlin/di/component/ApplicationComponent;", "", "app", "Lcom/tolga/app/slidermvvmkotlin/App;", "context", "Landroid/content/Context;", "inject", "", "mainActivityViewModel", "Lcom/tolga/app/slidermvvmkotlin/ui/main/MainActivityViewModel;", "homePageAdapterViewModel", "Lcom/tolga/app/slidermvvmkotlin/ui/main/homepage/HomePageAdapterViewModel;", "homePageViewModel", "Lcom/tolga/app/slidermvvmkotlin/ui/main/homepage/HomePageViewModel;", "preferences", "Landroid/content/SharedPreferences;", "app_debug"})
@dagger.Component(modules = {com.tolga.app.slidermvvmkotlin.di.module.ApplicationModule.class, com.tolga.app.slidermvvmkotlin.di.module.NetModule.class, com.tolga.app.slidermvvmkotlin.di.module.DatabaseModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.tolga.app.slidermvvmkotlin.App app();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context context();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.SharedPreferences preferences();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.tolga.app.slidermvvmkotlin.ui.main.MainActivityViewModel mainActivityViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.tolga.app.slidermvvmkotlin.ui.main.homepage.HomePageViewModel homePageViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.tolga.app.slidermvvmkotlin.ui.main.homepage.HomePageAdapterViewModel homePageAdapterViewModel);
}