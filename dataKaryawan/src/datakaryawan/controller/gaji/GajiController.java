package datakaryawan.controller.gaji;

import datakaryawan.view.*;
import datakaryawan.model.*;

public class GajiController {
    public void back(ViewHitungGaji gaji){
        gaji.toBack();
        gaji.setVisible(false);
        
    }
     public void viewHasil(ViewHitungGaji gaji, DtKaryawan karyawan, int total) {
        gaji.toBack();
        ViewHasil baru = new ViewHasil(karyawan, total);
        baru.toFront();
    }
    public void back(ViewHasil hasil){
        hasil.toBack();
        hasil.setVisible(false);
    }
}
