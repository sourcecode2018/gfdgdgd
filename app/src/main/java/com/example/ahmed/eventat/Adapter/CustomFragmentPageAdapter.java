package com.example.ahmed.eventat.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.ahmed.eventat.Fragments.Ads;
import com.example.ahmed.eventat.Fragments.Favorite;
import com.example.ahmed.eventat.Fragments.MyBids;
import com.example.ahmed.eventat.Fragments.PrevioudBids;

/**
 * Created by manar on 11/12/2017.
 */

public class CustomFragmentPageAdapter extends FragmentPagerAdapter {
    String names[] = {"2", "1", "3", "4"};


    public CustomFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    public void fragmentadd(Fragment fragments, String title) {
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PrevioudBids();
            case 1:
                return new Ads();
            case 2:
                return new Favorite();
            case 3:
                return new MyBids();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return names[position];
    }

    {
    }
}
