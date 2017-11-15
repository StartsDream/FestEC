package com.example.latte.ui.recycler;

import java.util.ArrayList;

/**
 * Created by GPT-2273 on 2017/11/13.
 */

public abstract class DataConverter {

    protected final ArrayList<MultipleItemEntity> ENTITLES = new ArrayList<>();
    private String mJsonData = null;

    public abstract ArrayList<MultipleItemEntity> convert();

    public DataConverter setJsonData(String json) {
        this.mJsonData = json;
        return this;
    }

    protected String getJsonData() {
        if (mJsonData == null || mJsonData.isEmpty()) {
            throw new NullPointerException("DATA IS NULL!");
        }
        return mJsonData;
    }

}
