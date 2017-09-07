package vko.cn.myapplication;

import vko.cn.myapplication.view.BaseActivity;
import vko.cn.myapplication.view.BaseView;

/**
 * Created by A on 2017/9/4.
 */

public class InterfaceContract {

    public interface LoginView extends BaseView {
        String getUserName();
        String getPassWord();
        void loginSuccess();
        void loginFail();
    }

    public interface Presenter<T extends BaseActivity> {

        void attachView(T t);

        void detachView();
    }

    public  interface ILoginModule{
        void login(String userName , String passWord, InterfaceContract.OnLoginListener listener);
    }

    /**
     * presenter层 的回调
     */
    public interface OnLoginListener {
        void LoginSucess();
        void LoginFail();
    }
}
