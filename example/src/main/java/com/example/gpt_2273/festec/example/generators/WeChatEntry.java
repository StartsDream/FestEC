package com.example.gpt_2273.festec.example.generators;

/**
 * Created by GPT-2273 on 2017/10/25.
 */

import com.example.annotations.EntryGenerator;
import com.example.latte.wechat.templates.WXEntryTemplate;

@EntryGenerator(
        packageName = "com.example.gpt_2273.festec.example",
        entryTemplate = WXEntryTemplate.class
)
public interface WeChatEntry {
}
