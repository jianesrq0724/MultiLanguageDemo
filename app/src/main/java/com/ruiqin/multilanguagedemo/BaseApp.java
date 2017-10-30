package com.ruiqin.multilanguagedemo;

import android.app.Application;
import android.content.res.Configuration;

import java.util.Locale;

/**
 * 功能：
 * 创建者：com.multilanguagedemo.ruiqin.shen
 * 创建日期：2017/10/27
 * 版权所有：深圳市亿车科技有限公司
 */

public class BaseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initLanguage();//设置应用语言类型
    }

    private void initLanguage() {
//        Resources resources = getResources();
//        Configuration config = resources.getConfiguration();
//        DisplayMetrics dm = resources.getDisplayMetrics();
//        config.locale = Locale.ENGLISH;
//        resources.updateConfiguration(config, dm);

        String languageToLoad;

        if (BuildConfig.APPLICATION_ID.contains("fd")) {
            languageToLoad = "fd";
        } else {
            languageToLoad = "fx";
        }
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, null);

    }
}
