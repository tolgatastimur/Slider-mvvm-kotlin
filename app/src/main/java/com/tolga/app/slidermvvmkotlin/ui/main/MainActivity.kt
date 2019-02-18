package com.tolga.app.slidermvvmkotlin.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.tolga.app.slidermvvmkotlin.R
import com.tolga.app.slidermvvmkotlin.core.BaseActivity
import com.tolga.app.slidermvvmkotlin.databinding.ActivityMainBinding
import com.tolga.app.slidermvvmkotlin.ui.main.homepage.HomePageFragment

class MainActivity : BaseActivity<MainActivityViewModel, ActivityMainBinding>(MainActivityViewModel::class.java) {

    override fun initViewModel(viewModel: MainActivityViewModel) {
        binding.viewModel = viewModel
    }

    override fun getLayoutRes() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initFragment()
    }




    fun initFragment(){
        var homePageFragment=HomePageFragment()
       addFragment(homePageFragment,R.id.fragment_container)
                }

    fun AppCompatActivity.addFragment(fragment: Fragment,frameId: Int){
        supportFragmentManager.beginTransaction().add(frameId,fragment)
                .commit()
    }
}



