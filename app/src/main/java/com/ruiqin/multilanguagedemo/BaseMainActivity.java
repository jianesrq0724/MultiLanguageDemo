package com.ruiqin.multilanguagedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BaseMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
