package vko.cn.myapplication.presenter;

import vko.cn.myapplication.InterfaceContract;
import vko.cn.myapplication.view.BaseActivity;

/**
 * Created by A on 2017/9/4.
 */

public class BasePresenter<V extends BaseActivity> implements InterfaceContract.Presenter<V> {

    private  V mView;

    @Override
    public void attachView(V mView) {
        this.mView = mView;
    }

    @Override
    public void detachView() {
        mView = null;
    }
}
