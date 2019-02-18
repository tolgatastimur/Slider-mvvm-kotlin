package com.tolga.app.slidermvvmkotlin.utils.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/tolga/app/slidermvvmkotlin/utils/helpers/DragSwipeCallback;", "", "onItemDismiss", "", "position", "", "onItemMove", "fromPosition", "toPosition", "app_debug"})
public abstract interface DragSwipeCallback {
    
    public abstract void onItemMove(int fromPosition, int toPosition);
    
    public abstract void onItemDismiss(int position);
}