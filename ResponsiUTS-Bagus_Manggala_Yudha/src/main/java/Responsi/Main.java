/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author manggala
 */
public class Main {
    public static void main(String[] args) {
        Produk produk1 = new Elektronik("Laptop", 15000000, 2);
        Pegawai pegawai1 = new PegawaiTetap("Bagus Manggala Yudha", 5000000, 1000000);
        
        Produk produk2 = new Makanan("Snack", 15000, "2023-12-30");
        Pegawai pegawai2 = new PegawaiKontrak("Andi", 3000000, 12);

        System.out.println("1. Output Produk");
        produk1.tampilkanInfo();
        System.out.println();

        System.out.println("2. Output Pegawai");
        pegawai1.tampilkanInfo();
        System.out.println();

        System.out.println("3. Output Polimorfisme");
        produk2.tampilkanInfo();
        pegawai2.tampilkanInfo();
    }
}