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




    public static void d(String tag,String msg) {
        if (DEBUG_MODE) {
            Log.d(tag + "MVP", msg);
        }
    }




    public static void e(Object className,String message) {
        packageName = className.getClass().getName();
        if (DEBUG_MODE) {
            Log.e(packageName + "MVP", message);
        }
    }




    public static void e(String tag,String msg) {
        if (DEBUG_MODE) {
            Log.e(tag + "MVP", msg);
        }
    }




    public static void i(Object className,String message) {
        packageName = className.getClass().getName();
        if (DEBUG_MODE) {
            Log.i(packageName + "MVP", message);
        }
    }




    public static void i(String tag,String msg) {
        if (DEBUG_MODE) {
            Log.i(tag + "MVP", msg);
        }
    }




    public static void v(Object className,String message) {
        packageName = className.getClass().getName();
        if (DEBUG_MODE) {
            Log.v(packageName + "MVP", message);
        }
    }




    public static void v(String tag,String msg) {
        if (DEBUG_MODE) {
            Log.v(tag + "MVP", msg);
        }
    }



}
