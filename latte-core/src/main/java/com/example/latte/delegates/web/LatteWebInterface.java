package com.example.latte.delegates.web;

import android.webkit.JavascriptInterface;

import com.alibaba.fastjson.JSON;
import com.example.latte.delegates.web.event.Event;
import com.example.latte.delegates.web.event.EventManager;

/**
 * Created by GPT-2273 on 2017/12/4.
 */

public final class LatteWebInterface {
    private final WebDelegate DELETE;

    private LatteWebInterface(WebDelegate delegate) {
        this.DELETE = delegate;
    }

    static LatteWebInterface create(WebDelegate delegate){
        return new LatteWebInterface(delegate);
    }

    @SuppressWarnings("unused")
    @JavascriptInterface
    public String event(String params){
        final String action = JSON.parseObject(params).getString("action");
        final Event event = EventManager.getInstance().createEvent(action);
        if (event != null){
            event.setAction(action);
            event.setDelegate(DELETE);
            event.setContext(DELETE.getContext());
            event.setUrl(DELETE.getUrl());
            return event.execute(params);
        }
        return null;
    }
}
