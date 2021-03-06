package com.example.latte.ui.recycler;

import android.support.annotation.ColorInt;

import com.choices.divider.DividerItemDecoration;
import com.example.latte.delegates.BaseDelegate;

/**
 * Created by GPT-2273 on 2017/11/22.
 */

public class BaseDecoration extends DividerItemDecoration {

    public BaseDecoration(@ColorInt int color, int size) {
        setDividerLookup(new DividerLookUpImpl(color, size));
    }

    public static BaseDecoration create(@ColorInt int color, int size){
        return new BaseDecoration(color, size);
    }
}
