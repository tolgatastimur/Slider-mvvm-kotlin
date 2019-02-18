package com.tolga.app.slidermvvmkotlin.ui.main.homepage

import android.app.Application
import android.databinding.ObservableField
import com.tolga.app.slidermvvmkotlin.core.BaseViewModel
import com.tolga.app.slidermvvmkotlin.service.response.CurResponse

class HomePageAdapterViewModel(app: Application) : BaseViewModel(app) {
    var item: ObservableField<CurResponse> = ObservableField()
}