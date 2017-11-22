package com.example.latte.ui.banner;

import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;

/**
 * Created by GPT-2273 on 2017/11/20.
 */

public class HolderCreator  implements CBViewHolderCreator<ImageHolder>{

    @Override
    public ImageHolder createHolder() {
        return new ImageHolder();
    }
}
