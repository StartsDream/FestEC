package com.example.gpt_2273.festec.example;


import com.example.latte.activites.ProxyActivity;
import com.example.latte.delegates.LatteDelegate;
import com.example.latte.ec.launcher.LauncherDelegate;
import com.example.latte.ec.launcher.LauncherScrollDelegate;

public class ExampleActivity extends ProxyActivity {

    @Override
    public LatteDelegate setRootDelegate() {
//        return new LauncherDelegate();
        return new LauncherScrollDelegate();
    }
}
