/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author Sahab
 */
public class MobilNegara implements interfaceSirine {

    @Override
    public void nyalakanSirine() {
        System.out.println("Nyalakan sirine");
    }

    @Override
    public void matikanSirine() {
        System.out.println("Matikan sirine");
    }

    @Override
    public void gantiSuaraSirine(int jenis) {
        System.out.println("Ganti suara sirine");
    }
    
}
