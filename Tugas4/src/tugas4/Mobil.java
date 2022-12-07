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
public class Mobil implements interfaceMobil {
    private boolean mesin = false;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Nyalakan mesin");
    }

    @Override
    public void matikanMesin() {
        System.out.println("Matikan mesin");
    }

    @Override
    public void tambahkanGerigi() {
        System.out.println("Tambahkan gerigi");
    }

    @Override
    public void turunkanGerigi() {
        System.out.println("Turunkan gerigi");
    }

    @Override
    public void tekanGas() {
        System.out.println("Tekan gas");
    }

    @Override
    public void tekanRem() {
        System.out.println("Tekan rem");
    }
    
}
