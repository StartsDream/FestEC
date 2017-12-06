package com.example.latte.delegates.web.event;

import android.content.Context;
import android.webkit.WebView;

import com.example.latte.delegates.web.WebDelegate;

/**
 * Created by GPT-2273 on 2017/12/6.
 */

public abstract class Event implements IEvent{
    private Context mContext = null;
    private String mAction = null;
    private WebDelegate mDelegate = null;
    private String mUrl = null;
    private WebView mWebView = null;

    public Context getContext() {
        return mContext;
    }

    public void setContext(Context context) {
        this.mContext = context;
    }

    public String getAction() {
        return mAction;
    }

    public void setAction(String action) {
        this.mAction = action;
    }

    public WebDelegate getDelegate() {
        return mDelegate;
    }

    public void setDelegate(WebDelegate delegate) {
        this.mDelegate = delegate;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        this.mUrl = url;
    }

    public WebView getWebView() {
        return mDelegate.getWebView();
    }
}
