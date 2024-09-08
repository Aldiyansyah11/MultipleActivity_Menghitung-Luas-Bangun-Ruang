package com.example.mutipleactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private TextView buttonhasil1, buttonhasil2, buttonhasil3, buttonhasil4 ;
    private EditText nama, nim, alamat, prodi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        buttonhasil1 = findViewById(R.id.tvHasil1);
        buttonhasil2 = findViewById(R.id.tvHasil2);
        buttonhasil3 = findViewById(R.id.tvHasil3);
        buttonhasil4 = findViewById(R.id.tvHasil4);
        nim = findViewById(R.id.etNim);
        nama = findViewById(R.id.etNama);
        alamat = findViewById(R.id.etAlamat);
        prodi = findViewById(R.id.etProdi);
    }

    public void showHasil(View view) {
        String nm = nim.getText().toString();
        String na = nama.getText().toString();
        String almt = alamat.getText().toString();
        String prd = prodi.getText().toString();

        buttonhasil1.setText(nm);
        buttonhasil2.setText(na);
        buttonhasil3.setText(prd);
        buttonhasil4.setText(almt);
    }
}