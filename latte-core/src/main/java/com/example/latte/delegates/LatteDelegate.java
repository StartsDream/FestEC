package com.example.latte.delegates;

/**
 * Created by GPT-2273 on 2017/9/25.
 */

public abstract class LatteDelegate extends PermissionCheckerDelegate{

    @SuppressWarnings("unchecked")
    public <T extends LatteDelegate> T getParentDelegate(){
        return (T) getParentFragment();
    }
}
