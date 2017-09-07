package vko.cn.myapplication.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import vko.cn.myapplication.R;
import vko.cn.myapplication.databinding.ActivityMainBinding;
import vko.cn.myapplication.view.BaseActivity;

/**
 * Created by A on 2017/9/7.
 */

public class MainActivity extends BaseActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }
}
