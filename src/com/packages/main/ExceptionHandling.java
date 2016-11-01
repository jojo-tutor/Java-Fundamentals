/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packages.main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jojo
 */
public class ExceptionHandling {

    public ExceptionHandling() {
        boolean isNumber = false;
        while (!isNumber) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter any number: ");
            try {
                int userInput = input.nextInt();
                isNumber = true;
            } catch (InputMismatchException e) {
                //exception handling
            }
        }
        System.out.println("Finally!!! You know what a number is!");
    }

}
