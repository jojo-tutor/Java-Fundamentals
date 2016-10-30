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
public class HelloWorld {

    public HelloWorld() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String yourName = input.nextLine();
        System.out.printf("Hello, %s\n",yourName);
    }

}
