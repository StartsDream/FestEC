package com.example.gpt_2273.festec.example;

import android.app.Application;

import com.example.latte.app.Latte;
import com.example.latte.ec.icon.FontECModule;
import com.example.latte.net.interceptors.DebugInterceptor;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

/**
 * Created by GPT-2273 on 2017/9/20.
 */

public class ExampleApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontECModule())
                .withLoaderDelayed(1000)
                .withApiHost("http://127.0.0.1")
                .withInterceptor(new DebugInterceptor("index",R.raw.test))
                .configure();
    }
}
