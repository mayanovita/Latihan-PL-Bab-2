/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab2;

/**
 *
 * @author HP 8.1
 */
public class Study {
    private String nim;
    private String nama_mahasiswa;
    private int jumlahPutaran;
    private int jum_waktu;
    public Study(String nim, String nama_mahasiswa, int jumlahPutaran,int jum_waktu){
        this.nim = nim;
        this.nama_mahasiswa = nama_mahasiswa;
        this.jumlahPutaran = jumlahPutaran;
        this.jum_waktu = jum_waktu;
    }
    public void show(){
        System.out.println(nim+", "+nama_mahasiswa+", "+jumlahPutaran+", "+jum_waktu);
    }
    int hitungJarak(Lap x, int a){
        return x.hitungKeliling()*jumlahPutaran;
    }
    void Tampil(Lap y, int b){
        System.out.print(nama_mahasiswa+" "+hitungJarak(y,b));
    }
}
