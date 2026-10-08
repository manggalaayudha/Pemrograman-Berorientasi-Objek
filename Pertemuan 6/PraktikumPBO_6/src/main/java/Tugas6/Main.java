/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author manggala
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // Penerapan Polimorfisme: Referensi variabel bertipe Produk (superclass),
        // namun berisi objek nyata dari subclass (Buku, Elektronik, Pakaian)
        Produk buku1 = new Buku("Pemrograman Java PBO", 100000);
        Produk laptop = new Elektronik("Laptop ASUS ROG", 15000000);
        Produk kaos = new Pakaian("Kaos Polos", 150000);

        // Menambahkan produk ke keranjang
        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(laptop);
        keranjang.tambahProduk(kaos);

        // Menampilkan rincian dan total harga
        keranjang.tampilkanRincian();

        double totalBayar = keranjang.hitungTotalHargaSetelahDiskon();
        System.out.printf("TOTAL HARGA SETELAH DISKON: Rp%.2f\n", totalBayar);
    }
}