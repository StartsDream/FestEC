package com.example.latte.util.dimen;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.example.latte.app.Latte;

/**
 * Created by GPT-2273 on 2017/9/28.
 */

public class DimenUtil {

    public static int getScreenWidth() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }
}
