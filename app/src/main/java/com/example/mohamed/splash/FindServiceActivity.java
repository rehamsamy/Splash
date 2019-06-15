package com.example.mohamed.splash;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.NotificationCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.mohamed.splash.sidemenuActivity.AddReviewActivity;
import com.example.mohamed.splash.sidemenuActivity.ContactUsActivity;
import com.example.mohamed.splash.sidemenuActivity.HistoryActivity;
import com.example.mohamed.splash.sidemenuActivity.PaymentMethodActivity1;
import com.example.mohamed.splash.sidemenuActivity.ProfileActivity;
import com.example.mohamed.splash.sidemenuActivity.PromoActivity;
import com.example.mohamed.splash.sidemenuActivity.ReviewsActivity;
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

public class FindServiceActivity extends AppCompatActivity implements OnMapReadyCallback{


  //  NavigationView navigationView;
   // DrawerLayout drawerLayout;
    ActionBarDrawerToggle drawerToggle;
    //android.support.v7.widget.Toolbar toolbar;


   // MapView mapView;

    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.map_view) MapView mapView;
    @BindView(R.id.nv) NavigationView navigationView;
    @BindView(R.id.activity_main) DrawerLayout drawerLayout;
    @BindView(R.id.find_service) Button find_service;

    GoogleMap googleMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_service);

        ButterKnife.bind(this);
        //toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.nav_back);



        //navigationView=(NavigationView) findViewById(R.id.nv);
        //drawerLayout=(DrawerLayout) findViewById(R.id.activity_main);
        drawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
       // t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);


        drawerLayout.addDrawerListener(drawerToggle);

        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);



        mapView=(MapView) findViewById(R.id.map_view);


        if(mapView!=null){
            mapView.onCreate(null);
            mapView.onResume();
            mapView.getMapAsync(this);
        }


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int id=menuItem.getItemId();

                switch (id){

                    case  R.id.profile :
                        startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
                        break;

                    case R.id.history:
                        startActivity(new Intent(getApplicationContext(),HistoryActivity.class));
                        break;
                    case R.id.payment:
                        startActivity(new Intent(getApplicationContext(),PaymentMethodActivity1.class));
                          break;
                    case R.id.contact_us:
                        startActivity(new Intent(getApplicationContext(),ContactUsActivity.class));
                        break;

                    case R.id.promocode:
                        startActivity(new Intent(getApplicationContext(), PromoActivity.class));
                        break;
                    case R.id.reviews:
                        startActivity(new Intent(getApplicationContext(), ReviewsActivity.class));
                        break;

                    case R.id.notifications:
                        startActivity(new Intent(getApplicationContext(), AddReviewActivity.class));
                        break;



                    default:


                }
                return true;

            }
        });


        find_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SelectServiceActivity.class));
            }
        });

    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {

            super.onBackPressed();
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.menu_search,menu);
        return true ;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.search){

        }
        return true;
    }

    //hr@propertzcrm.com
}
