package com.example.gpt_2273.festec.example.generators;

import com.example.annotations.PayEntryGenerator;
import com.example.latte.wechat.templates.WXPayEntryTemplate;

/**
 * Created by GPT-2273 on 2017/10/25.
 */

@PayEntryGenerator(
        packageName = "com.example.gpt_2273.festec.example",
        payEntryTemplate = WXPayEntryTemplate.class
)
public interface WeChatPayEntry {
}
