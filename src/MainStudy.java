/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab2;

import java.util.Scanner;

/**
 *
 * @author HP 8.1
 */
public class MainStudy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("---INPUT---");
        int jum_mhs = in.nextInt();        
        int panjang = in.nextInt();
        int lebar = in.nextInt();
        Lap b = new Lap(panjang,lebar);

        Study a [] = new Study[jum_mhs];
        String nim[]= new String[jum_mhs];
        String nama_mahasiswa[] = new String [jum_mhs];
        int jumlahPutaran[] = new int[jum_mhs];
        int jum_waktu[] = new int[jum_mhs];
            
        for (int i=0; i<jum_mhs; i++) {
            
            
            a[i]= new Study();
            nim[i] = in.next();
            nama_mahasiswa[i] = in.next();
            jumlahPutaran[i] = in.nextInt();
            jum_waktu[i] = in.nextInt();
            
            a[i].setNama_Mahasiswa(nama_mahasiswa[i]);
            a[i].setNim(nim[i]);
            a[i].setJumlahPutaran(jumlahPutaran[i]);
            a[i].setJum_Waktu(jum_waktu[i]);
        }
        System.out.println();
        for (int i=0; i<jum_mhs; i++) {
            a[i].show();
        }
        System.out.println();
        System.out.println("---OUTPUT---");
        for (int i=0; i<jum_mhs; i++) {
            a[i].Tampil(b,i);
            System.out.println();
        }
        System.out.println();
        
    }
}
