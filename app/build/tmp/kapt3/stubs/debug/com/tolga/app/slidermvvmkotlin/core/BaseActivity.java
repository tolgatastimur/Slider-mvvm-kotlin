package com.tolga.app.slidermvvmkotlin.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0018\u001a\u00020\u0019H\'J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u001bH\u0016R\u001b\u0010\t\u001a\u00028\u00018FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00028\u00008FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\""}, d2 = {"Lcom/tolga/app/slidermvvmkotlin/core/BaseActivity;", "VM", "Lcom/tolga/app/slidermvvmkotlin/core/BaseViewModel;", "DB", "Landroid/databinding/ViewDataBinding;", "Landroid/support/v7/app/AppCompatActivity;", "mViewModelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "binding", "getBinding", "()Landroid/databinding/ViewDataBinding;", "binding$delegate", "Lkotlin/Lazy;", "dialog", "Landroid/app/Dialog;", "getDialog", "()Landroid/app/Dialog;", "setDialog", "(Landroid/app/Dialog;)V", "viewModel", "getViewModel", "()Lcom/tolga/app/slidermvvmkotlin/core/BaseViewModel;", "viewModel$delegate", "getLayoutRes", "", "initDialog", "", "initViewModel", "(Lcom/tolga/app/slidermvvmkotlin/core/BaseViewModel;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onInject", "app_debug"})
public abstract class BaseActivity<VM extends com.tolga.app.slidermvvmkotlin.core.BaseViewModel, DB extends android.databinding.ViewDataBinding> extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private android.app.Dialog dialog;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private final java.lang.Class<VM> mViewModelClass = null;
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Dialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.Nullable()
    android.app.Dialog p0) {
    }
    
    @android.support.annotation.LayoutRes()
    public abstract int getLayoutRes();
    
    @org.jetbrains.annotations.NotNull()
    public final DB getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final VM getViewModel() {
        return null;
    }
    
    /**
     * * If you want to inject Dependency Injection
     *     * on your activity, you can override this.
     */
    public void onInject() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initDialog() {
    }
    
    public abstract void initViewModel(@org.jetbrains.annotations.NotNull()
    VM viewModel);
    
    public BaseActivity(@org.jetbrains.annotations.NotNull()
    java.lang.Class<VM> mViewModelClass) {
        super();
    }
}