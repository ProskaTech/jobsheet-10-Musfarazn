/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prak10.java;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Manusia {
    String nama, tempat_lahir, tgl_lahir;
    int berat_badan, tinggi_badan;
    
    public void inputdata(){
    Scanner input = new Scanner(System.in);
    System.out.print("Masukan nama lengkap\t: ");
    nama = input.nextLine();
    System.out.print("Masukan tempat lahir\t: ");
    tempat_lahir = input.nextLine();
    System.out.print("Masukan tanggal lahir\t: ");
    tgl_lahir = input.nextLine();
    System.out.print("Masukan Berat Badan\t: ");
    berat_badan = input.nextInt();
    System.out.print("Masukan Tinggi Badan\t: ");
    tinggi_badan = input.nextInt();
    }
    
    public void identitas(){
    System.out.print("Nama saya\t: " + nama);    
    System.out.print("Tempat lahir\t: " + tempat_lahir);    
    System.out.print("Tanggal lahir\t: " + tgl_lahir);    
    System.out.print("Berat Badan\t: " + berat_badan +" kg");    
    System.out.print("Tinggi Badan\t: " + tinggi_badan + "cm");    
    }
    
    public static void main(String [] args){
        Manusia A = new Manusia();
        A.inputdata();
        A.identitas();
    }
    
    
}
