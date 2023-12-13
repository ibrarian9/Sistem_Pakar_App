package com.app.sistempakar.Models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class DataPakar implements Serializable {
    private String Nama, Id;
    private boolean isSelected;

    public DataPakar(){

    }

    public DataPakar(String nama, String id, boolean isSelected) {
        Nama = nama;
        Id = id;
        this.isSelected = isSelected;
    }

    protected DataPakar(Parcel in) {
        Nama = in.readString();
        Id = in.readString();
        isSelected = in.readByte() != 0;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }


}
