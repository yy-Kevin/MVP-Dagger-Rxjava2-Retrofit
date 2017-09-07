package vko.cn.myapplication;

import android.os.Bundle;
import android.view.View;

import javax.inject.Inject;

import vko.cn.myapplication.dagger2.DaggerLoginCompent;
import vko.cn.myapplication.dagger2.LoginModule;
import vko.cn.myapplication.presenter.LoginPresenter;
import vko.cn.myapplication.view.BaseActivity;

public class LoginActivity extends BaseActivity<LoginPresenter> implements InterfaceContract.LoginView, View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    public void initPresenter() {
        //完成依赖
        DaggerLoginCompent.builder()
                .loginModule(new LoginModule(this))
                .build()
                .inject(this);
    }

    public void initView() {
        View viewById = findViewById(R.id.bt_login);

        viewById.setOnClickListener(this);
    }

    @Override
    protected void onDestroy() {
        presenter.attachView(this);
        super.onDestroy();
    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public String getPassWord() {
        return null;
    }


    @Override
    public void onClick(View view) {
            presenter.login();
    }
}
