package com.example.latte.util.storage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.latte.app.Latte;

/**
 * Created by GPT-2273 on 2017/10/9.
 */

public final class LattePreference {

    /**
     * 提示:
     * Activity.getPreferences(int mode)生成 Activity名.xml 用于Activity内部存储
     * PreferenceManager.getDefaultSharedPreferences(Context)生成 包名_preferences.xml
     * Context.getSharedPreferences(String name,int mode)生成name.xml
     */
    private static final SharedPreferences PREFERENCES =
            PreferenceManager.getDefaultSharedPreferences(Latte.getApplicationContext());
    private static final String APP_PREFERENCE_KEY = "profile";

    private static SharedPreferences getPreferences() {
        return PREFERENCES;
    }

    public static void setAppProfile(String val) {
        getPreferences()
                .edit()
                .putString(APP_PREFERENCE_KEY, val)
                .apply();
    }

    public static String getAppProfile() {
        return getPreferences().getString(APP_PREFERENCE_KEY, null);
    }

    public static JSONObject getAppProfileJson() {
        final String profile = getAppProfile();
        return JSON.parseObject(profile);
    }

    public static void removeAppProfile() {
        getPreferences()
                .edit()
                .remove(APP_PREFERENCE_KEY)
                .apply();
    }

    public static void clearAppProfile() {
        getPreferences()
                .edit()
                .clear()
                .apply();
    }

    public static void setAppFlag(String key, boolean flag) {
        getPreferences()
                .edit()
                .putBoolean(key, flag)
                .apply();
    }

    public static void addCustomAppProfile(String key, String val) {
        getPreferences()
                .edit()
                .putString(key, val)
                .apply();
    }

    public static String getCustomAppProfile(String key) {
        return getPreferences().getString(key, "");
    }
}
