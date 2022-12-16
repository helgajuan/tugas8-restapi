package model;

import com.google.gson.annotations.SerializedName;

public class Mahasiswa {
    @SerializedName("id") private String id;
    @SerializedName("nrp") private String nrp;
    @SerializedName("nama") private String nama;
    @SerializedName("email") private String email;
    @SerializedName("jurusan") private String jurusan;

    public String getId() {
        return id;
    }
    public String getNrp() {
        return nrp;
    }
    public String getNama() {
        return nama;
    }
    public String getEmail() {
        return email;
    }
    public String getJurusan() {
        return jurusan;
    }
}
