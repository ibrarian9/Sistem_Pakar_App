package com.app.sistempakar;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;

import java.text.DecimalFormat;

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

        int soal = getIntent().getIntExtra("soal", 0);
        int benar = getIntent().getIntExtra("benar", 0);
        persen = findViewById(R.id.tvPersen);
        System.out.println("Jumlah Soal : " + soal);
        System.out.println("benar : " + benar );
        double a = (double) benar / soal;
        double hasil = a * 100;
        DecimalFormat numFormat = new DecimalFormat("#.00");
        System.out.println("hasil : " +  numFormat.format(hasil));
        persen.setText("Persentase : " + numFormat.format(hasil) + "%");
        gambar = findViewById(R.id.image);


        if (data != null) {
            if (data.equals("Mawar") && hasil != 0) {
                Picasso.get().load(R.drawable.mawar).fit().into(gambar);
                nama.setText(data);
            } else if (data.equals("Anggrek") && hasil != 0) {
                Picasso.get().load(R.drawable.anggrek).fit().into(gambar);
                nama.setText(data);
            } else if (data.equals("Lily") && hasil != 0) {
                Picasso.get().load(R.drawable.lily).fit().into(gambar);
                nama.setText(data);
            } else if (data.equals("Matahari") && hasil != 0) {
                Picasso.get().load(R.drawable.matahari).fit().into(gambar);
                nama.setText(data);
            } else {
                Picasso.get().load(R.drawable.imgnothing).fit().into(gambar);
                nama.setText("Data Tidak Cocok...");
            }
        } else {
            Toast.makeText(this, "Data Tidak Ada...", Toast.LENGTH_SHORT).show();
        }
    }
}