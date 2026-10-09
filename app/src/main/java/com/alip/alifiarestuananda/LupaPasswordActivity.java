package com.alip.alifiarestuananda;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LupaPasswordActivity extends AppCompatActivity {

    private EditText txtEmail;
    private Button btnKirimTautan;
    private TextView tvAturUlangPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password);

        txtEmail = findViewById(R.id.txtEmail);
        btnKirimTautan = findViewById(R.id.btnKirimTautan);
        tvAturUlangPassword = findViewById(R.id.aturUlangPassword);

        // 1. Terima Data dari Intent Eksplisit (putExtra "message") & Tampilkan via Toast
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("message")) {
            String message = intent.getStringExtra("message");
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }

        // 2. Intent Implisit untuk membuka Browser menuju URL https://itts.ac.id
        tvAturUlangPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicitIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://itts.ac.id"));
                startActivity(implicitIntent);
            }
        });

        btnKirimTautan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = txtEmail.getText().toString().trim();
                if (email.isEmpty()) {
                    Toast.makeText(LupaPasswordActivity.this, "Harap masukkan email Anda!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(LupaPasswordActivity.this, "Tautan reset password dikirim ke " + email, Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        });
    }
}