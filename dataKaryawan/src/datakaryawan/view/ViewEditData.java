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

import java.awt.event.ActionEvent;
import datakaryawan.model.DtKaryawan;


public class ViewEditData extends ViewFormData{
    DtKaryawan edit;
    public ViewEditData(DtKaryawan karyawan) {
        super("Update Karyawan");
        this.edit = karyawan;
        super.getFnama().setText(karyawan.getNama());
        super.getFdivisi().setText(karyawan.getDivisi());
        super.getFusia().setText(String.valueOf(karyawan.getUsia()));
        super.getFgaji().setText(String.format("%,.2f", karyawan.getGaji()));
        
        setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
         if (e.getSource() == super.buttonSubmit){
            Karyawan.updateKaryawan(this, edit.getId());
        }
         if (e.getSource() == super.buttonBack){
            Karyawan.viewMenu(this);
        }
         if (e.getSource() == super.buttonReset){
            Karyawan.resetForm(this);
        }
    }
}
