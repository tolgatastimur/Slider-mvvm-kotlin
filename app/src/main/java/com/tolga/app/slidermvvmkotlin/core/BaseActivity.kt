package com.tolga.app.slidermvvmkotlin.core

import android.app.Dialog
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity
import com.tolga.app.slidermvvmkotlin.utils.ProgressDialog

abstract class BaseActivity<VM : BaseViewModel, DB : ViewDataBinding>(private val mViewModelClass: Class<VM>) : AppCompatActivity() {

    var dialog: Dialog? = null

    @LayoutRes
    abstract fun getLayoutRes(): Int

    val binding by lazy {
        DataBindingUtil.setContentView(this, getLayoutRes()) as DB
    }

    val viewModel by lazy {
        ViewModelProviders.of(this).get(mViewModelClass)
    }

    /**
     * If you want to inject Dependency Injection
     * on your activity, you can override this.
     */
    open fun onInject() {}

    override fun onCreate(savedInstanceState: Bundle?) {
        initViewModel(viewModel)
        initDialog()

        super.onCreate(savedInstanceState)

        onInject()
    }

    private fun initDialog() {
        dialog = ProgressDialog.progressDialog(this)
    }
    abstract fun initViewModel(viewModel: VM)
}





