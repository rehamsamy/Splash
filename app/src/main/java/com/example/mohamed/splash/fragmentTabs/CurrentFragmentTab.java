package com.example.mohamed.splash.fragmentTabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mohamed.splash.Adapter.CurrentTabAdapter;
import com.example.mohamed.splash.R;

public class CurrentFragmentTab extends Fragment {

    public CurrentFragmentTab() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= LayoutInflater.from(getContext()).inflate(R.layout.fragment_current_tab, container, false);



        RecyclerView recyclerView=(RecyclerView) view.findViewById(R.id.current_recycler);
        CurrentTabAdapter adapter=new CurrentTabAdapter(getContext());

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(adapter);

       return view;
    }

}
