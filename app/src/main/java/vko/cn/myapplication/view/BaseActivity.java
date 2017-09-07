package vko.cn.myapplication.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

import vko.cn.myapplication.presenter.BasePresenter;

/**
 * Created by A on 2017/9/4.
 */

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView {

    @Inject
    public T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initPresenter();
    }

    public abstract void initPresenter();

    @Override
    public void showSuccess() {
        Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFail() {
        Toast.makeText(this, "登陆失败", Toast.LENGTH_SHORT).show();
    }
}
