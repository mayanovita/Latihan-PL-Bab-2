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

        Study a []= new Study[jum_mhs];
        String nim[]= new String[jum_mhs];
        String nama_mahasiswa[] = new String [jum_mhs];
        int jumlahPutaran[] = new int[jum_mhs];
        int jum_waktu[] = new int[jum_mhs];
            
        for (int i=0; i<jum_mhs; i++) {
            String w = in.next();
            String x = in.next();
            String y = in.next();
            String z = in.next();
            
            String Coba = w+","+x+","+y+","+z;
            String[] Contoh = Coba.split(",");
            int satu = Integer.parseInt(Contoh[4]);
            int dua = Integer.parseInt(Contoh[6]);
            
            nim[i] = Contoh[0];
            nama_mahasiswa[i] = Contoh[2];
            jumlahPutaran[i] = satu;
            jum_waktu[i] = dua;
            
            a[i] = new Study(nim[i], nama_mahasiswa[i], jumlahPutaran[i], jum_waktu[i]);
        }

        System.out.println();
        System.out.println("---OUTPUT---");
        for (int i=0; i<jum_mhs; i++) {
            a[i].Tampil(b);
            System.out.println();
        }
        System.out.println();
        int hasil[] = new int[jum_mhs];
        int max;
        for(int i=0;i<jum_mhs;i++){
            hasil[i]=a[i].getMenang();
            }
        
            if (a[0].getMenang() > a[1].getMenang()){ 
                    max = hasil[0];
                    System.out.print(a[0].getNama());
            } else if (a[1].getMenang()>a[2].getMenang()){
                    max = hasil[1];
                    System.out.print(a[1].getNama());
            } else 
                    max = hasil[2];
                    System.out.print(a[2].getNama());
        
            System.out.println();
    }
}
