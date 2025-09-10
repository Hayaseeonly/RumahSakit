package id.ac.polban.model;

public class Pasien {
    private static int jumlahPasien = 0;

    private String nama;
    private int umur;
    private String penyakit;

    public Pasien(String nama, int umur, String penyakit) {
        this.nama = nama;
        this.umur = umur;
        this.penyakit = penyakit;
        jumlahPasien++;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public int getUmur() { return umur; }
    public void setUmur(int umur) { if (umur > 0) this.umur = umur; }

    public String getPenyakit() { return penyakit; }
    public void setPenyakit(String penyakit) { this.penyakit = penyakit; }

    public void tampilkanInfo() {
        System.out.println("Nama Pasien : " + nama);
        System.out.println("Umur        : " + umur + " tahun");
        System.out.println("Penyakit    : " + penyakit);
    }

    public static int getJumlahPasien() {
        return jumlahPasien;
    }
}
