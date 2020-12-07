/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan5;

/**
 *
 * @author Ferina
 */
public class PersegiPanjang implements MenghitungBidang{
    private double panjang;
    private double lebar;

    @Override
    public double luasdatar() {
        return panjang*lebar;
    }
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public PersegiPanjang() {
        panjang = 0;
        lebar = 0;
    }
    
    @Override
    public double kelilingdatar() {
        return 2*(panjang+lebar);
    }
    
    public double getPanjang(){
        return panjang;
    }
    
    public double getLebar(){
        return lebar;
    }
    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
}
