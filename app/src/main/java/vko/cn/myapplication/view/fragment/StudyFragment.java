package vko.cn.myapplication.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vko.cn.myapplication.R;

/**
 * Created by A on 2017/9/8.
 */

public class StudyFragment extends BaseFragment {

    public static StudyFragment getInstance() {
        StudyFragment fragment = new StudyFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.from(getActivity()).inflate(R.layout.fragment_study,null);
        return view;
    }
}
