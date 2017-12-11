package com.example.gpt_2273.festec.example.event;

import android.os.Build;
import android.webkit.WebView;
import android.widget.Toast;

import com.example.latte.delegates.web.event.Event;

/**
 * Created by GPT-2273 on 2017/12/6.
 */

public class TestEvent extends Event {
    @Override
    public String execute(String params) {
        Toast.makeText(getContext(), getAction(), Toast.LENGTH_LONG).show();
        if (getAction().equals("test")) {
            final WebView webView = getWebView();
            webView.post(new Runnable() {
                @Override
                public void run() {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                        webView.evaluateJavascript("nativeCall();", null);
                    }
                }
            });
        }
        return null;
    }
}
