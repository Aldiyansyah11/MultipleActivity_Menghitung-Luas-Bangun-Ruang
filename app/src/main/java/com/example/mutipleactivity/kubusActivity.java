package com.example.mutipleactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class kubusActivity extends AppCompatActivity {
    private TextView buttonluas;
    private EditText isirusuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        buttonluas = findViewById(R.id.tvLuas);
        isirusuk = findViewById(R.id.etPanjangRusuk);
    }

    public void showHitung(View view) {
        String rusuk = isirusuk.getText().toString();
        Double hasilluas = 6 * Double.valueOf(rusuk) * Double.valueOf(rusuk);
        buttonluas.setText(String.valueOf(hasilluas));
    }
}