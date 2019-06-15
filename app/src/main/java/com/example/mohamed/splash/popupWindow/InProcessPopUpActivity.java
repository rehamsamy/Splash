package com.example.mohamed.splash.popupWindow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

import com.example.mohamed.splash.popupActivityDetail.GiveBonusActivity;
import com.example.mohamed.splash.popupActivityDetail.NoteActivity;
import com.example.mohamed.splash.R;
import com.example.mohamed.splash.popupActivityDetail.ReportProblemActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InProcessPopUpActivity extends AppCompatActivity {



    @BindView(R.id.add_notes) TextView add_notes;
    @BindView(R.id.give_bonus) TextView give_bonus;
    @BindView(R.id.report_proplem) TextView report_proplem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_process_pop_up);

        ButterKnife.bind(this);
        DisplayMetrics displayMetrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        int width=displayMetrics.widthPixels;
        int height=displayMetrics.heightPixels;
        getWindow().setLayout((int) (width *.8),(int) (height* .6));



        add_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), NoteActivity.class));
            }
        });


        give_bonus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), GiveBonusActivity.class));
            }
        });


        report_proplem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(getApplicationContext(), ReportProblemActivity.class));
            }
        });

    }
}
