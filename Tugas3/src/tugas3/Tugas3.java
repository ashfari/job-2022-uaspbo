/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author Sahab
 */
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan berapa derete Fibonacci? ");
        int count = scanner.nextInt();
        
        int n1 = 1, n2 = 1, n3 , i;
        System.out.print(count + " deret Fibonaccci = ");
        if (count < 2) {
            if (count > 0) {
                System.out.print("1");
            }
            System.out.println("");
            System.exit(0);
        }
        System.out.print(n1 + " " + n2); // mencetak 2 angka 1

        for(i = 2; i < count; ++i) { // perulangan dimulai dari 2
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println("");
    }
}
