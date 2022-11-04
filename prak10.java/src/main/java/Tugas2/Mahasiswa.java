/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Mahasiswa {
    String nama,nim,sem;
    float ip;

    public void inputDataMahasiswa(){
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan Nama \t   : ");
        nama = masuk.nextLine();
        System.out.print("Masukan NIM \t    : ");
        nim = masuk.nextLine();
        System.out.print("Masukan Semester \t   : ");
        sem = masuk.nextLine();
        System.out.print("Masukan IP semester ini \t   : ");
        ip = masuk.nextFloat();
    }

    public void tampilData(){
        System.out.println("Nama \t : " +nama);
        System.out.println("NIM \t : " +nim);
        System.out.println("Semester \t : " +sem);
        System.out.println("IP Semester ini \t : " +ip);
    }

    public void jika(){
        if(ip>=3.5){
            System.out.println("Anda berhak mengontrak 24 SKS pada semester V");
        }
        else if(ip>=3){
            System.out.println("Anda berhak mengontrak 22 SKS pada semester V");
        }
        else if(ip>=2.5){
            System.out.println("Anda berhak mengontrak 20 SKS pada semester V");
        }
        else if(ip>=2){
            System.out.println("Anda berhak mengontrak 18 SKS pada semester V");
        }
        else{
            System.out.println("Anda berhak mengontrak 15 SKS pada semester V");    
        }
    }
   
}
    

