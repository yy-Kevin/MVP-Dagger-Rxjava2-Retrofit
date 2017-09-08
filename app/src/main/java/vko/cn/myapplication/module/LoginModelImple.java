package vko.cn.myapplication.module;

import android.content.Context;
import android.util.Log;


import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import vko.cn.myapplication.InterfaceContract;
import vko.cn.myapplication.api.BaseObserver;
import vko.cn.myapplication.api.RetrofitFactory;
import vko.cn.myapplication.api.RxSchedulers;
import vko.cn.myapplication.application.VKOApplication;
import vko.cn.myapplication.module.bean.BaseEntity;
import vko.cn.myapplication.module.bean.UserInfo;
import vko.cn.myapplication.utils.LogUtils;

/**
 * Created by A on 2017/9/4.
 */

public class LoginModelImple implements InterfaceContract.ILoginModule{
    public Context context;
    @Override
    public void login(String userName, String passWord, final InterfaceContract.OnLoginListener listener) {
        Observable<BaseEntity<UserInfo>> observable = RetrofitFactory.builder().getService().login(userName,passWord);
        BaseObserver observer = new BaseObserver<UserInfo>(VKOApplication.getInstance()) {
            public static final String TAG ="LoginModelImple" ;

            @Override
            protected void onHandleSuccess(UserInfo userInfo) {
                LogUtils.d(this,"userInfo.getToken() 1= " + userInfo.getToken());
                // 保存用户信息等操作
                listener.LoginSucess();
            }
            @Override
            public void onError(Throwable e) {
                super.onError(e);
                Log.e(TAG, "error:" + e.toString());
            }
        };

//        observable.compose(RxSchedulers.compose()).subscribe(observer);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
}
