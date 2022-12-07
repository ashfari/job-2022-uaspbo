/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author Sahab
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari : ");
        float r = scanner.nextFloat();
        
        float phi = 3.14f;
        float luas = phi * (r * r);
        float keliling = 2 * phi * r;
        
        System.out.println("Luas lingkaran = " + luas);
        System.out.println("Keliling lingkaran = " + keliling);
    }
}