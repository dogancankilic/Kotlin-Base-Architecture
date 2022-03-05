package com.dogancankilic.kotlinbase.core.platform;

import java.lang.System;

/**
 * Used as a wrapper for data that is exposed via a LiveData that represents an single event.
 * @see https://medium.com/androiddevelopers/livedata-with-snackbar-navigation-and-other-events-the-singleliveevent-case-ac2622673150
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0007\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\n\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\tR\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/dogancankilic/kotlinbase/core/platform/Event;", "T", "", "content", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "hasBeenHandled", "", "getContentIfNotHandled", "()Ljava/lang/Object;", "peekContent", "app_debug"})
public class Event<T extends java.lang.Object> {
    private final T content = null;
    private boolean hasBeenHandled = false;
    
    public Event(T content) {
        super();
    }
    
    /**
     * Returns the content and prevents its use again.
     */
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {})
    public final T getContentIfNotHandled() {
        return null;
    }
    
    /**
     * Returns the content, even if it's already been handled.
     */
    public final T peekContent() {
        return null;
    }
}