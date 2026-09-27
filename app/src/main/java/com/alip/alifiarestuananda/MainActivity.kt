package com.alip.alifiarestuananda

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    private lateinit var txtUsername: EditText
    private lateinit var txtPassword: EditText
    private lateinit var btnOk: Button
    private lateinit var btnCancel: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_layout)

        txtUsername = findViewById(R.id.txtUsername)
        txtPassword = findViewById(R.id.txtPassword)
        btnOk = findViewById(R.id.btnOk)
        btnCancel = findViewById(R.id.btnCancel)

        btnOk.setOnClickListener {
            val username = txtUsername.text.toString().trim()
            val password = txtPassword.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Harap isi username dan password!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Berhasil untuk $username", Toast.LENGTH_SHORT).show()
            }
        }

        btnCancel.setOnClickListener {
            txtUsername.setText("")
            txtPassword.setText("")
            Toast.makeText(this, "Form dibersihkan", Toast.LENGTH_SHORT).show()
        }
    }
}