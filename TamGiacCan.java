/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thuchanh3;

/**
 *
 * @author admin
 */
public class TamGiacCan extends TamGiac{
    public TamGiacCan(double ab, double c) throws Exception{
        super(ab, ab, c);
    }

    @Override
    public String layTenHinh() {
        return "\nTam Giac Can";
    }
    
}
