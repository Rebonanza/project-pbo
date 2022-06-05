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

import datakaryawan.controller.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ViewMenu extends JFrame implements ActionListener {
    ControllerMenu controllerMenuData = new ControllerMenu();
    JLabel ljudul = new JLabel("Menu Utama");
    
    JButton btambah = new JButton("Tambah Karyawan");
    JButton blihat = new JButton("Lihat Karyawan");

    public ViewMenu(){
        setTitle("Menu");
        setSize(400,250);
        setVisible(true);
        this.setLayout(null);
        setLocationRelativeTo(null);
        
        this.add(ljudul);
        this.add(btambah);
        this.add(blihat);
        ljudul.setBounds(140,20, 250, 40);
        btambah.setBounds(40, 70, 150, 30);
        blihat.setBounds(200, 70, 150, 30);
        
        ljudul.setFont(new Font("Arial",Font.BOLD,21));
        btambah.addActionListener(this);
        blihat.addActionListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == blihat){
            controllerMenuData.viewLihatData(this);
        }
        if (e.getSource() == btambah){
            controllerMenuData.viewTambahData(this);
        }
    }
    
}
