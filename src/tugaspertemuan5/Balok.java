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
public class Balok extends PersegiPanjang implements MenghitungRuang {
    private double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public Balok() {
        super();
        tinggi = 0;
    }

    @Override
    public double volumeruang(){
        return super.luasdatar()*tinggi;
    }

    @Override
    public double luasruang(){
        return 2*super.getLebar()*tinggi + 2*super.getPanjang()*tinggi + 2*super.luasdatar();
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
