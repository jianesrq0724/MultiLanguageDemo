package com.ruiqin.multilanguagedemo;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends BaseMainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Toast.makeText(this, "haha", Toast.LENGTH_SHORT).show();
    }


}
