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
public class Lap {
    private int p;
    private int l;
    
    public Lap(int p, int l){
        this.p = p;
        this.l = l;
    }
    public int hitungKeliling(){
        return 2*(p+l);
    }
}
