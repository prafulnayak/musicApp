package org.sairaa.musicapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class SimpleFragmentPageAdapter extends FragmentPagerAdapter{
    //Context for the app
    private Context mContext;
    public SimpleFragmentPageAdapter(Context ctx, FragmentManager fm) {
        super(fm);
        mContext = ctx;
    }

    @Override
    public Fragment getItem(int position) {
        return new SongFragment();
    }

    @Override
    public int getCount() {
        return 2;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "Songs";
        }else
            return "Artist";
    }
}