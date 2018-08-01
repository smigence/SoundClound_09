package com.example.hoang.soundclound_09.mainhome;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> mFragments;
    private List<String> mTitles;

    public HomeAdapter(FragmentManager fm) {
        super(fm);
        mFragments = new ArrayList<>();
        mTitles = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int i) {
        return mFragments.get(i);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    public void addFrament(Fragment fragment, String title) {
        mFragments.add(fragment);
        mTitles.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }
}
