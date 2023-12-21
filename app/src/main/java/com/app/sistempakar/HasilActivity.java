package com.app.sistempakar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class HasilActivity extends AppCompatActivity {

    TextView nama;
    ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        String data = getIntent().getStringExtra("data");
        nama = findViewById(R.id.tvNama);
        nama.setText(data);

        gambar = findViewById(R.id.image);
        assert data != null;
        switch (data) {
            case "Mawar":
                Picasso.get().load(R.drawable.mawar).fit().into(gambar);
                break;
            case "Anggrek":
                Picasso.get().load(R.drawable.anggrek).fit().into(gambar);
                break;
            case "Lily":
                Picasso.get().load(R.drawable.lily).fit().into(gambar);
                break;
            case "Matahari":
                Picasso.get().load(R.drawable.matahari).fit().into(gambar);
                break;
        }
    }
}