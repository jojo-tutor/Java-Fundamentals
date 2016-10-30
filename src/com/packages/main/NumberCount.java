/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packages.main;

import java.util.Scanner;

/**
 *
 * @author Jojo
 */
public class NumberCount {

    public NumberCount() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = input.nextInt();
        System.out.print("Enter end number: ");
        int end = input.nextInt();
        System.out.println("Counting up...");
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
