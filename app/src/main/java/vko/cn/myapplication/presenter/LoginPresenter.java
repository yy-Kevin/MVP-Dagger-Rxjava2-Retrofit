package vko.cn.myapplication.presenter;

import javax.inject.Inject;

import vko.cn.myapplication.InterfaceContract;
import vko.cn.myapplication.LoginActivity;
import vko.cn.myapplication.module.LoginModelImple;
import vko.cn.myapplication.utils.LogUtils;
import vko.cn.myapplication.utils.MD5Utils;

/**
 * Created by A on 2017/9/4.
 */

public class LoginPresenter extends BasePresenter<LoginActivity> implements InterfaceContract.OnLoginListener{

    private InterfaceContract.LoginView mView;
    private LoginModelImple modelImple;

    @Inject
    public LoginPresenter(InterfaceContract.LoginView mView){
        this.mView = mView;
        modelImple = new LoginModelImple();
    }

    public void login(){
        String passWord = mView.getPassWord();
        String userword = mView.getUserName();
        passWord = MD5Utils.md5("jiumima230502");
        userword = "15201083682";
        LogUtils.d(this,"passWord = " + passWord);
        modelImple.login(userword,passWord,this);
    }

    @Override
    public void LoginSucess() {
        mView.showSuccess();
    }

    @Override
    public void LoginFail() {
        mView.showFail();
    }
}
