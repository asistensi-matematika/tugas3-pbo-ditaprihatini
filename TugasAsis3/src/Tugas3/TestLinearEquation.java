/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class TestLinearEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dita = new Scanner(System.in);
        LinearEquation dita2 = new LinearEquation();
        System.out.print("Input \t: ");
        double a = dita.nextDouble();
        dita2.setA(a);
        double b = dita.nextDouble();
        dita2.setB(b);
        double c = dita.nextDouble();
        dita2.setC(c);
        double d = dita.nextDouble();
        dita2.setD(d);
        double e = dita.nextDouble();
        dita2.setE(e);
        double f = dita.nextDouble();
        dita2.setF(f);
        System.out.println("\nOutput \t: \nSistem Persamaannya : ");
        System.out.println(a+"x + "+b+"y = "+e+"\n"+c+"x + "+d+"y = "+f);
        System.out.println("\nHasilnya : ");
        dita2.cekSolusi();
    }
    
}
