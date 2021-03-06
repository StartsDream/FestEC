package com.example.gpt_2273.festec.example;

import android.app.Application;

import com.example.gpt_2273.festec.example.event.TestEvent;
import com.example.latte.app.Latte;
import com.example.latte.ec.datebase.DatabaseManager;
import com.example.latte.ec.icon.FontECModule;
import com.example.latte.net.interceptors.DebugInterceptor;
import com.facebook.stetho.Stetho;
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
                .withApiHost("http://192.168.43.175:8080/RestServer/api/")
                .withInterceptor(new DebugInterceptor("index0",R.raw.test))
                .withWeChatAppId("")
                .withWeChatAppSecret("")
                .withJavascriptInterface("latte")
                .withWebEvent("test", new TestEvent())
                .configure();
        initStetho();
        DatabaseManager.getInstance().init(this);
    }

    private void initStetho(){
        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                .build()
        );
    }
}
