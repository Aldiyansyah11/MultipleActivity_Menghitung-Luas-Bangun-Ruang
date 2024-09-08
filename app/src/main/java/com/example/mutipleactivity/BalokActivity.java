package com.example.mutipleactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BalokActivity extends AppCompatActivity {
    private TextView buttonluas;
    private EditText panjang;
    private EditText lebar;
    private EditText tinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        buttonluas = findViewById(R.id.tvLuas);
        panjang = findViewById(R.id.etPanjang);
        lebar = findViewById(R.id.etLebar);
        tinggi = findViewById(R.id.etTinggi);
    }

    public void showHitung(View view) {
        String isipanjang = panjang.getText().toString();
        String isilebar = lebar.getText().toString();
        String isitinggi = tinggi.getText().toString();
        Double hasilluas = 2 * Double.valueOf(isipanjang)*Double.valueOf(isilebar)
                + 2 * Double.valueOf(isipanjang)*Double.valueOf(isitinggi)
                + 2 * Double.valueOf(isitinggi)*Double.valueOf(isilebar);
        buttonluas.setText(String.valueOf(hasilluas));
    }
}