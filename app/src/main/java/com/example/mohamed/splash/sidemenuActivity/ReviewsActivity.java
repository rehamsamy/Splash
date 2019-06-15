package com.example.mohamed.splash.sidemenuActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.mohamed.splash.Adapter.ReviewAdapter;
import com.example.mohamed.splash.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ReviewsActivity extends AppCompatActivity {

    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.review_recycler) RecyclerView review_recycler;
    ReviewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Reviews");

        adapter=new ReviewAdapter(this);
        review_recycler.setLayoutManager(new LinearLayoutManager(this));
        review_recycler.setAdapter(adapter);

    }
}
