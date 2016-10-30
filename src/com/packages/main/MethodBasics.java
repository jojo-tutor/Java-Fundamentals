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
public class MethodBasics {

    public MethodBasics() {
        System.out.println("Area = " + rectangleArea(3, 4));
        System.out.println("Perimeter = " + rectanglePerimeter(3, 4));
    }

    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static double rectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }
}
