package com.example.mutipleactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LingkaranActivity extends AppCompatActivity {
    private TextView buttonluas;
    private EditText jari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        buttonluas = findViewById(R.id.tvLuas);
        jari = findViewById(R.id.etJari);
    }

    public void showHitung(View view) {
        String jar = jari.getText().toString();
        Double  hasilluas = 3.14 * Double.valueOf(jar) * Double.valueOf(jar);
        buttonluas.setText(String.valueOf(hasilluas));
    }
}