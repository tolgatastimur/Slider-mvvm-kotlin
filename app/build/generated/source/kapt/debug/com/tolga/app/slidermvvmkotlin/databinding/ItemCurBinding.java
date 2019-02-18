package com.tolga.app.slidermvvmkotlin.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ItemCurBinding extends ViewDataBinding {
    @NonNull
    public final android.widget.LinearLayout itemProductRoot;
    // variables
    protected com.tolga.app.slidermvvmkotlin.ui.main.homepage.HomePageAdapterViewModel mViewModel;
    protected ItemCurBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.LinearLayout itemProductRoot1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.itemProductRoot = itemProductRoot1;
    }
    //getters and abstract setters
    public abstract void setViewModel(@Nullable com.tolga.app.slidermvvmkotlin.ui.main.homepage.HomePageAdapterViewModel ViewModel);
    @Nullable
    public com.tolga.app.slidermvvmkotlin.ui.main.homepage.HomePageAdapterViewModel getViewModel() {
        return mViewModel;
    }
    @NonNull
    public static ItemCurBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemCurBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemCurBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemCurBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ItemCurBinding>inflate(inflater, com.tolga.app.slidermvvmkotlin.R.layout.item_cur, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemCurBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ItemCurBinding>inflate(inflater, com.tolga.app.slidermvvmkotlin.R.layout.item_cur, null, false, bindingComponent);
    }
    @NonNull
    public static ItemCurBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ItemCurBinding)bind(bindingComponent, view, com.tolga.app.slidermvvmkotlin.R.layout.item_cur);
    }
}