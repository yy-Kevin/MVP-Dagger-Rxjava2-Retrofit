package vko.cn.myapplication.utils;

import android.content.Context;

/**
 * Created by A on 2017/9/4.
 */


    public class AppContextUtil {
        private static Context sContext;

        private AppContextUtil() {

        }

        public static void init(Context context) {
            sContext = context;
        }

        public static Context getInstance() {
            if (sContext == null) {
                throw new NullPointerException("the context is null,please init AppContextUtil in Application first.");
            }
            return sContext;
        }
    }

