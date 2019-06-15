package com.example.mohamed.splash.sidemenuActivity;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.example.mohamed.splash.R;
import com.example.mohamed.splash.fragmentTabs.PaymentPagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PaymentMethodActivity3 extends AppCompatActivity {


    @BindView(R.id. toolbar)Toolbar toolbar;

    @BindView(R.id.tab_layout) TabLayout tab_layout;
    @BindView(R.id.view_pager) ViewPager view_pager;
    PaymentPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method3);

        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Payment Method");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adapter=new PaymentPagerAdapter(getSupportFragmentManager());

        view_pager.setAdapter(adapter);
        tab_layout.setupWithViewPager(view_pager);


        tab_layout.getTabAt(0).setIcon(R.drawable.mastercard_icon);
        tab_layout.getTabAt(1).setIcon(R.drawable.visa_icon);



    }
}
