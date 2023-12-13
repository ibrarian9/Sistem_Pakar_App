package com.app.sistempakar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class HasilActivity extends AppCompatActivity {

    TextView nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);


        String data = getIntent().getStringExtra("R1");
        nama = findViewById(R.id.tvNama);
        nama.setText(data);
    }
}