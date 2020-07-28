package com.example.fpl.ui.SwipeNavigation;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fpl.Fragments.League;
import com.example.fpl.Fragments.Status;
import com.example.fpl.Fragments.Team;
import com.example.fpl.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class TabPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3};
    private final Context mContext;

    public TabPagerAdapter(Context context, FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = Status.newInstance(null, null);
                break;
            case 1:
                fragment = Team.newInstance();
                break;
            case 2:
                fragment = League.newInstance(null, null);
                break;

        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Status";
            case 1:
                return "Team";
            case 2:
                return "League";
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}