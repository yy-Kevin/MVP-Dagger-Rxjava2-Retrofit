package vko.cn.myapplication.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

import vko.cn.myapplication.view.fragment.BaseFragment;
import vko.cn.myapplication.view.fragment.MeFragment;
import vko.cn.myapplication.view.fragment.StudyFragment;
import vko.cn.myapplication.view.fragment.DynamicFragment;

/**
 * Created by A on 2017/9/8.
 */

public class MainAdapter extends FragmentStatePagerAdapter {

    private List<BaseFragment> data;

    public MainAdapter(FragmentManager fm) {
        super(fm);
        data = new ArrayList<>();
        data.add(DynamicFragment.getInstance());
        data.add(StudyFragment.getInstance());
        data.add(MeFragment.getInstance());
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }
}
