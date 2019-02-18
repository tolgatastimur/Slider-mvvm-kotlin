package com.tolga.app.slidermvvmkotlin.ui.main.homepage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0002J(\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014j\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0017H\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0002J\b\u0010\u001c\u001a\u00020\u0012H\u0016J\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0015H\u0002J\b\u0010\"\u001a\u00020\u0012H\u0002R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/tolga/app/slidermvvmkotlin/ui/main/homepage/HomePageFragment;", "Lcom/tolga/app/slidermvvmkotlin/core/BaseFragment;", "Lcom/tolga/app/slidermvvmkotlin/ui/main/homepage/HomePageViewModel;", "error/NonExistentClass", "()V", "curList", "Ljava/util/ArrayList;", "Lcom/tolga/app/slidermvvmkotlin/service/response/CurResponse;", "Lkotlin/collections/ArrayList;", "getCurList", "()Ljava/util/ArrayList;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "mItemTouchHelper", "Landroid/support/v7/widget/helper/ItemTouchHelper;", "checkLocationPermission", "", "getData", "", "getLatitudeLongitude", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getLayoutRes", "", "init", "initAdapter", "initViewModel", "shareWithEmail", "()Lkotlin/Unit;", "showCurDetail", "abbreviation", "curName", "updateLayout", "app_debug"})
public final class HomePageFragment extends com.tolga.app.slidermvvmkotlin.core.BaseFragment<com.tolga.app.slidermvvmkotlin.ui.main.homepage.HomePageViewModel, error.NonExistentClass> {
    private android.support.v7.widget.helper.ItemTouchHelper mItemTouchHelper;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.tolga.app.slidermvvmkotlin.service.response.CurResponse> curList = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.tolga.app.slidermvvmkotlin.service.response.CurResponse> getCurList() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @java.lang.Override()
    public void initViewModel() {
    }
    
    @java.lang.Override()
    public void init() {
    }
    
    private final void getData() {
    }
    
    private final void initAdapter() {
    }
    
    private final void updateLayout() {
    }
    
    private final void showCurDetail(java.lang.String abbreviation, java.lang.String curName) {
    }
    
    private final kotlin.Unit shareWithEmail() {
        return null;
    }
    
    public final boolean checkLocationPermission() {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final java.util.HashMap<java.lang.String, java.lang.Double> getLatitudeLongitude() {
        return null;
    }
    
    public HomePageFragment() {
        super(null);
    }
}