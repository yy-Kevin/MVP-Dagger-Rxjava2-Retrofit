package vko.cn.myapplication.view.activity;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.support.v7.app.ActionBar;
import android.view.View;


import com.ashokvarma.bottomnavigation.BadgeItem;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

import vko.cn.myapplication.R;
import vko.cn.myapplication.databinding.ActivityMainBinding;
import vko.cn.myapplication.view.BaseActivity;
import vko.cn.myapplication.view.adapter.MainAdapter;

/**
 * Created by A on 2017/9/7.
 */

public class MainActivity extends BaseActivity implements BottomNavigationBar.OnTabSelectedListener {

    private ActivityMainBinding binding;
    int lastSelectedPosition = 0;
    private BadgeItem badgeItem;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        initBottomNavigation();
        initToolbar();
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainAdapter mainAdapter = new MainAdapter(getSupportFragmentManager());
        binding.mainVp.setAdapter(mainAdapter);
        binding.mainVp.setOffscreenPageLimit(0);
        binding.mainVp.setCurrentItem(0);
    }

    //初始化Toolbar的布局
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    //设置Toorbar的点击事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    private void initBottomNavigation(){
        badgeItem = new BadgeItem();
        badgeItem.setHideOnSelect(false)
                .setText("10")
                .setBackgroundColorResource(R.color.bar_accent_two)
                .setBorderWidth(0);
        binding.mainBar.addItem(new BottomNavigationItem(R.mipmap.icon_one,R.string.tab_one).setActiveColorResource(R.color.bar_accent_one).setBadgeItem(badgeItem))
                .addItem(new BottomNavigationItem(R.mipmap.icon_two, R.string.tab_two).setActiveColorResource(R.color.bar_accent_two))
                .addItem(new BottomNavigationItem(R.mipmap.icon_three, R.string.tab_three).setActiveColorResource(R.color.bar_accent_three))
                .setFirstSelectedPosition(lastSelectedPosition )
                .initialise();
        binding.mainBar.setMode(BottomNavigationBar.MODE_FIXED);
        binding.mainBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_RIPPLE);
        binding.mainBar.setTabSelectedListener(this);
    }

    private void initToolbar(){
        setSupportActionBar(binding.mainInclude.tlToolbar);
    }
    @Override
    public void onTabSelected(int position) {
        switch (position) {
            case 0:
                binding.mainVp.setCurrentItem(0);
//                binding.mainBar.get   badgeItem.setText("9");
//                binding.mainBar.get
                break;
            case 1:
                binding.mainVp.setCurrentItem(1);
                break;
            case 2:
                binding.mainVp.setCurrentItem(2);
                break;
            default:
                binding.mainVp.setCurrentItem(0);
                break;
        }
    }

    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {

    }
}
