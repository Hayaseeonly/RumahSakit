import java.util.Scanner;

// Class Pasien
class Pasien {
    //(enkapsulasi)
    private String nama;
    private int umur;
    private String penyakit;

    public Pasien(String nama, int umur, String penyakit) {
        this.nama = nama;
        this.umur = umur;
        this.penyakit = penyakit;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if (umur > 0) {
            this.umur = umur;
        }
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    // Method tampilkan info pasien
    public void tampilkanInfo() {
        System.out.println("Nama Pasien : " + nama);
        System.out.println("Umur        : " + umur + " tahun");
        System.out.println("Penyakit    : " + penyakit);
    }
}

// Class RumahSakit
class RumahSakit {
    private Pasien[] daftarPasien;
    private int jumlahPasien;

    public RumahSakit(int kapasitas) {
        daftarPasien = new Pasien[kapasitas];
        jumlahPasien = 0;
    }

    public void tambahPasien(Pasien p) {
        if (jumlahPasien < daftarPasien.length) {
            daftarPasien[jumlahPasien] = p;
            jumlahPasien++;
            System.out.println("Pasien berhasil ditambahkan!");
        } else {
            System.out.println("Kapasitas penuh!");
        }
    }

    public void lihatPasien() {
        if (jumlahPasien == 0) {
            System.out.println("Belum ada pasien.");
        } else {
            for (int i = 0; i < jumlahPasien; i++) {
                System.out.println("[" + (i + 1) + "]");
                daftarPasien[i].tampilkanInfo();
                System.out.println("--------------------");
            }
        }
    }
}

// Main Class
public class SistemRumahSakit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RumahSakit rs = new RumahSakit(100);

        boolean jalan = true;
        while (jalan) {
            System.out.println("\n=== MENU RUMAH SAKIT ===");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Lihat Daftar Pasien");
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
