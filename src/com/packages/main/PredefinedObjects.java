/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packages.main;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jojo
 */
public class PredefinedObjects {

    Scanner input = new Scanner(System.in);

    public PredefinedObjects() {
    }

    public void randomMethod() {
        //gets 3 random numbers
        System.out.print("Enter bound number: ");
        int boundNumber = input.nextInt();
        Random generator = new Random();
        int i = generator.nextInt(boundNumber);
        System.out.println(i);
        i = generator.nextInt(boundNumber);
        System.out.println(i);
        i = generator.nextInt(boundNumber);
        System.out.println(i);
    }

    public void stringBuilderMethod() {
        //reverses a text
        System.out.print("Enter text: ");
        String text = input.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        String reverseText = sb.reverse().toString();
        System.out.println(reverseText);
    }

    public void mathMethod() {
        //calculates the circumference and area of a circle
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.printf("Circumference = %f | Area = %f\n",circumference,area);
    }
}
