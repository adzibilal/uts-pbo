/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adzibilal.utspbo;

/**
 *
 * @author Lenovo
 */

// Class Dosen
class Dosen {

    private String nama;
    private String pelajaran;
    private String kodeDosen;

    // Constructor
    public Dosen() {
    }

    // Constructor dengan parameter
    public Dosen(String nama, String pelajaran, String kodeDosen) {
        this.nama = nama;
        this.pelajaran = pelajaran;
        this.kodeDosen = kodeDosen;
    }

    // Method getter
    public String getNama() {
        return nama;
    }

    public String getPelajaran() {
        return pelajaran;
    }

    public String getKodeDosen() {
        return kodeDosen;
    }

    // Method untuk menampilkan detail dosen
    public void detail() {
        System.out.println("Nama: " + nama);
        System.out.println("Pelajaran: " + pelajaran);
        System.out.println("Kode Dosen: " + kodeDosen);
    }
}

// Class DosenBiasa
class DosenBiasa extends Dosen {

    // Constructor
    public DosenBiasa() {
    }

    // Constructor dengan parameter
    public DosenBiasa(String nama, String pelajaran, String kodeDosen) {
        super(nama, pelajaran, kodeDosen);
    }

    // Method untuk menampilkan detail dosen biasa
    @Override
    public void detail() {
        super.detail();
        System.out.println("Status: Dosen Biasa");
    }
}

// Class DosenLuarBiasa
class DosenLuarBiasa extends Dosen {

    // Constructor
    public DosenLuarBiasa() {
    }

    // Constructor dengan parameter
    public DosenLuarBiasa(String nama, String pelajaran, String kodeDosen) {
        super(nama, pelajaran, kodeDosen);
    }

    // Method untuk menampilkan detail dosen luar biasa
    @Override
    public void detail() {
        super.detail();
        System.out.println("Status: Dosen Luar Biasa");
    }
}

// Main class
public class soal3 {

    public static void main(String[] args) {

        // Buat objek DosenBiasa
        DosenBiasa dosenBiasa = new DosenBiasa("Adzi Bilal", "Matematika", "1234567890");

        // Tampilkan detail dosen biasa
        System.out.println("Detail Dosen Biasa:");
        dosenBiasa.detail();
        System.out.println();

        // Buat objek DosenLuarBiasa
        DosenLuarBiasa dosenLuarBiasa = new DosenLuarBiasa("Rudi D", "Fisika", "9876543210");

        // Tampilkan detail dosen luar biasa
        System.out.println("Detail Dosen Luar Biasa:");
        dosenLuarBiasa.detail();
    }
}
