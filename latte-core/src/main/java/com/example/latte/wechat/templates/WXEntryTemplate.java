package com.example.latte.wechat.templates;

import com.example.latte.wechat.BaseWXEntryActivity;
import com.example.latte.wechat.LatteWeChat;

/**
 * Created by GPT-2273 on 2017/10/25.
 */

public class WXEntryTemplate extends BaseWXEntryActivity {

    @Override
    protected void onResume() {
        super.onResume();
        finish();
        overridePendingTransition(0, 0);
    }

    @Override
    protected void onSignInSuccess(String userInfo) {
        LatteWeChat.getInstance().getSignInCallBack().onSignInSuccess(userInfo);
    }
}
