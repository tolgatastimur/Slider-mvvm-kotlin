/*
 * Copyright (C) 2015 Paul Burke
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tolga.app.slidermvvmkotlin.ui.main.homepage


import android.app.Activity
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.util.DiffUtil
import android.view.LayoutInflater
import android.view.ViewGroup
import com.tolga.app.slidermvvmkotlin.R
import com.tolga.app.slidermvvmkotlin.core.BaseAdapter
import com.tolga.app.slidermvvmkotlin.core.Constants
import com.tolga.app.slidermvvmkotlin.databinding.ItemCurBinding
import com.tolga.app.slidermvvmkotlin.service.response.CurResponse

class HomePageAdapter(private val clickCallback: ((CurResponse, Int) -> Unit)?) : BaseAdapter<CurResponse>(diffCallback) {
    override fun createBinding(parent: ViewGroup, viewType: Int): ViewDataBinding {
        val viewModel = HomePageAdapterViewModel((parent.context as Activity).application)
        val binding: ItemCurBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_cur,
                parent,
                false)

        binding.viewModel = viewModel
        binding.itemProductRoot.setOnClickListener{
            binding.viewModel?.item?.get()?.let {
                clickCallback?.invoke(it, Constants.CALLBACK_TYPE.CUR_ID)
            }        }
        return binding
    }

    override fun bind(binding: ViewDataBinding, position: Int) {
        (binding as ItemCurBinding).viewModel?.item?.set(getItem(position))
        binding.executePendingBindings()
    }


    companion object {
        val diffCallback = object : DiffUtil.ItemCallback<CurResponse>() {
            override fun areItemsTheSame(oldItem: CurResponse?, newItem: CurResponse?) = oldItem == newItem

            override fun areContentsTheSame(oldItem: CurResponse?, newItem: CurResponse?) =
                    oldItem == newItem

        }
    }
}
