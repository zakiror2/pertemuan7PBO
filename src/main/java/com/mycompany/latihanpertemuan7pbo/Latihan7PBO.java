/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.latihanpertemuan7pbo;

/**
 *
 * @author A-14
 */
public class Latihan7PBO {
    public static void main(String[] args) {
        System.out.println("Latihan7PBO");
        String judulbuku1 = "Java 1";
        String authorbuku1 = "Jono 2";
        String judulbuku2 = "Java 2";
        String authorbuku2 = "Jepri";
        
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        buku1.judul = "Java 1";
        buku1.author.nama = "Jono";
        buku2.judul = "Java 2";
        buku2.author.nama = "Jepri";
        
        System.out.println(buku1.judul);
        buku1.author.sebutNama();
        System.out.println(buku1.author);
        System.out.println(buku2.judul);
        buku2.author.sebutNama();
        System.out.println(buku2.author);
        System.out.println(buku1.tahunpenerbitan);
        System.out.println(buku1.harga.beli);
        System.out.println(buku1.penerbit.nama);
        
        
        
        
        
    }
}

class Buku{
    String judul;
    Person author =  new Person();
    int tahunpenerbitan = 2024;
    Harga harga = new Harga();
    Perusahaanbuku penerbit = new Perusahaanbuku();
    
    
 
}
class Harga{
    double jual = 100000.00;
    double beli = 80000.00;
    
}