/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan4.guided.projectbuku2;

/**
 *
 * @author alwi
 */
public class Buku {
    private String judul;
    private String pengarang;
    private int jumlah;
    
    public void setNilai(String judul, 
            String pengarang, 
            int jumlah) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.jumlah = jumlah;
    }
    
    public void cetakKeLayar() {
      System.out.println("Judul: " + this.judul);
      System.out.println("Pengarang: " + this.pengarang);
      System.out.println("Jumlah Halaman: " + this.jumlah);
    }
}
