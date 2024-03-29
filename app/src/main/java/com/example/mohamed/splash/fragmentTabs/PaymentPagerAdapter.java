package com.example.mohamed.splash.fragmentTabs;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PaymentPagerAdapter extends FragmentPagerAdapter {
    public PaymentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return  new MastercardFragmentTab();
            case 1:
               return  new VisaFragmentTab();
            default:
                return null;

        }


    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Mastercard";
            case 1:
                return  "Visa";
            default:
                return null;
        }



    }
}
