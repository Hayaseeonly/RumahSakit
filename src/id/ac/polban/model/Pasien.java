package id.ac.polban.model;

public class Pasien extends Orang {
   private static int jumlahPasien = 0;
   private String penyakit;

   public Pasien(String nama, int umur, String penyakit) {
       super(nama, umur);  // panggil konstruktor Orang
       this.penyakit = penyakit;
       jumlahPasien++;
   }

   public String getPenyakit() {
       return penyakit;
   }

   public void setPenyakit(String penyakit) {
       this.penyakit = penyakit;
   }

   @Override
   public void tampilkanInfo() {
       super.tampilkanInfo();  // dari Orang: nama & umur
       System.out.println("Penyakit    : " + penyakit);
   }

   public static int getJumlahPasien() {
       return jumlahPasien;
   }
}
