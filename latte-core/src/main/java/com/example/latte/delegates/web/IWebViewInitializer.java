package com.example.latte.delegates.web;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by GPT-2273 on 2017/12/4.
 */

public interface IWebViewInitializer {

    WebView initWebView(WebView webView);

    //针对浏览器本身行为的控制
    WebViewClient initWebViewClient();

    //针对内部页面的控制
    WebChromeClient initWebChromeClient();
}
