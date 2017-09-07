package vko.cn.myapplication;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import vko.cn.myapplication.activity.MainActivity;
import vko.cn.myapplication.dagger2.DaggerLoginCompent;
import vko.cn.myapplication.dagger2.LoginModule;
import vko.cn.myapplication.databinding.ActivityLoginBinding;
import vko.cn.myapplication.presenter.LoginPresenter;
import vko.cn.myapplication.utils.MD5Utils;
import vko.cn.myapplication.view.BaseActivity;

public class LoginActivity extends BaseActivity<LoginPresenter> implements InterfaceContract.LoginView, View.OnClickListener {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initPresenter() {
        //完成依赖
        DaggerLoginCompent.builder()
                .loginModule(new LoginModule(this))
                .build()
                .inject(this);
    }

    @Override
    public void initView() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        binding.btLogin.setOnClickListener(this);
    }

    @Override
    protected void onDestroy() {
        presenter.attachView(this);
        super.onDestroy();
    }

    @Override
    public String getUserName() {
        String name = binding.etUser.getText().toString().trim();
        return name;
    }

    @Override
    public String getPassWord() {
        String md5PassWord = MD5Utils.md5(binding.etPwd.getText().toString().trim()).toLowerCase();
        return md5PassWord;
    }

    @Override
    public void loginSuccess() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void loginFail() {
        Toast.makeText(this,"登陆失败",Toast.LENGTH_LONG).show();
    }


    @Override
    public void onClick(View view) {
            presenter.login();
    }
}
