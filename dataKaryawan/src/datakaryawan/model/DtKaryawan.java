/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawan.model;

/**
 *
 * @author User
 */
public class DtKaryawan {
    private int id;
    private int usia;
    private double gaji;
    private String nama;
    private String divisi;
    
    public DtKaryawan(int id, String nama,String divisi, double gaji,int usia ) {
        this.id = id;
        this.nama = nama;
        this.divisi = divisi;
        this.gaji = gaji;
        this.usia = usia;

    }
    
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getDivisi(){
        return divisi;
    }

    public int getUsia() {
        return usia;
    }

    public double getGaji() {
        return gaji;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDivisi(String Divisi){
        this.divisi = Divisi;
    }
    
    public void setUsia(int usia) {
        this.usia = usia;
    }
    
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
}
