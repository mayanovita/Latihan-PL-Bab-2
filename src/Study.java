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
    
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setNama_Mahasiswa(String nama_mahasiswa){
        this.nama_mahasiswa = nama_mahasiswa;
    }
    public void setJumlahPutaran(int jumlahPutaran){
        this.jumlahPutaran = jumlahPutaran;
    }
    public void setJum_Waktu(int jum_waktu){
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
    int hitungSatu(Lap v, int c){
        return hitungJarak(v,c)/jum_waktu;
    }
}
