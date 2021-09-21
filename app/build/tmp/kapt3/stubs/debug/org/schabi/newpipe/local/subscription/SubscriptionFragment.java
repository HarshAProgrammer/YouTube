package org.schabi.newpipe.local.subscription;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00d6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ]2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001]B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u001fH\u0002J\b\u00101\u001a\u00020/H\u0014J\u0016\u00102\u001a\u00020/2\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0002J\u0010\u00106\u001a\u00020/2\u0006\u00107\u001a\u00020\u0002H\u0016J\b\u00108\u001a\u00020/H\u0016J\u001a\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0014J\u0010\u0010>\u001a\u00020/2\u0006\u0010?\u001a\u00020@H\u0016J\u0012\u0010A\u001a\u00020/2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u0018\u0010B\u001a\u00020/2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0016J&\u0010G\u001a\u0004\u0018\u00010;2\u0006\u0010E\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010J2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010K\u001a\u00020/H\u0016J\b\u0010L\u001a\u00020/H\u0002J\u0010\u0010M\u001a\u00020/2\u0006\u0010N\u001a\u00020OH\u0002J\b\u0010P\u001a\u00020/H\u0002J\b\u0010Q\u001a\u00020/H\u0016J\b\u0010R\u001a\u00020/H\u0016J\b\u0010S\u001a\u00020/H\u0002J\u0010\u0010T\u001a\u00020/2\u0006\u00107\u001a\u00020UH\u0002J\u0010\u0010V\u001a\u00020/2\u0006\u00107\u001a\u00020UH\u0002J\b\u0010W\u001a\u00020/H\u0002J\b\u0010X\u001a\u00020/H\u0002J\b\u0010Y\u001a\u00020/H\u0016J\u0010\u0010Z\u001a\u00020/2\u0006\u00100\u001a\u00020\u001fH\u0002J\u0010\u0010[\u001a\u00020/2\u0006\u0010\\\u001a\u00020\u001aH\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001bR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030!0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010$0$0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010$0$0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006^"}, d2 = {"Lorg/schabi/newpipe/local/subscription/SubscriptionFragment;", "Lorg/schabi/newpipe/fragments/BaseStateFragment;", "Lorg/schabi/newpipe/local/subscription/SubscriptionViewModel$SubscriptionState;", "()V", "_binding", "Lorg/schabi/newpipe/databinding/FragmentSubscriptionBinding;", "binding", "getBinding", "()Lorg/schabi/newpipe/databinding/FragmentSubscriptionBinding;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "feedGroupsCarousel", "Lorg/schabi/newpipe/local/subscription/item/FeedGroupCarouselItem;", "feedGroupsListState", "Landroid/os/Parcelable;", "feedGroupsSection", "Lcom/xwray/groupie/Section;", "feedGroupsSortMenuItem", "Lorg/schabi/newpipe/local/subscription/item/HeaderWithMenuItem;", "groupAdapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/viewbinding/GroupieViewHolder;", "Lorg/schabi/newpipe/databinding/FeedItemCarouselBinding;", "importExportItem", "Lorg/schabi/newpipe/local/subscription/item/FeedImportExportItem;", "importExportItemExpandedState", "", "Ljava/lang/Boolean;", "itemsListState", "listenerChannelItem", "Lorg/schabi/newpipe/util/OnClickGesture;", "Lorg/schabi/newpipe/extractor/channel/ChannelInfoItem;", "listenerFeedGroups", "Lcom/xwray/groupie/Item;", "requestExportLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "requestImportLauncher", "subscriptionBroadcastReceiver", "Landroid/content/BroadcastReceiver;", "subscriptionManager", "Lorg/schabi/newpipe/local/subscription/SubscriptionManager;", "subscriptionsSection", "viewModel", "Lorg/schabi/newpipe/local/subscription/SubscriptionViewModel;", "deleteChannel", "", "selectedItem", "doInitialLoadLogic", "handleFeedGroups", "groups", "", "Lcom/xwray/groupie/Group;", "handleResult", "result", "hideLoading", "initViews", "rootView", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onExportSelected", "onImportFromServiceSelected", "serviceId", "", "onImportPreviousSelected", "onPause", "onResume", "openReorderDialog", "requestExportResult", "Landroidx/activity/result/ActivityResult;", "requestImportResult", "setupBroadcastReceiver", "setupInitialLayout", "showLoading", "showLongTapDialog", "startLoading", "forceLoad", "Companion", "app_debug"})
public final class SubscriptionFragment extends org.schabi.newpipe.fragments.BaseStateFragment<org.schabi.newpipe.local.subscription.SubscriptionViewModel.SubscriptionState> {
    private org.schabi.newpipe.databinding.FragmentSubscriptionBinding _binding;
    private org.schabi.newpipe.local.subscription.SubscriptionViewModel viewModel;
    private org.schabi.newpipe.local.subscription.SubscriptionManager subscriptionManager;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private android.content.BroadcastReceiver subscriptionBroadcastReceiver;
    private final com.xwray.groupie.GroupAdapter<com.xwray.groupie.viewbinding.GroupieViewHolder<org.schabi.newpipe.databinding.FeedItemCarouselBinding>> groupAdapter = null;
    private final com.xwray.groupie.Section feedGroupsSection = null;
    private org.schabi.newpipe.local.subscription.item.FeedGroupCarouselItem feedGroupsCarousel;
    private org.schabi.newpipe.local.subscription.item.FeedImportExportItem importExportItem;
    private org.schabi.newpipe.local.subscription.item.HeaderWithMenuItem feedGroupsSortMenuItem;
    private final com.xwray.groupie.Section subscriptionsSection = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestExportLauncher = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestImportLauncher = null;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    @icepick.State()
    public android.os.Parcelable itemsListState;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    @icepick.State()
    public android.os.Parcelable feedGroupsListState;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    @icepick.State()
    public java.lang.Boolean importExportItemExpandedState;
    private final org.schabi.newpipe.util.OnClickGesture<com.xwray.groupie.Item<?>> listenerFeedGroups = null;
    private final org.schabi.newpipe.util.OnClickGesture<org.schabi.newpipe.extractor.channel.ChannelInfoItem> listenerChannelItem = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipe.local.subscription.SubscriptionFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String JSON_MIME_TYPE = "application/json";
    
