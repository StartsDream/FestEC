package com.example.gpt_2273.festec.example;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.widget.Toast;

import com.example.latte.activites.ProxyActivity;
import com.example.latte.app.Latte;
import com.example.latte.delegates.LatteDelegate;
import com.example.latte.ec.launcher.LauncherDelegate;
import com.example.latte.ec.main.EcBottomDelegate;
import com.example.latte.ec.sign.ISignListener;
import com.example.latte.ec.sign.SignInDelegate;
import com.example.latte.ec.sign.SignUpDelegate;
import com.example.latte.ui.launcher.ILauncherListener;
import com.example.latte.ui.launcher.OnLauncherFinishTag;

public class ExampleActivity extends ProxyActivity implements
        ISignListener,
        ILauncherListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        Latte.getConfigurator().withActivity(this);
    }

    @Override
    public LatteDelegate setRootDelegate() {
        return new LauncherDelegate();
//        return new LauncherScrollDelegate();
//        return new SignUpDelegate();
    }

    @Override
    public void onSignInSuccess() {
        Toast.makeText(this, "登录成功！", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSignUpSuccess() {
        Toast.makeText(this, "注册成功！", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLauncherFinish(OnLauncherFinishTag tag) {
        switch (tag) {
            case SIGNED:
//                Toast.makeText(this, "启动结束，用户登录了", Toast.LENGTH_SHORT).show();
//                startWithPop(new ExampleDelegate());
                startWithPop(new EcBottomDelegate());
                break;
            case NOT_SIGNED:
                Toast.makeText(this, "启动结束，用户没有登录", Toast.LENGTH_SHORT).show();
//                startWithPop(new SignInDelegate());
                startWithPop(new EcBottomDelegate());
                break;
            default:
                break;
        }
    }
}
