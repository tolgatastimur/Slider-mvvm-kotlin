package com.tolga.app.slidermvvmkotlin.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\'J\r\u0010\u0017\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010\u0011J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0016\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u0019H&J\u0012\u0010 \u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J$\u0010#\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010%\u001a\u00020\u0019H\u0016J\b\u0010&\u001a\u00020\u0019H\u0016J\u0006\u0010\'\u001a\u00020\u0019R\u001c\u0010\t\u001a\u00028\u0001X\u0096.\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006("}, d2 = {"Lcom/tolga/app/slidermvvmkotlin/core/BaseFragment;", "VM", "Lcom/tolga/app/slidermvvmkotlin/core/BaseViewModel;", "DB", "Landroid/databinding/ViewDataBinding;", "Landroid/support/v4/app/Fragment;", "mViewModelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "mBinding", "getMBinding", "()Landroid/databinding/ViewDataBinding;", "setMBinding", "(Landroid/databinding/ViewDataBinding;)V", "Landroid/databinding/ViewDataBinding;", "viewModel", "getViewModel", "()Lcom/tolga/app/slidermvvmkotlin/core/BaseViewModel;", "setViewModel", "(Lcom/tolga/app/slidermvvmkotlin/core/BaseViewModel;)V", "Lcom/tolga/app/slidermvvmkotlin/core/BaseViewModel;", "getLayoutRes", "", "getViewM", "hideProgress", "", "init", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "initViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "onInject", "refresh", "showProgress", "app_debug"})
public abstract class BaseFragment<VM extends com.tolga.app.slidermvvmkotlin.core.BaseViewModel, DB extends android.databinding.ViewDataBinding> extends android.support.v4.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public VM viewModel;
    @org.jetbrains.annotations.NotNull()
    public DB mBinding;
    private final java.lang.Class<VM> mViewModelClass = null;
    
    @org.jetbrains.annotations.NotNull()
    public final VM getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    VM p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public DB getMBinding() {
        return null;
    }
    
    public void setMBinding(@org.jetbrains.annotations.NotNull()
    DB p0) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container) {
    }
    
    public void init() {
    }
    
    @android.support.annotation.LayoutRes()
    public abstract int getLayoutRes();
    
    public abstract void initViewModel();
    
    private final VM getViewM() {
        return null;
    }
    
    public void onInject() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void showProgress() {
    }
    
    public final void hideProgress() {
    }
    
    public void refresh() {
    }
    
    public BaseFragment(@org.jetbrains.annotations.NotNull()
    java.lang.Class<VM> mViewModelClass) {
        super();
    }
}