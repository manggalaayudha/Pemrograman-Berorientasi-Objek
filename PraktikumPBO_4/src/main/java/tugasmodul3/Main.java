/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul3;

/**
 *
 * @author manggala
 */
public class Main {
    public static void main(String[] args) {
        Pekerja pekerja1 = new Pekerja("Andi", 25, "Software Engineer", 8000000);

        System.out.println("--- Data Pekerja Awal ---");
        System.out.println(pekerja1.toString());

        pekerja1.setNama("Andi Saputra");
        System.out.println("\n--- Data Pekerja Setelah Nama Diubah ---");
        System.out.println(pekerja1.toString());

        System.out.println("\n--- Percobaan Akses Langsung ---");
        
        
        pekerja1.usia = 26; 
        System.out.println("Akses usia berhasil diubah menjadi: " + pekerja1.usia);

        //pekerja1.nama = "Budi"; 
        
        // pekerja1.gaji = 9000000; 
    }
}
