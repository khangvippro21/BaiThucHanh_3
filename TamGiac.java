/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thuchanh3;

/**
 *
 * @author admin
 */
public class TamGiac extends Hinh{
    private double a, b, c;

    public TamGiac(double a, double b, double c) throws Exception {
        if(a + b >= c && a + c >= b && c + b >= a){
            this.a = a;
            this.b = b;
            this.c = c;
        }else
            throw new Exception("Invalid values...");
    }
    
    public double tinhChuVi(){
        return this.a + this.b + this.c;
    }
    public double tinhDienTich(){
        double p = this.tinhChuVi();
        return Math.sqrt(p *(p - a)*(p - b)*(p - c));     
    }
    public String layTenHinh(){
        return "Hinh tam giac";
    }
    public void hienThi(){
        System.out.printf(this.layTenHinh()+"\nChu vi: %.1f\nDien tich: %.1f", this.tinhChuVi(), this.tinhDienTich());
    }
    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) {
        this.c = c;
    }
    
}
