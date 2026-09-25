/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author manggala
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Tugas Pewarisan Hewan ---");
        Kucing kucing = new Kucing();
        kucing.nama = "Tom";
        kucing.jenis = "Anggora";
        kucing.tampilkanInfo();
        
        System.out.println();
        
        Anjing anjing = new Anjing();
        anjing.nama = "Spike";
        anjing.jenis = "Bulldog";
        anjing.tampilkanInfo();

        System.out.println("\n--- Tugas Hierarki 3 Level ---");
        Mobil mobil = new Mobil();
        mobil.nama = "Honda Civic";
        mobil.kecepatan = 150;
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 4;
        mobil.tampilkanInfo();
        
        System.out.println();
        
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Kawasaki Ninja";
        motor.kecepatan = 200;
        motor.jumlahRoda = 2;
        motor.jenisMesin = "4-tak";
        motor.tampilkanInfo();
    }
}