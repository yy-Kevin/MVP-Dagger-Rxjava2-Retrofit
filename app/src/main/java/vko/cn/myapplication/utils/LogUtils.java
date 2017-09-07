package vko.cn.myapplication.utils;

import android.util.Log;

/**
 * Created by A on 2017/9/1.
 */

public class LogUtils {

    public static final Boolean DEBUG_MODE = true;
    private static String packageName;

    public static void d(Object className,String message) {
        packageName = className.getClass().getName();
        if (DEBUG_MODE) {
            Log.d(packageName + "MVP", message);
        }
    }
}
