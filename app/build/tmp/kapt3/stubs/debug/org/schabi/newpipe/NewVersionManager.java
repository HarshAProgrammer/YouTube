package org.schabi.newpipe;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004\u00a8\u0006\n"}, d2 = {"Lorg/schabi/newpipe/NewVersionManager;", "", "()V", "coerceExpiry", "", "expiryString", "", "isExpired", "", "expiry", "app_debug"})
public final class NewVersionManager {
    
    public NewVersionManager() {
        super();
    }
    
    public final boolean isExpired(long expiry) {
        return false;
    }
    
    /**
     * Coerce expiry date time in between 6 hours and 72 hours from now
     *
     * @return Epoch second of expiry date time
     */
    public final long coerceExpiry(@org.jetbrains.annotations.Nullable()
    java.lang.String expiryString) {
        return 0L;
    }
}