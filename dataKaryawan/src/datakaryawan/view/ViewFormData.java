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
        setSize(500,400);
        setVisible(true);

        this.judul = judul;
        
        ljudul.setText(this.judul);
        ljudul.setFont(new Font("Arial",Font.BOLD,20));
        
        this.setLayout(null);

        fnama.setBounds(100, 60, 200, 25);
        fdivisi.setBounds(100, 90, 200, 25);
        fgaji.setBounds(100, 120, 200, 25);
        fusia.setBounds(100, 150, 200, 25);
    
       
        lnama.setBounds(30, 60, 50, 20);
        ldivisi.setBounds(30, 90, 50, 20);
        lgaji.setBounds(30, 120, 50, 20);
        lusia.setBounds(30, 150, 50, 20);
        ljudul.setBounds(10, 10, 250, 20);
        
      
        buttonSubmit.setBounds(30, 200, 80, 25);
        buttonReset.setBounds(115, 200, 80, 25);
        buttonBack.setBounds(200, 200, 80, 25);    

        this.add(fnama);
        this.add(fdivisi);
        this.add(fgaji);
        this.add(fusia);
        this.add(lnama);
        this.add(ldivisi);
        this.add(lgaji);
        this.add(lusia);
        this.add(ljudul);
        this.add(buttonSubmit);
        this.add(buttonReset);
        this.add(buttonBack);
        buttonSubmit.addActionListener(this);
        buttonReset.addActionListener(this);
        buttonBack.addActionListener(this);
        
        buttonReset.setBackground(Color.red);
        buttonSubmit.setBackground(Color.green);
        buttonReset.setForeground(Color.white);
        buttonSubmit.setForeground(Color.white);
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
