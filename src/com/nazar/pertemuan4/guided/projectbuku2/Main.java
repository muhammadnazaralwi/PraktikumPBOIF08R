/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan4.guided.projectbuku2;

/**
 *
 * @author alwi
 */
public class Main {
  public static void main(String[] args) {
      Buku a = new Buku();
      
      a.setNilai("Jurassic Park", "Michael Crichton", 21);
//      a.judul = "Jurassic Park";
//      a.pengarang = "Michael Crichton";
//      a.jumlah = 21;

      a.cetakKeLayar();
//      System.out.println("Judul: " + a.judul);
//      System.out.println("Pengarang: " + a.pengarang);
//      System.out.println("Jumlah Halaman: " + a.jumlah);
  }  
}
