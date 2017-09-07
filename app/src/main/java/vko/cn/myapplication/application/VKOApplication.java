package vko.cn.myapplication.application;

import android.app.Application;
import android.content.Context;

import vko.cn.myapplication.utils.AppContextUtil;

/**
 * Created by A on 2017/9/4.
 * application
 */

public class VKOApplication extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
//        AppContextUtil
    }

    public static Context getInstance(){
        return context;
    }
}
