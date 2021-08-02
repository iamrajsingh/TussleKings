package com.example.twister.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.twister.Fragments.ChatsFragment;

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            default:return new ChatsFragment();
        }
    }

    @Override
    public int getCount() {
        return 1;
    }

    @NonNull
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position==0){
            title = "CHATS";
        }

        return title;
    }

    }

