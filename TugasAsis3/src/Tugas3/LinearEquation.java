/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Toshiba
 */
public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    
    public LinearEquation(){
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
    }
    
    public LinearEquation(double a, double b, double c, double d, double e, double f){
        a = this.a;
        b = this.b;
        c = this.c;
        d = this.d;
        e = this.e;
        f = this.f;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setE(double e) {
        this.e = e;
    }

    public void setF(double f) {
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    
    public double NilaiX(){
        double NilaiX, DeterminanX, DeterminanAll;
        DeterminanX = ((e*d)-(f*b));
        DeterminanAll = ((a*d)-(b*c));
        NilaiX = Math.ceil((DeterminanX/DeterminanAll)*100)/100;
        return NilaiX;
    }
    
    public double NilaiY(){
        double NilaiY, DeterminanY, DeterminanAll;
        DeterminanY = ((a*f)-(c*e));
        DeterminanAll = ((a*d)-(b*c));
        NilaiY = Math.ceil((DeterminanY/DeterminanAll)*100)/100;
        return NilaiY;
    }
    
    public boolean cekSolusi(){
        if((a*d)-(b*c) != 0){
            double x = NilaiX();
            double y = NilaiY();
            System.out.println("\nOutput \t: \nSistem Persamaannya : ");
            System.out.println(a+"x + "+b+"y = "+e+"\n"+c+"x + "+d+"y = "+f);
            System.out.println("\nHasilnya : ");
            System.out.println("x = "+x+" , y = "+y);
            return true;
        }
        else{
            System.out.println("\nOutpput \t: \nSistem Persamaannya : ");
            System.out.println(a+"x + "+b+"y = "+e+"\n"+c+"x + "+d+"y = "+f);
            System.out.println("\nHasilnya : ");
            System.out.println("Sistem tidak memiliki penyelesaian.");
            return false;
        }
    }
}
