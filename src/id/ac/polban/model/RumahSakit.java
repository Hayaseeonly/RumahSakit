package id.ac.polban.model;

import java.util.ArrayList;
import java.util.List;

public class RumahSakit {
    private String namaRS;
    private List<Pasien> daftarPasien;

    public RumahSakit(String namaRS) {
        this.namaRS = namaRS;
        this.daftarPasien = new ArrayList<>();
    }

    public void tambahPasien(Pasien p) {
        daftarPasien.add(p);
        System.out.println("Pasien berhasil ditambahkan!");
    }

    public void lihatPasien() {
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada pasien.");
        } else {
            System.out.println("=== Daftar Pasien di " + namaRS + " ===");
            for (int i = 0; i < daftarPasien.size(); i++) {
                System.out.println("[" + (i + 1) + "]");
                daftarPasien.get(i).tampilkanInfo();
                System.out.println("--------------------");
            }
        }
    }

    public void updatePasien(int index, String nama, int umur, String penyakit) {
        if (index >= 0 && index < daftarPasien.size()) {
            Pasien p = daftarPasien.get(index);
            p.setNama(nama);
            p.setUmur(umur);
            p.setPenyakit(penyakit);
            System.out.println("Data pasien berhasil diupdate!");
        } else {
            System.out.println("Pasien tidak ditemukan!");
        }
    }

    public static void infoRS() {
        System.out.println("Selamat datang di Sistem Rumah Sakit POLBAN");
    }

    public List<Pasien> getDaftarPasien() {
        return daftarPasien;
    }
}
