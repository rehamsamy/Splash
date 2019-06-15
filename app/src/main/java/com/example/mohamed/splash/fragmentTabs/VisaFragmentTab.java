package com.example.mohamed.splash.fragmentTabs;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mohamed.splash.R;

public class VisaFragmentTab extends Fragment {

    public VisaFragmentTab() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=LayoutInflater.from(getContext()).inflate(R.layout.visa_fragment_tab,container,false);

        return view;
    }
}
