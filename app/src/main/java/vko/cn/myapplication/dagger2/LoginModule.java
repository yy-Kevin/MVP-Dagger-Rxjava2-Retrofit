package vko.cn.myapplication.dagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import vko.cn.myapplication.LoginActivity;
import vko.cn.myapplication.presenter.LoginPresenter;

/**
 * Created by A on 2017/9/5.
 */
@Module
public class LoginModule {

    LoginPresenter mPresenter;

    public LoginModule(LoginActivity activity){
        mPresenter = new LoginPresenter(activity);
    }
    @Provides
    @Singleton
    LoginPresenter providersLogiinPresenter(){
        return mPresenter;
    }
}
