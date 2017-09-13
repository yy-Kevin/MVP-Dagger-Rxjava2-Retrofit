package vko.cn.myapplication.utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by A on 2017/9/7.
 * activity的帮助类
 */

public class ActivityUtilManager {

    private List<Activity> activityMap = new ArrayList<Activity>();

    private static ActivityUtilManager instance;

    public synchronized static ActivityUtilManager getInstance() {
        if (null == instance) {
            instance = new ActivityUtilManager();
        }
        return instance;
    }

//    public void startMActivity(Context context){
//        String mainAcitity = context.getPackageName()+".home.activity.MainActivity";
//        if (isContains(mainAcitity) ){
//            return;
//        }
//        StartActivityUtil.startActivity(context, MainActivity.class, Intent.FLAG_ACTIVITY_NEW_TASK);
//
//    }

    public void addActivity(Activity act) {
        // if(!activityMap.containsKey(act.getClass().getName())){
        activityMap.add(act);
        // }
    }

    public void delActivity(Activity act) {
        if (activityMap.contains(act)) {
            activityMap.remove(act);
        }
    }
}
