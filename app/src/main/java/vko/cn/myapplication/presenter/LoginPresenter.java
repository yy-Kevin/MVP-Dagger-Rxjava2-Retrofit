package vko.cn.myapplication.presenter;

import javax.inject.Inject;

import vko.cn.myapplication.InterfaceContract;
import vko.cn.myapplication.LoginActivity;
import vko.cn.myapplication.view.activity.MainActivity;
import vko.cn.myapplication.module.LoginModelImple;

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
        mView.startProgress();
        String userword = mView.getUserName();
        String passWord = mView.getPassWord();
        modelImple.login(userword,passWord,this);
    }

    @Override
    public void LoginSucess() {
        mView.stopProgress();
        mView.loginSuccess();
    }

    @Override
    public void LoginFail() {
        mView.stopProgress();
        mView.loginFail();
    }
}
