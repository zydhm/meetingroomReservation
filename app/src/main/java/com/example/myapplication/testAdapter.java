package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class testAdapter extends FragmentPagerAdapter {
    ArrayList<String> titles=new ArrayList<>();

    private List<MyFragment> mViews;


    public testAdapter(FragmentManager fm) {
        super(fm);
        titles.add("所有");
        titles.add("管理员");
        titles.add("评论");
        mViews.add(new MyFragment());
        mViews.add(new MyFragment());
        mViews.add(new MyFragment());
    }

    @Override
    public Fragment getItem(int position) {
        return mViews.get(position);
    }

    @Override
    public int getCount() {
        return mViews.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
