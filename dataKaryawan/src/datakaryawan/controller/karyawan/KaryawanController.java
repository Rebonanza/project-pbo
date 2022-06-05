package datakaryawan.controller.karyawan;

import javax.swing.*;
import java.awt.HeadlessException;
import datakaryawan.model.*;
import datakaryawan.view.*;
import datakaryawan.model.DtKaryawan;

public  class KaryawanController {
    /* 
        fungsi Index Data Karyawan
    */
    public void viewPerhitunganGaji(ViewListData list, DtKaryawan karyawan){
        list.toBack();
        ViewHitungGaji baru = new ViewHitungGaji(karyawan);
        baru.toFront(); 
    }
    public void back(ViewListData list){
        list.toBack();
        list.setVisible(false);
    }
    public void input(ViewListData list){
        list.toBack();
        ViewInputData input = new ViewInputData();
        input.toFront();
    }
    /* 
        fungsi Create Data Karyawan
    */
    public void viewMenu(ViewFormData form){
        form.toBack();
        form.setVisible(false);
    }
    public void resetForm(ViewFormData form){
        form.getFnama().setText("");
        form.getFgaji().setText("");
        form.getFusia().setText("");
    }


    /* 
        fungsi Add Data Karyawan
    */
    public void addData(ViewInputData input){
        try{
            String nama = input.getFnama().getText();
            String divisi = input.getFdivisi().getText();
            int usia = Integer.parseInt(input.getFusia().getText());
            double gaji = Double.parseDouble(input.getFgaji().getText());
            if( usia<=0 || gaji<0){
                throw new ArithmeticException("Bilangan Tidak Positif");  
            }           
            DtKaryawan baru = new DtKaryawan(0,nama,divisi,gaji,usia);
            ModelDataKaryawan mdk = new ModelDataKaryawan();
            String msg = mdk.create(baru);
            JOptionPane.showMessageDialog(input,msg);
        }catch(HeadlessException | ArithmeticException | NumberFormatException e){
            System.out.print(e.getMessage());
            if ("Bilangan Tidak Positif".equals(e.getMessage())) {
                JOptionPane.showMessageDialog(input,e.getMessage());
            }else{
                JOptionPane.showMessageDialog(input,"Usia dan Gaji Harus Angka");
            }
        }
    }  

     /* 
        fungsi Edit Data Karyawan
    */
    public void edit(ViewHitungGaji gaji, DtKaryawan karyawan) {
        gaji.toBack();
        ViewEditData baru = new ViewEditData(karyawan);
        baru.toFront();
    }

     /* 
        fungsi Update Data Karyawan
    */
    public void updateKaryawan(ViewEditData input, int id){
        try{
            String nama = input.getFnama().getText();
            String divisi = input.getFdivisi().getText();
            int usia = Integer.parseInt(input.getFusia().getText());
            double gaji = Double.parseDouble(input.getFgaji().getText());
            if(usia <= 0 || gaji < 0){
                throw new ArithmeticException("Bilangan Tidak Positif");  
            }
            DtKaryawan baru = new DtKaryawan(id,nama,divisi,gaji,usia);
            ModelDataKaryawan mdk = new ModelDataKaryawan();
            String msg = mdk.update(baru);
            JOptionPane.showMessageDialog(input,msg);
        }catch(Exception e){
            System.out.print(e.getMessage());
            if ("Bilangan tidak Positif".equals(e.getMessage())) {
                JOptionPane.showMessageDialog(input,e.getMessage());
            }else{
                JOptionPane.showMessageDialog(input,"Usia dan Gaji Harus Angka");
            }
        }
    }

    /* 
        fungsi Delete Data Karyawan
    */
    public void delete(ViewHitungGaji gaji, int id) {
        int input = JOptionPane.showConfirmDialog(gaji,
                "Yakin ingin menghapus?", "Hapus data",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        System.out.println(input);
        if (input == 0) {
            ModelDataKaryawan mdk = new ModelDataKaryawan();
            String msg = mdk.delete(id);
            JOptionPane.showMessageDialog(gaji,msg);
            gaji.toBack();
        }
    }
}
