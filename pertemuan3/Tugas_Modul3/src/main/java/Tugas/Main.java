/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author manggala
 */
public class Main {
    
    public static void main(String[] args) {
        
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2022, "Putih");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2024, "Hitam");
        
        System.out.println("=== MOBIL 1 ===");
        mobil1.displayInfo();
        mobil1.startEngine();
        
        System.out.println();
        
        System.out.println("=== MOBIL 2 ==="); 
        mobil2.displayInfo();
        mobil2.startEngine();
        
        System.out.println();
        
        System.out.println("=== PERUBAHAN WARNA ===");
        System.out.println("Warna mobil 1 sebelum diubah: " + mobil1.getWarna());

        mobil1.ubahWarna("Merah");

        System.out.println("Warna mobil 1 setelah diubah: " + mobil1.getWarna());

        System.out.println();

        // Menampilkan informasi mobil setelah perubahan
        System.out.println("=== INFORMASI MOBIL 1 SETELAH PERUBAHAN ===");
        mobil1.displayInfo();
    }
}