package com.tolga.app.slidermvvmkotlin.databinding;
import com.tolga.app.slidermvvmkotlin.R;
import com.tolga.app.slidermvvmkotlin.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCurBindingImpl extends ItemCurBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.itemProductRoot, 5);
    }
    // views
    @NonNull
    private final android.support.v7.widget.CardView mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCurBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemCurBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[5]
            );
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setViewModel((com.tolga.app.slidermvvmkotlin.ui.main.homepage.HomePageAdapterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.tolga.app.slidermvvmkotlin.ui.main.homepage.HomePageAdapterViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelItem((android.databinding.ObservableField<com.tolga.app.slidermvvmkotlin.service.response.CurResponse>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelItem(android.databinding.ObservableField<com.tolga.app.slidermvvmkotlin.service.response.CurResponse> ViewModelItem, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.lang.String viewModelItemGetCurCode = null;
        android.databinding.ObservableField<com.tolga.app.slidermvvmkotlin.service.response.CurResponse> viewModelItem = null;
        java.lang.String viewModelItemGetCurNameEng = null;
        java.lang.String viewModelItemGetCurName = null;
        java.lang.String viewModelItemGetCurNameBel = null;
        com.tolga.app.slidermvvmkotlin.service.response.CurResponse viewModelItemGet = null;
        com.tolga.app.slidermvvmkotlin.ui.main.homepage.HomePageAdapterViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.item
                    viewModelItem = viewModel.getItem();
                }
                updateRegistration(0, viewModelItem);


                if (viewModelItem != null) {
                    // read viewModel.item.get()
                    viewModelItemGet = viewModelItem.get();
                }


                if (viewModelItemGet != null) {
                    // read viewModel.item.get().curCode
                    viewModelItemGetCurCode = viewModelItemGet.getCurCode();
                    // read viewModel.item.get().curNameEng
                    viewModelItemGetCurNameEng = viewModelItemGet.getCurNameEng();
                    // read viewModel.item.get().curName
                    viewModelItemGetCurName = viewModelItemGet.getCurName();
                    // read viewModel.item.get().curNameBel
                    viewModelItemGetCurNameBel = viewModelItemGet.getCurNameBel();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelItemGetCurCode);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelItemGetCurName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelItemGetCurNameBel);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelItemGetCurNameEng);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.item
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}