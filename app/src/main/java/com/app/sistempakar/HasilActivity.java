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

        int soal = getIntent().getIntExtra("soal", 0);
        int benar = getIntent().getIntExtra("benar", 0);
        persen = findViewById(R.id.tvPersen);
        System.out.println("Jumlah Soal : " + soal);
        System.out.println("benar : " + benar );
        double hasil = (double) benar / soal;
        System.out.println("hasil : " +  hasil);
        persen.setText("Persentase : " + hasil * 100 + "%");


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