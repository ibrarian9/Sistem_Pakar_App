package com.app.sistempakar.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.sistempakar.Models.DataPakar;
import com.app.sistempakar.R;

import java.util.ArrayList;

public class SistemAdapter extends RecyclerView.Adapter<SistemAdapter.MyViewHolder> {

    Context context;

    private final ArrayList<DataPakar> list;

    public SistemAdapter(Context context, ArrayList<DataPakar> list) {
        this.context = context;
        this.list = list;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void clear(){
        list.clear();
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SistemAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(v);
    }

    @SuppressLint({"SetTextI18n", "NotifyDataSetChanged"})
    @Override
    public void onBindViewHolder(@NonNull SistemAdapter.MyViewHolder holder, int pos) {
        DataPakar dataPakar = list.get(pos);

        holder.checkBox.setText(dataPakar.getNama());
        holder.checkBox.setTag(list.get(pos));
        holder.checkBox.setChecked(dataPakar.isSelected());

        holder.checkBox.setOnClickListener(v -> {
            DataPakar data1 = (DataPakar) holder.checkBox.getTag();
            data1.setSelected(holder.checkBox.isChecked());
            list.get(pos).setSelected(holder.checkBox.isChecked());
        });
    }

    public ArrayList<DataPakar> getAll() {
        return list;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        CheckBox checkBox;
        public MyViewHolder(@NonNull View i) {
            super(i);

            checkBox = i.findViewById(R.id.dataNama);
        }
    }
}
