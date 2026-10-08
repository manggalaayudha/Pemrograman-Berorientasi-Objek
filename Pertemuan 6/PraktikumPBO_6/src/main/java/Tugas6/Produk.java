/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author manggala
 */
public abstract class Produk {
    protected String nama;
    protected double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Method abstrak yang akan di-override oleh kelas turunan
    public abstract double hitungDiskon();

    // Method untuk mendapatkan harga akhir setelah diskon
    public double getHargaSetelahDiskon() {
        return harga - hitungDiskon();
    }
}    

