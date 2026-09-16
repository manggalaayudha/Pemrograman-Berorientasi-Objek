/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum4;

/**
 *
 * @author manggala
 */
public class PraktikumPBO_4 {

    public static void main(String[] args) {
        Mobil mobilSaya = new Mobil("Mazda RX-8", 230, "Rotari", 4);
        
        System.out.println("--- Informasi Kendaraan ---");
        mobilSaya.tampilkanInfoKendaraan();

        System.out.println("\n--- Informasi Khusus Mobil ---");
        mobilSaya.tampilkanInfoMobil();

        System.out.println("\n--- Menguji Akses Modifier ---");

        mobilSaya.setNama("Kijang Innova");
        System.out.println("Nama baru (via Getter): " + mobilSaya.getNama());

        mobilSaya.jenisMesin = "Diesel";
        System.out.println("Jenis Mesin baru (Akses Langsung): " + mobilSaya.jenisMesin);

        mobilSaya.kecepatanMaks = 180;
        System.out.println("Kecepatan Maks baru (Protected): " + mobilSaya.kecepatanMaks + " km/h");
        
    } 
} 