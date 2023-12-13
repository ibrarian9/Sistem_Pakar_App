package com.app.sistempakar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.app.sistempakar.Adapter.SistemAdapter;
import com.app.sistempakar.Models.DataPakar;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    TextView submit;
    SistemAdapter sistemAdapter;
    ArrayList<DataPakar> list = new ArrayList<>();
    ArrayList<String> newData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sistemAdapter = new SistemAdapter(this, list);
        rv = findViewById(R.id.rv);
        rv.setAdapter(sistemAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this));

        ValueEventListener value = new ValueEventListener() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                sistemAdapter.clear();

                for (DataSnapshot snapshot1 : snapshot.getChildren()) {
                    DataPakar dataPakarList = snapshot1.getValue(DataPakar.class);
                    list.add(dataPakarList);
                }
                sistemAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        };

        Query listData = FirebaseDatabase.getInstance().getReference("Data");
        listData.addValueEventListener(value);

        String[] rules1 = new String[]{"A1","A3","A6","A7","A9","A16","A18"};
        String[] rules2 = new String[]{"A2","A5","A10","A15","A20"};
        String[] rules3 = new String[]{"A3","A7","A11","A13","A17"};
        String[] rules4 = new String[]{"A4","A8","A12","A14","A19"};

        System.out.println(Arrays.toString(rules1));

        submit = findViewById(R.id.tvSubmit);
        submit.setOnClickListener(v -> {
            ArrayList<DataPakar> dataPakars = sistemAdapter.getAll();
            for (int i = 0; i < dataPakars.size(); i++) {
                DataPakar dataPakar = dataPakars.get(i);
                if (dataPakar.isSelected()) {
                    Intent in = new Intent(this, HasilActivity.class);
                    ArrayList<String> newData = new ArrayList<>();
                    newData.add(dataPakar.getId());
                    System.out.println(newData);
                    if (newData.equals(rules2)) {
                        System.out.println("data Sama");
                    } else {
                        System.out.println("data tidak Sama");
                    }

                }}
        });
        }
}