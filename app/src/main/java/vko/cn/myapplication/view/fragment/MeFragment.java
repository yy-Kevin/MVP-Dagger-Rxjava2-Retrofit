package vko.cn.myapplication.view.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vko.cn.myapplication.R;
import vko.cn.myapplication.databinding.FragmentMeBinding;

/**
 * Created by A on 2017/9/8.
 */

public class MeFragment extends BaseFragment {

    private FragmentMeBinding binding;

    public static MeFragment getInstance() {
        MeFragment fragment = new MeFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.from(getActivity()).inflate(R.layout.fragment_me,null);
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_me, container, false);
        return binding.getRoot();
    }
}
