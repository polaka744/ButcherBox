package com.butcher.box.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.butcher.box.Frgments.BlogFragment;
import com.butcher.box.Frgments.ChickenFragment;
import com.butcher.box.Frgments.FishseafoodFragment;
import com.butcher.box.Frgments.LambGoatFragment;
import com.butcher.box.Frgments.ProfileFragment;
import com.butcher.box.Frgments.TodayDealFragment;

public class TabsAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter(FragmentManager fm, int NoofTabs){
        super(fm);
        this.mNumOfTabs = NoofTabs;
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
    @Override
    public Fragment getItem(int position){

        switch (position){
            case 0:
                return new TodayDealFragment();
            case 1:
                return new ChickenFragment();
            case 2:
                return new LambGoatFragment();
            case 3:
                return new FishseafoodFragment();
            default:
                return null;
        }
    }
}