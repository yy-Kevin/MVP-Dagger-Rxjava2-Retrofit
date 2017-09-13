package vko.cn.myapplication.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import vko.cn.myapplication.LoginActivity;
import vko.cn.myapplication.R;
import vko.cn.myapplication.utils.LogUtils;
import vko.cn.myapplication.utils.SPUtils;

/**
 * Created by A on 2017/9/7.
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        String user_token = (String) SPUtils.get(this, "user_token", "");
        LogUtils.d(this,"user_token = " + user_token);
        if (user_token == ""){
            LeaveSplashToLoginActivity();
        }else {
            LeaveSplashToMainActivity();
        }
    }

    public void LeaveSplashToLoginActivity(){
        new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(Message message) {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
                return false;
            }
        }).sendEmptyMessageDelayed(0,1500);
    }

    public void LeaveSplashToMainActivity(){
        new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(Message message) {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                return false;
            }
        }).sendEmptyMessageDelayed(0,1500);
    }
}
