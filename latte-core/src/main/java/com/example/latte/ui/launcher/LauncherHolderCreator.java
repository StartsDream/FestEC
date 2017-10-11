package com.example.latte.ui.launcher;

import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;

/**
 * Created by GPT-2273 on 2017/10/11.
 */

public class LauncherHolderCreator implements CBViewHolderCreator<LauncherHolder>{
    @Override
    public LauncherHolder createHolder() {
        return new LauncherHolder();
    }
}
