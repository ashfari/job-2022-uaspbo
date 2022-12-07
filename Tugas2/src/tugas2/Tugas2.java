/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author Sahab
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan suhu celcius : ");
        float celcius = scanner.nextFloat();
        
        float fahrenheit = (float) (celcius * 9 / 5) + 32;
        
        System.out.println(celcius + " Celcius = " + fahrenheit + " Fahrenheit");
    }
}