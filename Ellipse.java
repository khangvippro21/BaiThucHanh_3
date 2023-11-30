package com.mycompany.thuchanh3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Ellipse extends Hinh{
    private double bkTrucLon;
    private double bkTrucBe;

    public Ellipse(double bkTrucLon, double bkTrucBe) {
        this.bkTrucLon = bkTrucLon;
        this.bkTrucBe = bkTrucBe;
    }
    public double tinhDienTich(){
        return this.bkTrucBe * this.bkTrucLon * Math.PI;
    }
    public double tinhChuVi(){
        return 2* Math.PI * Math.sqrt((Math.pow(bkTrucBe, 2) + Math.pow(bkTrucLon, 2))/2);
    }
    public void hienThi(){
        System.out.printf(this.layTenHinh() + "\nDien tich: %.1f \nChu vi: %.1f", this.tinhDienTich(), this.tinhChuVi());
    }
    public String layTenHinh(){
        return "Ellipse";
    }
    /**
     * @return the bkTrucLon
     */
    public double getBkTrucLon() {
        return bkTrucLon;
    }

    /**
     * @param bkTrucLon the bkTrucLon to set
     */
    public void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
    }

    /**
     * @return the bkTrucBe
     */
    public double getBkTrucBe() {
        return bkTrucBe;
    }

    /**
     * @param bkTrucBe the bkTrucBe to set
     */
    public void setBkTrucBe(double bkTrucBe) {
        this.bkTrucBe = bkTrucBe;
    }
    
    
}
