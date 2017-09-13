package vko.cn.myapplication.module;

import android.content.Context;


import io.reactivex.Observable;
import vko.cn.myapplication.InterfaceContract;
import vko.cn.myapplication.api.BaseObserver;
import vko.cn.myapplication.api.RetrofitFactory;
import vko.cn.myapplication.api.RxSchedulers;
import vko.cn.myapplication.application.VKOApplication;
import vko.cn.myapplication.module.bean.BaseEntity;
import vko.cn.myapplication.module.bean.UserInfo;
import vko.cn.myapplication.utils.LogUtils;
import vko.cn.myapplication.utils.SPUtils;

/**
 * Created by A on 2017/9/4.
 */

public class LoginModelImple implements InterfaceContract.ILoginModule{
    public Context context;
    @Override
    public void login(String userName, String passWord, final InterfaceContract.OnLoginListener listener) {
        Observable<BaseEntity<UserInfo>> observable = RetrofitFactory.builder().getService().login(userName,passWord);
        observable.compose(RxSchedulers.compose()).subscribe(new BaseObserver<UserInfo>(VKOApplication.getInstance()) {
            @Override
            protected void onHandleSuccess(UserInfo userInfo) {
                LogUtils.d(this,"登陆请求的回调-------");
                LogUtils.d(this,"userInfo.getToken() = " + userInfo.getToken());
                SPUtils.put(VKOApplication.getInstance(),"user_token",userInfo.getToken());
                // 保存用户信息等操作
                listener.LoginSucess();
            }
        });
    }
}
