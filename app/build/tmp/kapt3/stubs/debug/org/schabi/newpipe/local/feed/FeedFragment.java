package org.schabi.newpipe.local.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 Z2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001ZB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020!H\u0016J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0002J*\u0010&\u001a\u00020!2\u0006\u0010\'\u001a\u00020(2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0,H\u0002J\u0016\u0010-\u001a\u00020!2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020*0,H\u0002J\u0010\u0010/\u001a\u00020!2\u0006\u00100\u001a\u000201H\u0003J\u0010\u00102\u001a\u00020!2\u0006\u00103\u001a\u000204H\u0002J\u0010\u00105\u001a\u00020!2\u0006\u00106\u001a\u00020\u0002H\u0016J\b\u00107\u001a\u00020!H\u0016J\b\u00108\u001a\u00020!H\u0014J\u0012\u00109\u001a\u00020!2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0018\u0010<\u001a\u00020!2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0016J&\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010?\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010F\u001a\u00020!H\u0016J\b\u0010G\u001a\u00020!H\u0016J\b\u0010H\u001a\u00020!H\u0016J\u0010\u0010I\u001a\u00020\u00132\u0006\u0010J\u001a\u00020KH\u0016J\b\u0010L\u001a\u00020!H\u0016J\b\u0010M\u001a\u00020!H\u0016J\u001a\u0010N\u001a\u00020!2\u0006\u0010O\u001a\u00020B2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010P\u001a\u00020!H\u0016J\u0006\u0010Q\u001a\u00020!J\b\u0010R\u001a\u00020!H\u0016J\b\u0010S\u001a\u00020!H\u0016J\u0010\u0010T\u001a\u00020!2\u0006\u0010J\u001a\u00020UH\u0002J\b\u0010V\u001a\u00020!H\u0002J\b\u0010W\u001a\u00020!H\u0002J\u0010\u0010X\u001a\u00020!2\u0006\u0010Y\u001a\u00020KH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006["}, d2 = {"Lorg/schabi/newpipe/local/feed/FeedFragment;", "Lorg/schabi/newpipe/fragments/BaseStateFragment;", "Lorg/schabi/newpipe/local/feed/FeedState;", "()V", "_feedBinding", "Lorg/schabi/newpipe/databinding/FragmentFeedBinding;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "feedBinding", "getFeedBinding", "()Lorg/schabi/newpipe/databinding/FragmentFeedBinding;", "groupAdapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/GroupieViewHolder;", "groupId", "", "groupName", "", "isRefreshing", "", "listState", "Landroid/os/Parcelable;", "listenerStreamItem", "", "oldestSubscriptionUpdate", "Ljava/time/OffsetDateTime;", "onSettingsChangeListener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "showPlayedItems", "updateListViewModeOnResume", "viewModel", "Lorg/schabi/newpipe/local/feed/FeedViewModel;", "doInitialLoadLogic", "", "handleError", "handleErrorState", "errorState", "Lorg/schabi/newpipe/local/feed/FeedState$ErrorState;", "handleFeedNotAvailable", "subscriptionEntity", "Lorg/schabi/newpipe/database/subscription/SubscriptionEntity;", "cause", "", "nextItemsErrors", "", "handleItemsErrors", "errors", "handleLoadedState", "loadedState", "Lorg/schabi/newpipe/local/feed/FeedState$LoadedState;", "handleProgressState", "progressState", "Lorg/schabi/newpipe/local/feed/FeedState$ProgressState;", "handleResult", "result", "hideLoading", "initListeners", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyOptionsMenu", "onDestroyView", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onViewCreated", "rootView", "reloadContent", "setupListViewMode", "showEmptyState", "showLoading", "showStreamDialog", "Lorg/schabi/newpipe/extractor/stream/StreamInfoItem;", "updateRefreshViewState", "updateRelativeTimeViews", "updateTogglePlayedItemsButton", "menuItem", "Companion", "app_debug"})
public final class FeedFragment extends org.schabi.newpipe.fragments.BaseStateFragment<org.schabi.newpipe.local.feed.FeedState> {
    private org.schabi.newpipe.databinding.FragmentFeedBinding _feedBinding;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private org.schabi.newpipe.local.feed.FeedViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    @icepick.State()
    public android.os.Parcelable listState;
    private long groupId = -1L;
    private java.lang.String groupName = "";
    private java.time.OffsetDateTime oldestSubscriptionUpdate;
    private com.xwray.groupie.GroupAdapter<com.xwray.groupie.GroupieViewHolder> groupAdapter;
    @kotlin.jvm.JvmField()
    @icepick.State()
    public boolean showPlayedItems = true;
    private android.content.SharedPreferences.OnSharedPreferenceChangeListener onSettingsChangeListener;
    private boolean updateListViewModeOnResume = false;
    private boolean isRefreshing = false;
    private final java.lang.Object listenerStreamItem = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipe.local.feed.FeedFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_GROUP_ID = "ARG_GROUP_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_GROUP_NAME = "ARG_GROUP_NAME";
    
    public FeedFragment() {
        super();
    }
    
    private final org.schabi.newpipe.databinding.FragmentFeedBinding getFeedBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View rootView, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    public final void setupListViewMode() {
    }
    
    @java.lang.Override()
    protected void initListeners() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyOptionsMenu() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void updateTogglePlayedItemsButton(android.view.MenuItem menuItem) {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    @java.lang.Override()
    public void showEmptyState() {
    }
    
    @java.lang.Override()
    public void handleResult(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.local.feed.FeedState result) {
    }
    
    @java.lang.Override()
    public void handleError() {
    }
    
    private final void handleProgressState(org.schabi.newpipe.local.feed.FeedState.ProgressState progressState) {
    }
    
    private final void showStreamDialog(org.schabi.newpipe.extractor.stream.StreamInfoItem item) {
    }
    
    @android.annotation.SuppressLint(value = {"StringFormatMatches"})
    private final void handleLoadedState(org.schabi.newpipe.local.feed.FeedState.LoadedState loadedState) {
    }
    
    private final boolean handleErrorState(org.schabi.newpipe.local.feed.FeedState.ErrorState errorState) {
        return false;
    }
    
    private final void handleItemsErrors(java.util.List<? extends java.lang.Throwable> errors) {
    }
    
    private final void handleFeedNotAvailable(org.schabi.newpipe.database.subscription.SubscriptionEntity subscriptionEntity, @androidx.annotation.Nullable()
    java.lang.Throwable cause, java.util.List<? extends java.lang.Throwable> nextItemsErrors) {
    }
    
    private final void updateRelativeTimeViews() {
    }
    
    private final void updateRefreshViewState() {
    }
    
    @java.lang.Override()
    protected void doInitialLoadLogic() {
    }
    
    @java.lang.Override()
    public void reloadContent() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final org.schabi.newpipe.local.feed.FeedFragment newInstance(long groupId, @org.jetbrains.annotations.Nullable()
    java.lang.String groupName) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/schabi/newpipe/local/feed/FeedFragment$Companion;", "", "()V", "KEY_GROUP_ID", "", "KEY_GROUP_NAME", "newInstance", "Lorg/schabi/newpipe/local/feed/FeedFragment;", "groupId", "", "groupName", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final org.schabi.newpipe.local.feed.FeedFragment newInstance(long groupId, @org.jetbrains.annotations.Nullable()
        java.lang.String groupName) {
            return null;
        }
    }
}