package com.tolga.app.slidermvvmkotlin.utils.helpers

interface DragSwipeCallback{
    fun onItemMove(fromPosition: Int, toPosition: Int)

    fun onItemDismiss(position: Int)
}