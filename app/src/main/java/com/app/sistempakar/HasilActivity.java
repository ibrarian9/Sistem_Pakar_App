package com.app.sistempakar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class HasilActivity extends AppCompatActivity {

    TextView nama, persen;
    ImageView gambar;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        String data = getIntent().getStringExtra("data");
        nama = findViewById(R.id.tvNama);
        nama.setText(data);

        int hasil = getIntent().getIntExtra("hasil", 1);
        persen = findViewById(R.id.tvPersen);
        System.out.println("Nilai : " + hasil);
        persen.setText("Persentase : " + hasil + "%");

        int benar = getIntent().getIntExtra("benar", 0);
        System.out.println("benar : " + benar );

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