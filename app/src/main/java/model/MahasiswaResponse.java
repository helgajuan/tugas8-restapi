package model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MahasiswaResponse {
    @SerializedName("status") private boolean status;
    @SerializedName("data") private List<Mahasiswa> data;

    public boolean getStatus() {
        return status;
    }

    public List<Mahasiswa> getData() {
        return data;
    }
}