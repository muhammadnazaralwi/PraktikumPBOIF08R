/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan4.guided.projectbuku1;

/**
 *
 * @author alwi
 */
public class Main {
    public static void main(String[] args) {
        //buat objek dari kelas Buku
        Buku buku1, buku2 = new Buku();
        
        buku1 = new Buku();
        buku2 = new Buku("Siaga Merah", "Jhon Wick");
        
        buku1.cetakKeLayar();
        buku2.cetakKeLayar();
    }
}
