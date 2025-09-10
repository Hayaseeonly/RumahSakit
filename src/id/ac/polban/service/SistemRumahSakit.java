package id.ac.polban.service;

import id.ac.polban.model.Pasien;
import id.ac.polban.model.RumahSakit;
import java.util.Scanner;

public class SistemRumahSakit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RumahSakit.infoRS();
        RumahSakit rs = new RumahSakit("RS Polban");

        boolean jalan = true;
        while (jalan) {
            System.out.println("\n=== MENU RUMAH SAKIT ===");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Lihat Daftar Pasien");
            System.out.println("3. Lihat Jumlah Pasien (static)");
            System.out.println("4. Update Data Pasien");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Penyakit: ");
                    String penyakit = sc.nextLine();

                    Pasien p = new Pasien(nama, umur, penyakit);
                    rs.tambahPasien(p);
                    break;
                case 2:
                    rs.lihatPasien();
                    break;
                case 3:
                    System.out.println("Total pasien terdaftar: " + Pasien.getJumlahPasien());
                    break;
                case 4:
                    rs.lihatPasien();
                    System.out.print("Pilih nomor pasien yang ingin diupdate: ");
                    int idx = sc.nextInt() - 1;
                    sc.nextLine();
                    System.out.print("Nama baru: ");
                    String newNama = sc.nextLine();
                    System.out.print("Umur baru: ");
                    int newUmur = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Penyakit baru: ");
                    String newPenyakit = sc.nextLine();

                    rs.updatePasien(idx, newNama, newUmur, newPenyakit);
                    break;
                case 0:
                    jalan = false;
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        sc.close();
    }
}