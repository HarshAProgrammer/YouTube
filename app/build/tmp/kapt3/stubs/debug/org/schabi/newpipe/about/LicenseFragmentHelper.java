package org.schabi.newpipe.about;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u00a8\u0006\u0011"}, d2 = {"Lorg/schabi/newpipe/about/LicenseFragmentHelper;", "", "()V", "getFormattedLicense", "", "context", "Landroid/content/Context;", "license", "Lorg/schabi/newpipe/about/License;", "getHexRGBColor", "color", "", "getLicenseStylesheet", "showLicense", "Lio/reactivex/rxjava3/disposables/Disposable;", "component", "Lorg/schabi/newpipe/about/SoftwareComponent;", "app_debug"})
public final class LicenseFragmentHelper {
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipe.about.LicenseFragmentHelper INSTANCE = null;
    
    private LicenseFragmentHelper() {
        super();
    }
    
    /**
     * @param context the context to use
     * @param license the license
     * @return String which contains a HTML formatted license page
     * styled according to the context's theme
     */
    private final java.lang.String getFormattedLicense(android.content.Context context, org.schabi.newpipe.about.License license) {
        return null;
    }
    
    /**
     * @param context the Android context
     * @return String which is a CSS stylesheet according to the context's theme
     */
    private final java.lang.String getLicenseStylesheet(android.content.Context context) {
        return null;
    }
    
    /**
     * Cast R.color to a hexadecimal color value.
     *
     * @param context the context to use
     * @param color   the color number from R.color
     * @return a six characters long String with hexadecimal RGB values
     */
    private final java.lang.String getHexRGBColor(android.content.Context context, int color) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final io.reactivex.rxjava3.disposables.Disposable showLicense(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.about.License license) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final io.reactivex.rxjava3.disposables.Disposable showLicense(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.about.SoftwareComponent component) {
        return null;
    }
}