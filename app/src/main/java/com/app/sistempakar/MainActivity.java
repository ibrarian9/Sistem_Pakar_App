package com.app.sistempakar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView question, tv, yes, no;
    int num = 1;
    int persen = 0;
    int nilai;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String R1 = "Apakah Bunga Berwarna Merah ?";
        String R2 = "Apakah Bunga berwarna kuning ?";
        String R3 = "Apakah Memiliki aroma yang harum ?";
        String R4 = "Apakah Tidak memiliki aroma yang harum ?";
        String R5A = "Apakah memiliki Batang kuat ?";
        String R5B = "Apakah memiliki Batang kuat ? ";
        String R6 = "Apakah memiliki Batang lemah ?";
        String R7 = "Apakah memiliki Batang berduri ?";
        String R8A = "Apakah Batang tidak berduri ?";
        String R8B = "Apakah Batang tidak berduri ? ";
        String R9 = "Apakah Tumbuh di dataran tinggi ?";
        String R10 = "Apakah Tumbuh di dataran rendah ?";
        String R11 = "Apakah Kelopak tersusum rapat ?";
        String R12 = "Apakah Daun tumbuh bergerombol ?";
        String R13A = "Apakah Daun tumbuh tidak bergerombol ?";
        String R13B = "Apakah Daun tumbuh tidak bergerombol ? ";
        String R14A = "Apakah Waktu mekar yang tidak lama ?";
        String R14B = "Apakah Waktu mekar yang tidak lama ? ";
        String R15 = "Apakah Waktu mekar yang lama ?";
        String R16 = "Apakah memerlukan Pencahayaan parsial ?";
        String R17 = "Apakah memerlukan Pencahayaan tidak parsial ?";
        String R18A = "Apakah Ukuran bunga besar ?";
        String R18B = "Apakah Ukuran bunga besar ? ";
        String R19 = "Apakah Ukuran bunga sedang ?";
        String R20 = "Apakah Perawatannya mudah ?";
        String R21 = "Apakah Harus diberikan perawatan ekstra ?";
        String R22 = "Apakah Akar serabut ?";
        String R23 = "Apakah Akar tunggang ?";

        question = findViewById(R.id.question);
        tv = findViewById(R.id.tv);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);

        question.setText(R1);
        yes.setOnClickListener( v -> {
            num++;
            tv.setText("Pertanyaan " + num);
            nilai = persen++;
            if (question.getText().equals(R1)) {
                question.setText(R3);
            } else if (question.getText().equals(R3)) {
                question.setText(R5A);
            } else if (question.getText().equals(R5A)) {
                question.setText(R10);
            } else if (question.getText().equals(R10)) {
                question.setText(R14A);
            } else if (question.getText().equals(R14A)) {
                question.setText(R21);
            } else if (question.getText().equals(R21)) {
                question.setText(R7);
            } else if (question.getText().equals(R7)) {
                question.setText(R11);
            } else if (question.getText().equals(R11)) {
                intentMawar();
            } else if (question.getText().equals(R8A)) {
                question.setText(R13A);
            } else if (question.getText().equals(R13A)) {
                question.setText(R18A);
            } else if (question.getText().equals(R18A)) {
               intentLily();
            } else if (question.getText().equals(R2)) {
                question.setText(R4);
            } else if (question.getText().equals(R4)) {
                question.setText(R8B);
            } else if (question.getText().equals(R8B)) {
                question.setText(R17);
            } else if (question.getText().equals(R17)) {
                question.setText(R6);
            } else if (question.getText().equals(R6)) {
                question.setText(R12);
            } else if (question.getText().equals(R12)) {
                question.setText(R15);
            } else if (question.getText().equals(R15)) {
                question.setText(R19);
            } else if (question.getText().equals(R19)) {
                question.setText(R23);
            } else if (question.getText().equals(R23)) {
               intentAnggrek();
            } else if (question.getText().equals(R9)) {
                question.setText(R5B);
            } else if (question.getText().equals(R5B)) {
                question.setText(R13B);
            } else if (question.getText().equals(R13B)) {
                question.setText(R14B);
            } else if (question.getText().equals(R14B)) {
                question.setText(R18B);
            } else if (question.getText().equals(R18B)) {
                question.setText(R20);
            } else if (question.getText().equals(R20)) {
                question.setText(R22);
            } else if (question.getText().equals(R22)) {
                intentMatahari();
            }
        });

        no.setOnClickListener( v -> {
            num++;
            tv.setText("Pertanyaan " + num);
            if (question.getText().equals(R3)){
                question.setText(R5A);
            } else if (question.getText().equals(R5A)) {
                question.setText(R8A);
            } else if (question.getText().equals(R8A)) {
                question.setText(R13A);
            } else if (question.getText().equals(R13A)) {
                question.setText(R18A);
            } else if (question.getText().equals(R18A)) {
                intentLily();
            } else if (question.getText().equals(R10)) {
                question.setText(R14A);
            } else if (question.getText().equals(R14A)) {
                question.setText(R16);
            } else if (question.getText().equals(R16)) {
                question.setText(R21);
            } else if (question.getText().equals(R21)) {
                question.setText(R7);
            } else if (question.getText().equals(R7)) {
                question.setText(R11);
            } else if (question.getText().equals(R11)) {
                intentMawar();
            } else if (question.getText().equals(R17)) {
                question.setText(R6);
            } else if (question.getText().equals(R6)) {
                question.setText(R12);
            } else if (question.getText().equals(R12)) {
                question.setText(R15);
            } else if (question.getText().equals(R15)) {
                question.setText(R19);
            } else if (question.getText().equals(R19)) {
                question.setText(R23);
            } else if (question.getText().equals(R23)) {
                intentAnggrek();
            } else if (question.getText().equals(R1)) {
                question.setText(R2);
            } else if (question.getText().equals(R2)) {
                question.setText(R4);
            } else if (question.getText().equals(R4)) {
                question.setText(R8B);
            } else if (question.getText().equals(R8B)) {
                question.setText(R9);
            } else if (question.getText().equals(R9)) {
                question.setText(R5B);
            } else if (question.getText().equals(R5B)) {
                question.setText(R13B);
            } else if (question.getText().equals(R13B)) {
                question.setText(R14B);
            } else if (question.getText().equals(R14B)) {
                question.setText(R18B);
            } else if (question.getText().equals(R18B)) {
                question.setText(R20);
            } else if (question.getText().equals(R20)) {
                question.setText(R22);
            } else if (question.getText().equals(R22)) {
                intentMatahari();
            }
        });
    }

    private void intentMawar() {
        Intent i = new Intent(this, HasilActivity.class);
        i.putExtra("data", "Mawar");
        i.putExtra("soal", 7);
        i.putExtra("benar", nilai);
        startActivity(i);
        finish();
    }
    private void intentAnggrek() {
        Intent i = new Intent(this, HasilActivity.class);
        i.putExtra("data", "Anggrek");
        i.putExtra("soal", 8);
        i.putExtra("benar", nilai);
        startActivity(i);
        finish();
    } private void intentLily() {
        Intent i = new Intent(this, HasilActivity.class);
        i.putExtra("data", "Lily");
        i.putExtra("soal", 4);
        i.putExtra("benar", nilai);
        startActivity(i);
        finish();
    } private void intentMatahari() {
        Intent i = new Intent(this, HasilActivity.class);
        i.putExtra("data", "Matahari");
        i.putExtra("soal", 9);
        i.putExtra("benar", nilai);
        startActivity(i);
        finish();
    }
}