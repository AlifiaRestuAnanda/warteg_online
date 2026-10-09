package com.alip.alifiarestuananda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText txtUsername;
    private EditText txtPassword;
    private Button btnOk;
    private Button btnCancel;
    private Button btnDashboard;
    private TextView tvLupaPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCancel);
        btnDashboard = findViewById(R.id.dashboard);
        tvLupaPassword = findViewById(R.id.lupaPassword);

        // Action Tombol OK
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = txtUsername.getText().toString().trim();
                String password = txtPassword.getText().toString().trim();

                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Harap isi username dan password!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login Berhasil untuk " + username, Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Action Tombol CANCEL
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtUsername.setText("");
                txtPassword.setText("");
                Toast.makeText(MainActivity.this, "Form dibersihkan", Toast.LENGTH_SHORT).show();
            }
        });

        // 1. Intent Eksplisit & Passing Data ke LupaPasswordActivity
        tvLupaPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LupaPasswordActivity.class);
                intent.putExtra("message", "Ini adalah efek dari ekplisit intent");
                startActivity(intent);
            }
        });

        // 3. Intent Eksplisit menuju DashboardActivity
        btnDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });
    }
}