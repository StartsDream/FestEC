package com.example.latte.ec.datebase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by GPT-2273 on 2017/10/18.
 */

public class ReleaseOpenHelper extends DaoMaster.OpenHelper{
    public ReleaseOpenHelper(Context context, String name) {
        super(context, name);
    }

    public ReleaseOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        super.onCreate(db);
    }
}
