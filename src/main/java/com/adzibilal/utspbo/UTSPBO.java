package com.adzibilal.utspbo;

class Mahasiswa {

    private int nim;
    private String nama;
    private String notlp;

    // Constructor
    public Mahasiswa(int nim, String nama, String notlp) {
        this.nim = nim;
        this.nama = nama;
        this.notlp = notlp;
    }

    // Getter dan Setter
    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNotlp() {
        return notlp;
    }

    public void setNotlp(String notlp) {
        this.notlp = notlp;
    }
}

class MahasiswaInter extends Mahasiswa {

    private String noPaspor;
    private String kebangsaan;

    // Constructor
    public MahasiswaInter(int nim, String nama, String notlp, String noPaspor, String kebangsaan) {
        super(nim, nama, notlp);
        this.noPaspor = noPaspor;
        this.kebangsaan = kebangsaan;
    }

    // Getter dan Setter tambahan
    public String getNoPaspor() {
        return noPaspor;
    }

    public void setNoPaspor(String noPaspor) {
        this.noPaspor = noPaspor;
    }

    public String getKebangsaan() {
        return kebangsaan;
    }

    public void setKebangsaan(String kebangsaan) {
        this.kebangsaan = kebangsaan;
    }
}

public class UTSPBO {

    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa(123456, "Adzi Bilal", "08123456789");

        // Menggunakan getter untuk mendapatkan nilai atribut Mahasiswa
        System.out.println("Data Mahasiswa:");
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("No. Telepon: " + mahasiswa.getNotlp());
        System.out.println();

        // Membuat objek MahasiswaInter
        MahasiswaInter mahasiswaInter = new MahasiswaInter(654321, "Ryne Alkar", "087654321", "ABCD123456", "Amerika");

        // Menggunakan getter untuk mendapatkan nilai atribut Mahasiswa dan MahasiswaInter
        System.out.println("Data Mahasiswa Internasional:");
        System.out.println("NIM: " + mahasiswaInter.getNim());
        System.out.println("Nama: " + mahasiswaInter.getNama());
        System.out.println("No. Telepon: " + mahasiswaInter.getNotlp());
        System.out.println("No. Paspor: " + mahasiswaInter.getNoPaspor());
        System.out.println("Kebangsaan: " + mahasiswaInter.getKebangsaan());
    }
}
