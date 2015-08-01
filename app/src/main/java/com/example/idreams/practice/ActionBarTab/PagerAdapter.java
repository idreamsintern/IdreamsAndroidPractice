package com.example.idreams.practice.ActionBarTab;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by idreams on 2015/7/29.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                PageFragment tab1 = new PageFragment();
                return tab1;
            case 1:
                PageFragment tab2 = new PageFragment();
                return tab2;
            case 2:
                PageFragment tab3 = new PageFragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) { container.removeView((View) object); }

}