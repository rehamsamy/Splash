package com.example.mohamed.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.mohamed.splash.sidemenuActivity.ContactUsActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.kofigyan.stateprogressbar.StateProgressBar;
import com.kofigyan.stateprogressbar.components.StateItem;
import com.kofigyan.stateprogressbar.listeners.OnStateItemClickListener;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SelectServiceActivity extends AppCompatActivity  implements OnMapReadyCallback {

    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.state_progress) StateProgressBar stateProgressBar;
    @BindView(R.id.continue_service) Button continue_service;
    @BindView(R.id.map_view) MapView mapView;
    GoogleMap googleMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_service);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Select Service");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


//        stateProgressBar.setOnStateItemClickListener(new OnStateItemClickListener() {
//            @Override
//            public void onStateItemClick(StateProgressBar stateProgressBar, StateItem stateItem, int stateNumber, boolean isCurrentState) {
//                startActivity(new Intent(getApplicationContext(), ContactUsActivity.class));
//            }
//        });


        continue_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SelectServiceProviderActivity.class));
            }
        });


        if(mapView!=null){
            mapView.onCreate(null);
            mapView.onResume();
            mapView.getMapAsync(this);
        }
   }

    @Override
    public void onMapReady(GoogleMap googleMap1) {

        MapsInitializer.initialize(getApplicationContext());
        googleMap=googleMap1;
        googleMap1.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        googleMap1.addMarker(new MarkerOptions().position(new LatLng(40.45,-74.8888)).title("the place")
                .snippet("dddddddddddddddddd"));
        CameraPosition cameraPosition=CameraPosition.builder().target(new LatLng(40.45,-74.8888)
        ).zoom(16).bearing(0).tilt(45).build();

        googleMap1.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

    }

    }

