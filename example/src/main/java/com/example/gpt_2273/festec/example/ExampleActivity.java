package com.example.gpt_2273.festec.example;


import com.example.latte.activites.PoxyActivity;
import com.example.latte.delegates.LatteDelegate;

public class ExampleActivity extends PoxyActivity {

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
