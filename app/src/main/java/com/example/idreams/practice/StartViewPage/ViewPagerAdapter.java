package com.example.idreams.practice.StartViewPage;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by idreams on 2015/8/1.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {
    private Context _context;
    public static int totalPage=2;
    public ViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        _context=context;

    }
    @Override
    public Fragment getItem(int position) {
        Fragment f = new Fragment();
        switch(position){
            case 0:
                f=LayoutOne.newInstance(_context);
                break;
            case 1:
                f=LayoutTwo.newInstance(_context);
                break;
        }
        return f;
    }
    @Override
    public int getCount() {
        return totalPage;
    }

}
