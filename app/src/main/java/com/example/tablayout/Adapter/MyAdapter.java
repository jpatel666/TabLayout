package com.example.tablayout.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tablayout.Fragment.CallFragment;
import com.example.tablayout.Fragment.ChatFragment;
import com.example.tablayout.Fragment.StatusFragment;

public class MyAdapter extends FragmentPagerAdapter {  //Alt+Enter

    //In TabLayout Fragment:-extends FragmentPagerAdapter {....}
    public MyAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment;

        if(position==0){
            fragment = new ChatFragment();
        } else if (position==1) {
            fragment = new StatusFragment();
        }else {
            fragment = new CallFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {     //tit...(getPageTitle) Method Create Self

        String title = "";

        if (position==0){
            title = "Chat";
        } else if (position==1) {
            title = "Status";
        }else {
            title = "Call";
        }

        return title;
    }

}

