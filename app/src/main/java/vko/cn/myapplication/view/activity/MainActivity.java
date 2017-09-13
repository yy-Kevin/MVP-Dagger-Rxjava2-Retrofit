package vko.cn.myapplication.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;

import android.view.Menu;
import android.view.MenuItem;


import com.ashokvarma.bottomnavigation.BadgeItem;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

import vko.cn.myapplication.R;
import vko.cn.myapplication.databinding.ActivityMainBinding;
import vko.cn.myapplication.utils.LogUtils;
import vko.cn.myapplication.view.BaseActivity;
import vko.cn.myapplication.view.adapter.MainAdapter;

/**
 * Created by A on 2017/9/7.
 */

public class MainActivity extends BaseActivity implements BottomNavigationBar.OnTabSelectedListener {

    private ActivityMainBinding binding;
    int lastSelectedPosition = 0;
    private BadgeItem badgeItem;
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        handler.sendEmptyMessage()
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
        binding.mainVp.setNoScroll(true);
    }

    //初始化Toolbar的布局
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //设置Toorbar的点击事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    private void initBottomNavigation(){
//        badgeItem = new BadgeItem();
//        badgeItem.setText("10")
//                .setBackgroundColorResource(R.color.bar_accent_two)
//                .setBorderWidth(0);
        BadgeItem badgeItem=new BadgeItem().setBorderWidth(1).setBackgroundColorResource(R.color.colorAccent).setText("2").setHideOnSelect(true);

        binding.mainBar.addItem(new BottomNavigationItem(R.mipmap.bar_msg_normal,R.string.tab_one).setBadgeItem(badgeItem)
                .setActiveColorResource(R.color.bar_accent_three))
                .addItem(new BottomNavigationItem(R.mipmap.bar_study, R.string.tab_two)
                .setActiveColorResource(R.color.bar_accent_three))
                .addItem(new BottomNavigationItem(R.mipmap.bar_mine, R.string.tab_three)
                .setActiveColorResource(R.color.bar_accent_three))
                .setFirstSelectedPosition(lastSelectedPosition )
                .initialise();
        binding.mainBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_RIPPLE);
        binding.mainBar.setBarBackgroundColor(R.color.bar_accent_three);
//        binding.mainBar.setMode(BottomNavigationBar.SHIF);shifting_ripple
        binding.mainBar.setTabSelectedListener(this);
    }

    private void initToolbar(){
        binding.mainInclude.toolbarTitle.setText("动态");
        setSupportActionBar(binding.mainInclude.tlToolbar);
    }

    @Override
    public void onTabSelected(int position) {
        LogUtils.d(this,"onTabSelected " + position);
        switch (position) {
            case 0:
                binding.mainVp.setCurrentItem(0,false);
//                binding.mainBar.get   badgeItem.setText("9");
//                binding.mainBar.get
                break;
            case 1:
                binding.mainVp.setCurrentItem(1,false);
//                binding.mainBar.get   badgeItem.setText("9");
                break;
            case 2:
                binding.mainVp.setCurrentItem(2,false);
                break;
            default:
                break;
        }
    }

    @Override
    public void onTabUnselected(int position) {
        LogUtils.d(this,"onTabUnselected " + position);
    }

    @Override
    public void onTabReselected(int position) {
        LogUtils.d(this,"onTabReselected " + position);

    }
}
