package com.example.latte.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * Created by GPT-2273 on 2017/9/21.
 */

public enum EcIcons implements Icon {
    icon_scan('\ue67c'),
    icon_ali_pay('\ue50a');

    private char character;

    EcIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
