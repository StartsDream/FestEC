package com.example.latte.delegates.web.event;

import com.example.latte.util.log.LatteLogger;

/**
 * Created by GPT-2273 on 2017/12/6.
 */

public class UndefineEvent extends Event {

    @Override
    public String execute(String params) {
        LatteLogger.e("UndefineEvent", params);
        return null;
    }
}
