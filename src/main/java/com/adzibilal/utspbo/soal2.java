/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adzibilal.utspbo;

/**
 *
 * @author Lenovo
 */
// Class Nilai
class Nilai {

    private double quis;
    private double uts;
    private double uas;

    // Constructor
    public Nilai() {
    }

    // Constructor dengan parameter
    public Nilai(double quis, double uts, double uas) {
        this.quis = quis;
        this.uts = uts;
        this.uas = uas;
    }

    // Method setter
    public void setQuis(double quis) {
        this.quis = quis;
    }

    public void setUTS(double uts) {
        this.uts = uts;
    }

    public void setUAS(double uas) {
        this.uas = uas;
    }

    // Method getter
    public double getQuis() {
        return quis;
    }

    public double getUTS() {
        return uts;
    }

    public double getUAS() {
        return uas;
    }

    // Method untuk menghitung nilai akhir
    public double getNA() {
        return (quis * 0.2) + (uts * 0.3) + (uas * 0.5);
    }

    // Method untuk mendapatkan index nilai
    public char getIndex() {
        char index;
        if (getNA() >= 80) {
            index = 'A';
        } else if (getNA() >= 68) {
            index = 'B';
        } else if (getNA() >= 56) {
            index = 'C';
        } else if (getNA() >= 45) {
            index = 'D';
        } else {
            index = 'E';
        }
        return index;
    }

    // Method untuk mendapatkan keterangan nilai
    public String getKeterangan() {
        String keterangan;
        switch (getIndex()) {
            case 'A':
                keterangan = "Sangat Baik";
                break;
            case 'B':
                keterangan = "Baik";
                break;
            case 'C':
                keterangan = "Cukup";
                break;
            case 'D':
                keterangan = "Kurang";
                break;
            case 'E':
                keterangan = "Sangat Kurang";
                break;
            default:
                keterangan = "Nilai tidak valid";
                break;
        }
        return keterangan;
    }
}

// Main class
public class soal2 {

    public static void main(String[] args) {

        // Buat objek Nilai
        Nilai nilai = new Nilai(80, 70, 90);

        // Tampilkan data nilai
        System.out.println("Nilai akhir: " + nilai.getNA());
        System.out.println("Index: " + nilai.getIndex());
        System.out.println("Keterangan: " + nilai.getKeterangan());
    }
}
