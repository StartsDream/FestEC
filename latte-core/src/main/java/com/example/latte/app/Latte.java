package com.example.latte.app;

import android.content.Context;

import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * Created by GPT-2273 on 2017/9/20.
 */

public final class Latte {

    public static Configurator init(Context context) {
        Configurator.getInstance()
                .getLatteConfigs()
                .put(ConfigType.APPLICATION_CONTEXT.name(), context.getApplicationContext());
        return Configurator.getInstance();
    }

    public static Configurator getConfigurator(){
        return Configurator.getInstance();
    }

    public static <T> T getConfiguration(Object key){
        return getConfigurator().getConfiguration(key);
    }

    public static Context getApplicationContext(){
        return getConfiguration(ConfigType.APPLICATION_CONTEXT);
    }

}
