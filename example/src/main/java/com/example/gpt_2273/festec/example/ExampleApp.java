package com.example.gpt_2273.festec.example;

import android.app.Application;

import com.example.latte.app.Latte;

/**
 * Created by GPT-2273 on 2017/9/20.
 */

public class ExampleApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withApiHost("http://127.0.0.1")
                .configure();
    }
}
