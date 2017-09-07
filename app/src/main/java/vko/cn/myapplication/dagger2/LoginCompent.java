package vko.cn.myapplication.dagger2;

import javax.inject.Singleton;

import dagger.Component;
import vko.cn.myapplication.LoginActivity;

/**
 * Created by A on 2017/9/5.
 */
@Singleton
@Component(modules = {LoginModule.class})
public interface LoginCompent {
    void inject(LoginActivity app);
}
