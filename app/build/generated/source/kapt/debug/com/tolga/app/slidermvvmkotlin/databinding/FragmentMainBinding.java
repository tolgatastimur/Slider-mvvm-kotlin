package com.tolga.app.slidermvvmkotlin.databinding;
import com.tolga.app.slidermvvmkotlin.R;
import com.tolga.app.slidermvvmkotlin.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMainBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.swipe_refresh_layout, 1);
        sViewsWithIds.put(R.id.recycler_view, 2);
        sViewsWithIds.put(R.id.floating_action_button, 3);
    }
    // views
    @NonNull
    public final android.support.design.widget.FloatingActionButton floatingActionButton;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerView;
    @NonNull
    public final android.support.v4.widget.SwipeRefreshLayout swipeRefreshLayout;
    // variables
    @Nullable
    private com.tolga.app.slidermvvmkotlin.ui.main.homepage.HomePageViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.floatingActionButton = (android.support.design.widget.FloatingActionButton) bindings[3];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerView = (android.support.v7.widget.RecyclerView) bindings[2];
        this.swipeRefreshLayout = (android.support.v4.widget.SwipeRefreshLayout) bindings[1];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.tolga.app.slidermvvmkotlin.ui.main.homepage.HomePageViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.tolga.app.slidermvvmkotlin.ui.main.homepage.HomePageViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }
    @Nullable
    public com.tolga.app.slidermvvmkotlin.ui.main.homepage.HomePageViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static FragmentMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<FragmentMainBinding>inflate(inflater, com.tolga.app.slidermvvmkotlin.R.layout.fragment_main, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static FragmentMainBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.tolga.app.slidermvvmkotlin.R.layout.fragment_main, null, false), bindingComponent);
    }
    @NonNull
    public static FragmentMainBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentMainBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/fragment_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new FragmentMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}