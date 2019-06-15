package com.example.mohamed.splash.sidemenuActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.mohamed.splash.ChangePasswordActivity;
import com.example.mohamed.splash.EditProfileActivity;
import com.example.mohamed.splash.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProfileActivity extends AppCompatActivity {


    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.edit_profile_date) Button edit_profile_date;
    @BindView(R.id.change_password) Button change_password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Profile");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        edit_profile_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this,EditProfileActivity.class));
            }
        });




        change_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this,ChangePasswordActivity.class));
            }
        });
    }
}
