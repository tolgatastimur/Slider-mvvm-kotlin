package com.tolga.app.slidermvvmkotlin.utils.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J@\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\fH\u0016J \u0010\u0017\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/tolga/app/slidermvvmkotlin/utils/helpers/SimpleItemTouchHelperCallback;", "Landroid/support/v7/widget/helper/ItemTouchHelper$Callback;", "callback", "Lcom/tolga/app/slidermvvmkotlin/utils/helpers/DragSwipeCallback;", "(Lcom/tolga/app/slidermvvmkotlin/utils/helpers/DragSwipeCallback;)V", "getMovementFlags", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "viewHolder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "isItemViewSwipeEnabled", "", "isLongPressDragEnabled", "onChildDraw", "", "c", "Landroid/graphics/Canvas;", "dX", "", "dY", "actionState", "isCurrentlyActive", "onMove", "source", "target", "onSwiped", "i", "Companion", "app_debug"})
public final class SimpleItemTouchHelperCallback extends android.support.v7.widget.helper.ItemTouchHelper.Callback {
    private final com.tolga.app.slidermvvmkotlin.utils.helpers.DragSwipeCallback callback = null;
    private static final float ALPHA_FULL = 1.0F;
    public static final com.tolga.app.slidermvvmkotlin.utils.helpers.SimpleItemTouchHelperCallback.Companion Companion = null;
    
    @java.lang.Override()
    public boolean isLongPressDragEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isItemViewSwipeEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public int getMovementFlags(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.ViewHolder viewHolder) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean onMove(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.ViewHolder source, @org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.ViewHolder target) {
        return false;
    }
    
    @java.lang.Override()
    public void onSwiped(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
    }
    
    @java.lang.Override()
    public void onChildDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
    }
    
    public SimpleItemTouchHelperCallback(@org.jetbrains.annotations.NotNull()
    com.tolga.app.slidermvvmkotlin.utils.helpers.DragSwipeCallback callback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tolga/app/slidermvvmkotlin/utils/helpers/SimpleItemTouchHelperCallback$Companion;", "", "()V", "ALPHA_FULL", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}