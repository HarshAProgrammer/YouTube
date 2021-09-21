package org.schabi.newpipe.local.feed.item;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000201B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\t\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\u001d\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\u0012\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\rH\u0016J\b\u0010&\u001a\u00020\u0017H\u0016J\u0018\u0010\'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010)\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\t\u0010*\u001a\u00020\u0017H\u00d6\u0001J\u0010\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020-H\u0014J\b\u0010.\u001a\u00020\u001fH\u0016J\t\u0010/\u001a\u00020\"H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u00062"}, d2 = {"Lorg/schabi/newpipe/local/feed/item/StreamItem;", "Lcom/xwray/groupie/viewbinding/BindableItem;", "Lorg/schabi/newpipe/databinding/ListStreamItemBinding;", "streamWithState", "Lorg/schabi/newpipe/database/stream/StreamWithState;", "itemVersion", "Lorg/schabi/newpipe/local/feed/item/StreamItem$ItemVersion;", "(Lorg/schabi/newpipe/database/stream/StreamWithState;Lorg/schabi/newpipe/local/feed/item/StreamItem$ItemVersion;)V", "getItemVersion", "()Lorg/schabi/newpipe/local/feed/item/StreamItem$ItemVersion;", "setItemVersion", "(Lorg/schabi/newpipe/local/feed/item/StreamItem$ItemVersion;)V", "stateProgressTime", "", "Ljava/lang/Long;", "stream", "Lorg/schabi/newpipe/database/stream/model/StreamEntity;", "getStreamWithState", "()Lorg/schabi/newpipe/database/stream/StreamWithState;", "bind", "", "viewBinding", "position", "", "payloads", "", "", "component1", "component2", "copy", "equals", "", "other", "getFormattedRelativeUploadDate", "", "context", "Landroid/content/Context;", "getId", "getLayout", "getSpanSize", "spanCount", "getStreamInfoDetailLine", "hashCode", "initializeViewBinding", "view", "Landroid/view/View;", "isLongClickable", "toString", "Companion", "ItemVersion", "app_debug"})
public final class StreamItem extends com.xwray.groupie.viewbinding.BindableItem<org.schabi.newpipe.databinding.ListStreamItemBinding> {
    @org.jetbrains.annotations.NotNull()
    private final org.schabi.newpipe.database.stream.StreamWithState streamWithState = null;
    @org.jetbrains.annotations.NotNull()
    private org.schabi.newpipe.local.feed.item.StreamItem.ItemVersion itemVersion;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipe.local.feed.item.StreamItem.Companion Companion = null;
    public static final int UPDATE_RELATIVE_TIME = 1;
    private final org.schabi.newpipe.database.stream.model.StreamEntity stream = null;
    private final java.lang.Long stateProgressTime = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipe.local.feed.item.StreamItem copy(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.database.stream.StreamWithState streamWithState, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.local.feed.item.StreamItem.ItemVersion itemVersion) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public StreamItem(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.database.stream.StreamWithState streamWithState, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.local.feed.item.StreamItem.ItemVersion itemVersion) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipe.database.stream.StreamWithState component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipe.database.stream.StreamWithState getStreamWithState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipe.local.feed.item.StreamItem.ItemVersion component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipe.local.feed.item.StreamItem.ItemVersion getItemVersion() {
        return null;
    }
    
    public final void setItemVersion(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.local.feed.item.StreamItem.ItemVersion p0) {
    }
    
    @java.lang.Override()
    public long getId() {
        return 0L;
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.schabi.newpipe.databinding.ListStreamItemBinding initializeViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.databinding.ListStreamItemBinding viewBinding, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.databinding.ListStreamItemBinding viewBinding, int position) {
    }
    
    @java.lang.Override()
    public boolean isLongClickable() {
        return false;
    }
    
    private final java.lang.String getStreamInfoDetailLine(android.content.Context context) {
        return null;
    }
    
    private final java.lang.String getFormattedRelativeUploadDate(android.content.Context context) {
        return null;
    }
    
    @java.lang.Override()
    public int getSpanSize(int spanCount, int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lorg/schabi/newpipe/local/feed/item/StreamItem$ItemVersion;", "", "(Ljava/lang/String;I)V", "NORMAL", "MINI", "GRID", "app_debug"})
    public static enum ItemVersion {
        /*public static final*/ NORMAL /* = new NORMAL() */,
        /*public static final*/ MINI /* = new MINI() */,
        /*public static final*/ GRID /* = new GRID() */;
        
        ItemVersion() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/schabi/newpipe/local/feed/item/StreamItem$Companion;", "", "()V", "UPDATE_RELATIVE_TIME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}