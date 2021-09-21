package org.schabi.newpipe.about;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0003\u000b\f\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000e"}, d2 = {"Lorg/schabi/newpipe/about/AboutActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "AboutFragment", "AboutStateAdapter", "Companion", "app_debug"})
public final class AboutActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipe.about.AboutActivity.Companion Companion = null;
    
    /**
     * List of all software components.
     */
    private static final org.schabi.newpipe.about.SoftwareComponent[] SOFTWARE_COMPONENTS = null;
    private static final int POS_ABOUT = 0;
    private static final int POS_LICENSE = 1;
    private static final int TOTAL_COUNT = 2;
    
    public AboutActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    /**
     * A placeholder fragment containing a simple view.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0014\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u00a8\u0006\u0010"}, d2 = {"Lorg/schabi/newpipe/about/AboutActivity$AboutFragment;", "Landroidx/fragment/app/Fragment;", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "openLink", "", "Landroid/widget/Button;", "url", "", "app_debug"})
    public static final class AboutFragment extends androidx.fragment.app.Fragment {
        
        public AboutFragment() {
            super();
        }
        
        private final void openLink(android.widget.Button $this$openLink, int url) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
        android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
        android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState) {
            return null;
        }
    }
    
    /**
     * A [FragmentStateAdapter] that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/schabi/newpipe/about/AboutActivity$AboutStateAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fa", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "app_debug"})
    static final class AboutStateAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
        
        public AboutStateAdapter(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity fa) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.fragment.app.Fragment createFragment(int position) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/schabi/newpipe/about/AboutActivity$Companion;", "", "()V", "POS_ABOUT", "", "POS_LICENSE", "SOFTWARE_COMPONENTS", "", "Lorg/schabi/newpipe/about/SoftwareComponent;", "[Lorg/schabi/newpipe/about/SoftwareComponent;", "TOTAL_COUNT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}