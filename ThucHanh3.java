/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.thuchanh3;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class ThucHanh3 {

    public static void main(String[] args) throws Exception {
        Ellipse a = new Ellipse(53, 47);
        Circle b = new Circle(54);
        TamGiac c = new TamGiac(4, 5, 3);
        TamGiac d = new TamGiacCan(6, 4);
        TamGiacCan f = new TamGiacDeu(5);
        
        Hinh[] all = {a, b, c, d, f};
        // lam bt sort theo ten
        Arrays.sort(all, (h1, h2)->{
            double t1 = h1.tinhDienTich();
            double t2 = h2.tinhDienTich();
            if(t1 > t2)
                return 1;
            else if(t1 < t2)
                return -1;
            else 
                return 0;
        });
        for(var x: all)
            x.hienThi();
    }
}
