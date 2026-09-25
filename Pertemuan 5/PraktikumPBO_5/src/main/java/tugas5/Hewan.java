/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author manggala
 */
class Hewan {
    String nama;
    String jenis;
    
    public void tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis: " + jenis);
    }
}

//Kelas Turunan Kucing
class Kucing extends Hewan {
    public void suara() {
        System.out.println("Suara: Meong meong!");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); 
        suara(); 
    }
}

// Kelas Turunan Anjing
class Anjing extends Hewan {
    public void suara() {
        System.out.println("Suara: Guk guk!");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); 
        suara(); 
    }
}