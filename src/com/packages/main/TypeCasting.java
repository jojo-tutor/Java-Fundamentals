/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packages.main;

/**
 *
 * @author Jojo
 */
public class TypeCasting {

    public TypeCasting() {
        String a = "1";
        String b = "2";
        int a_plus_b = Integer.parseInt(a) + Integer.parseInt(b);
        int x = 20;
        int y = 15;
        int i = x / y;
        double d1 = x / y;
        double d2 = x / (1.0 * y);
        double d3 = (double) x / y;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a + b);
        System.out.println(a_plus_b);
        System.out.println("");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("i = " + i);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
    }

}