    public SubscriptionFragment() {
        super();
    }
    
    private final org.schabi.newpipe.databinding.FragmentSubscriptionBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
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
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    private final void setupBroadcastReceiver() {
    }
    
    private final void onImportFromServiceSelected(int serviceId) {
    }
    
    private final void onImportPreviousSelected() {
    }
    
    private final void onExportSelected() {
    }
    
    private final void openReorderDialog() {
    }
    
    private final void requestExportResult(androidx.activity.result.ActivityResult result) {
    }
    
    private final void requestImportResult(androidx.activity.result.ActivityResult result) {
    }
    
    private final void setupInitialLayout() {
    }
    
    @java.lang.Override()
    protected void initViews(@org.jetbrains.annotations.NotNull()
    android.view.View rootView, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showLongTapDialog(org.schabi.newpipe.extractor.channel.ChannelInfoItem selectedItem) {
    }
    
    private final void deleteChannel(org.schabi.newpipe.extractor.channel.ChannelInfoItem selectedItem) {
    }
    
    @java.lang.Override()
    protected void doInitialLoadLogic() {
    }
    
    @java.lang.Override()
    protected void startLoading(boolean forceLoad) {
    }
    
    @java.lang.Override()
    public void handleResult(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.local.subscription.SubscriptionViewModel.SubscriptionState result) {
    }
    
    private final void handleFeedGroups(java.util.List<? extends com.xwray.groupie.Group> groups) {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/schabi/newpipe/local/subscription/SubscriptionFragment$Companion;", "", "()V", "JSON_MIME_TYPE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}