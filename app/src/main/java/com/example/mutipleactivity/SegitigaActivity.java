package com.example.mutipleactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SegitigaActivity extends AppCompatActivity {
    private TextView buttonluas;
    private EditText alas;
    private EditText tinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        buttonluas = findViewById(R.id.tvLuas);
        alas = findViewById(R.id.etAlas);
        tinggi = findViewById(R.id.etTinggi);
    }

    public void showHitung(View view) {
        String a = alas.getText().toString();
        String t = tinggi.getText().toString();
        Double hasilluas = 0.5 * Double.valueOf(a) * Double.valueOf(t);
        buttonluas.setText(String.valueOf(hasilluas));
    }
}