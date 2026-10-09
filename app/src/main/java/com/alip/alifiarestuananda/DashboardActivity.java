package com.alip.alifiarestuananda;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.belajarpemrogramanmobile.fragment.ConstraintFragment;
import com.belajarpemrogramanmobile.fragment.LinearFragment;
import com.belajarpemrogramanmobile.fragment.RelativeFragment;
import com.belajarpemrogramanmobile.fragment.ScrollFragment;

public class DashboardActivity extends AppCompatActivity {

    private Button btnLinear;
    private Button btnRelative;
    private Button btnConst;
    private Button btnScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnLinear = findViewById(R.id.btn_linear);
        btnRelative = findViewById(R.id.btn_relative);
        btnConst = findViewById(R.id.btn_const);
        btnScroll = findViewById(R.id.btn_scroll);

        // Set default fragment saat pertama dibuka (LinearFragment)
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frl_dashboard, new LinearFragment())
                    .commit();
        }

        // Action Tombol LINEAR
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frl_dashboard, new LinearFragment())
                        .commit();
            }
        });

        // Action Tombol RELATIVE
        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frl_dashboard, new RelativeFragment())
                        .commit();
            }
        });

        // Action Tombol CONST
        btnConst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frl_dashboard, new ConstraintFragment())
                        .commit();
            }
        });

        // Action Tombol SCRO
        btnScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frl_dashboard, new ScrollFragment())
                        .commit();
            }
        });
    }
}