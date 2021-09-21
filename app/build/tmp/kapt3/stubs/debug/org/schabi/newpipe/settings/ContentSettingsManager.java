package org.schabi.newpipe.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/schabi/newpipe/settings/ContentSettingsManager;", "", "fileLocator", "Lorg/schabi/newpipe/settings/NewPipeFileLocator;", "(Lorg/schabi/newpipe/settings/NewPipeFileLocator;)V", "deleteSettingsFile", "", "ensureDbDirectoryExists", "", "exportDatabase", "preferences", "Landroid/content/SharedPreferences;", "file", "Lorg/schabi/newpipe/streams/io/StoredFileHelper;", "extractDb", "extractSettings", "loadSharedPreferences", "app_debug"})
public final class ContentSettingsManager {
    private final org.schabi.newpipe.settings.NewPipeFileLocator fileLocator = null;
    
    public ContentSettingsManager(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.settings.NewPipeFileLocator fileLocator) {
        super();
    }
    
    /**
     * Exports given [SharedPreferences] to the file in given outputPath.
     * It also creates the file.
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public final void exportDatabase(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences preferences, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.streams.io.StoredFileHelper file) throws java.lang.Exception {
    }
    
    public final void deleteSettingsFile() {
    }
    
    /**
     * Tries to create database directory if it does not exist.
     *
     * @return Whether the directory exists afterwards.
     */
    public final boolean ensureDbDirectoryExists() {
        return false;
    }
    
    public final boolean extractDb(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.streams.io.StoredFileHelper file) {
        return false;
    }
    
    public final boolean extractSettings(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.streams.io.StoredFileHelper file) {
        return false;
    }
    
    public final void loadSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences preferences) {
    }
}