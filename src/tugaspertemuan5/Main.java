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

import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        GUI g  = new GUI();
    }
}

class GUI extends JFrame implements ActionListener{      
      double panjang;
      double lebar;
      double tinggi;
    
    JLabel judul                = new JLabel("Kalkulator Balok ");
    
    JLabel lpanjang             = new JLabel("Panjang");
    JTextField fpanjang         = new JTextField(10);
      
    JLabel llebar               = new JLabel("Lebar");
    JTextField flebar           = new JTextField(10);
   
    JLabel ltinggi              = new JLabel("Tinggi");
    JTextField ftinggi          = new JTextField(10);
    
    JLabel lHasil               = new JLabel("Hasil : ");
    JLabel lluasdatar           = new JLabel("Luas Persegi");
    JLabel lkelilingdatar       = new JLabel("Keliling Persegi");
    JLabel lvolumeruang         = new JLabel("Volume Balok");
    JLabel lluasruang           = new JLabel("Luas Permukaan Balok");
            
    JButton btnHitung           = new JButton("Hitung");
    JButton btnReset            = new JButton("Reset");
    
    Balok balok;
    PersegiPanjang persegipanjang;
    
    
    public GUI(){
        setTitle("KALKULATOR BALOK");
        setDefaultCloseOperation(3);
        setSize(400,400);
        
        setLayout(null);
        add(judul);
        add(lpanjang);
        add(fpanjang);
        add(llebar);
        add(flebar);
        add(ltinggi);
        add(ftinggi);
        add(lHasil);
        add(lluasdatar);
        add(lkelilingdatar);
        add(lvolumeruang);
        add(lluasruang);
        add(btnHitung);
        add(btnReset);
        
        // setBounds(m,n,o,p)
	// m = posisi x; n = posisi n
	// o = panjang komponen; p = tinggi komponen
        judul.setBounds(150, 10, 120, 20);
        lpanjang.setBounds(30, 40, 120, 20);
        fpanjang.setBounds(130, 40, 200, 20);
        llebar.setBounds(30, 70, 120, 20);
        flebar.setBounds(130, 70, 200, 20);
        ltinggi.setBounds(30, 100, 120, 20);
        ftinggi.setBounds(130, 100, 200, 20);
        lHasil.setBounds(175, 140, 120, 20);
        lluasdatar.setBounds(30, 170, 180, 20);
        lkelilingdatar.setBounds(30, 200, 180, 20);
        lvolumeruang.setBounds(30, 230, 180, 20);
        lluasruang.setBounds(30, 260, 180, 20);
        btnHitung.setBounds(70, 310, 120, 20);
        btnReset.setBounds(200, 310, 120, 20);
        
        setVisible(true);
        
        btnHitung.addActionListener(this);
        btnReset.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnHitung){
            if(("".equals(fpanjang.getText())) || ("".equals(flebar.getText())) || ("".equals(ftinggi.getText()))){
                JOptionPane.showMessageDialog(this, "Mohon Isikan Kolom Yang Tertera!");
                return;
                
            }
            try{
                panjang = Double.parseDouble(fpanjang.getText());
                lebar = Double.parseDouble(flebar.getText());
                tinggi = Double.parseDouble(flebar.getText());
                
                balok = new Balok(panjang, lebar, tinggi);
                persegipanjang = new PersegiPanjang(panjang, lebar);
                
            }catch(NumberFormatException ee){
                JOptionPane.showMessageDialog(this,"Anda Tidak Boleh Menginput Huruf!");
                return;
                
            }finally{
                lluasdatar.setText("Luas Persegi\t\t\t: " + persegipanjang.luasdatar());
                lkelilingdatar.setText("Keliling Persegi\t\t: " + persegipanjang.kelilingdatar());
                lvolumeruang.setText("Volume Balok\t\t\t: " + balok.volumeruang());
                lluasruang.setText("Luas Permukaan Balok\t: " + balok.luasruang());
                
            }
        }
        if(e.getSource() == btnReset){
            fpanjang.setText("");
            ftinggi.setText("");
            flebar.setText("");
            lluasdatar.setText("Luas Persegi");
            lkelilingdatar.setText("Keliling Persegi");
            lvolumeruang.setText("Volume Balok");
            lluasruang.setText("Luas Permukaan Balok");
        }  
    }
}