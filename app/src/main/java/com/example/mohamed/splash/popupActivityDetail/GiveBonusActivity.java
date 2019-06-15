package com.example.mohamed.splash.popupActivityDetail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.mohamed.splash.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class GiveBonusActivity extends AppCompatActivity {

    @BindView(R.id.toolbar) Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_bonus);


        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Give Bonus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }
}
