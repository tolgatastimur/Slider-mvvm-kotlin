package com.tolga.app.slidermvvmkotlin.utils.extensions

import android.content.Context
import android.support.annotation.ColorRes
import android.support.v4.content.ContextCompat

fun Context.getColorCompat(@ColorRes resourceId: Int) = ContextCompat.getColor(this, resourceId)