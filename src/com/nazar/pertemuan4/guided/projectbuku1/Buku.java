/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan4.guided.projectbuku1;

/**
 *
 * @author alwi
 */
public class Buku {
    private String judul;
    private String pengarang;
    
    public Buku() {
        judul = "Tidak diketahui";
        pengarang = "Tidak diketahui";
    }
    
    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }
    
    void cetakKeLayar() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
    }
}
