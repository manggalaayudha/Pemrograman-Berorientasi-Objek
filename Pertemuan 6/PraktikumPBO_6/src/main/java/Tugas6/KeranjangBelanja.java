/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author manggala
 */
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> listProduk;

    public KeranjangBelanja() {
        listProduk = new ArrayList<>();
    }

    // Menambahkan produk ke dalam list
    public void tambahProduk(Produk produk) {
        listProduk.add(produk);
        System.out.println("Menambahkan " + produk.getNama() + " ke keranjang.");
    }

    // Menhitung total harga dari semua produk setelah dikurangi diskon masing-masing
    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk produk : listProduk) {
            total += produk.getHargaSetelahDiskon();
        }
        return total;
    }

    // Menampilkan rincian setiap produk dalam keranjang
    public void tampilkanRincian() {
        System.out.println("\n===== RINCIAN KERANJANG BELANJA =====");
        for (Produk p : listProduk) {
            System.out.printf("- %s | Harga Asli: Rp%.2f | Diskon: Rp%.2f | Harga Akhir: Rp%.2f\n",
                    p.getNama(), p.getHarga(), p.hitungDiskon(), p.getHargaSetelahDiskon());
        }
        System.out.println("=====================================");
    }
}
