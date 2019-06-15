package com.example.mohamed.splash;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.mohamed.splash.Adapter.ServiceProviderAdapter;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SelectServiceProviderActivity extends AppCompatActivity {

    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.service_provider_recycler) RecyclerView providerRecycler;
    ServiceProviderAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_service_provider);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Select Service provider");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.nav_back);

        adapter=new ServiceProviderAdapter(this);

        providerRecycler.setLayoutManager(new LinearLayoutManager(this));

        providerRecycler.setAdapter(adapter);



        Drawable drawable = ContextCompat.getDrawable(getApplicationContext(),R.drawable.nav_filter);
        toolbar.setOverflowIcon(drawable);





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.provider_menu,menu);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();
        switch (id){
            case R.id.nearest:
                startActivity(new Intent(getApplicationContext(),ConfirmationActivity.class));
            case R.id.low_price:
                startActivity(new Intent(getApplicationContext(),ConfirmationActivity.class));
                break;
            case R.id.high_rate:
                startActivity(new Intent(getApplicationContext(),ConfirmationActivity.class));
                break;
                default:
        }

        return true;
    }


}
