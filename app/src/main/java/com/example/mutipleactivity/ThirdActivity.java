package com.example.mutipleactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    private Button kubusbutton, balokButton, segitigaButton, lingkaranButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        kubusbutton = findViewById(R.id.btn_kubus);
        balokButton = findViewById(R.id.btn_balok);
        segitigaButton = findViewById(R.id.btn_segitiga);
        lingkaranButton = findViewById(R.id.btn_lingkaran);

        kubusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, kubusActivity.class);
                startActivity(intent);
            }
        });
        balokButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, BalokActivity.class);
                startActivity(intent);
            }
        });
        segitigaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, SegitigaActivity.class);
                startActivity(intent);
            }
        });
        lingkaranButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, LingkaranActivity.class);
                startActivity(intent);
            }
        });
    }
}