/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawan.view;

/**
 *
 * @author User
 */

import datakaryawan.controller.karyawan.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ViewFormData extends JFrame implements ActionListener {
KaryawanController Karyawan = new KaryawanController();
    
protected String judul;
 
private JTextField fnama = new JTextField();
private JTextField fdivisi = new JTextField();
private JTextField fgaji = new JTextField();
private JTextField fusia = new JTextField();

JLabel lnama    = new JLabel("Nama:");
JLabel ldivisi  = new JLabel("Divisi:");
JLabel lgaji    = new JLabel("Gaji:");
JLabel lusia    = new JLabel("Usia:");
JLabel ljudul   = new JLabel("");

JButton buttonSubmit    = new JButton("Submit");
JButton buttonReset     = new JButton("Reset");
JButton buttonBack      = new JButton("Back");

    
    public ViewFormData(String judul) {
        
        setTitle("Form Data Karyawan");
        setSize(300,300);
        setVisible(true);
        
        this.judul = judul;
        
        ljudul.setText(this.judul);
        
        this.setLayout(null);
        this.add(fnama);
        this.add(fdivisi);
        this.add(fgaji);
        this.add(fusia);
        fnama.setBounds(70, 60, 130, 20);
        fdivisi.setBounds(70, 90, 130, 20);
        fgaji.setBounds(70, 120, 130, 20);
        fusia.setBounds(70, 150, 130, 20);
        
        
        this.add(lnama);
        this.add(ldivisi);
        this.add(lgaji);
        this.add(lusia);
        this.add(ljudul);
        lnama.setBounds(10, 60, 50, 20);
        lnama.setBounds(10, 90, 50, 20);
        lgaji.setBounds(10, 120, 50, 20);
        lusia.setBounds(10, 150, 50, 20);
        ljudul.setBounds(10, 10, 250, 20);
        
        this.add(buttonSubmit);
        this.add(buttonReset);
        this.add(buttonBack);
        buttonSubmit.setBounds(40, 160, 80, 25);
        buttonReset.setBounds(125, 160, 80, 25);
        buttonBack.setBounds(5, 200, 200, 20);      

        buttonSubmit.addActionListener(this);
        buttonReset.addActionListener(this);
        buttonBack.addActionListener(this);
        
        buttonReset.setBackground(Color.RED);
        buttonSubmit.setBackground(Color.BLUE);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public JTextField getFnama() {
        return fnama;
    }

    public JTextField getFdivisi() {
        return fdivisi;
    }

    public JTextField getFgaji() {
        return fgaji;
    }

    public JTextField getFusia() {
        return fusia;
    }

    @Override
    public void actionPerformed(ActionEvent e){
       
    }
}
