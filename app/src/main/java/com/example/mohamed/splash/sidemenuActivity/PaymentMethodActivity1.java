package com.example.mohamed.splash.sidemenuActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.mohamed.splash.Adapter.PaymentMethodAdapter;
import com.example.mohamed.splash.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PaymentMethodActivity1 extends AppCompatActivity implements PaymentMethodAdapter.OnItemClick {



    @BindView(R.id.payment_recycler) RecyclerView payment_recycler;
    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.add_payment_button)ImageView add_payment_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method1);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Payment Method");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        payment_recycler=(RecyclerView) findViewById(R.id.payment_recycler);
        payment_recycler.setLayoutManager(new LinearLayoutManager(this));
        PaymentMethodAdapter adapter=new PaymentMethodAdapter(this,this);
        payment_recycler.setAdapter(adapter);




        add_payment_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),PaymentMethodActivity3.class));
            }
        });

    }

    @Override
    public void onClick(int position) {
       // startActivity(new Intent(getApplicationContext(),PaymentMethodActivity2.class));

    }
}
