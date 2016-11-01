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
public class FindAndSort {

    private Scanner input = new Scanner(System.in);
    private Random rand = new Random();
    private int numbers[] = new int[10];

    public FindAndSort() {
        System.out.println("The generated random numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1;
            System.out.print(numbers[i] + "\t");
        }
        System.out.println("");
    }

    public void find() {
        System.out.print("\nEnter number to find [1-100]: ");
        int targetNumber = input.nextInt();
        boolean isFound = false;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (targetNumber == numbers[i]) {
                isFound = true;
                index = i;
                break;
            }
        }
        if (isFound) {
            System.out.printf("Search Result ==> Number %d is found! Location is in ArrayIndex: %d\n", targetNumber, index);
        } else {
            System.out.printf("Search Result ==> Number %d is not in the array!\n", targetNumber);
        }
    }

    public void sortAscending() {
        int temp = 0;
        for (int a = 0; a < numbers.length-1; a++) {
            for(int b=a+1;b<numbers.length;b++){
                if(numbers[b]<numbers[a]){
                    temp = numbers[b];
                    numbers[b] = numbers[a];
                    numbers[a] = temp;
                }
            }
        }
    }
    
    public void sortDescending() {
        int temp = 0;
        for (int a = 0; a < numbers.length-1; a++) {
            for(int b=a+1;b<numbers.length;b++){
                if(numbers[b]>numbers[a]){
                    temp = numbers[b];
                    numbers[b] = numbers[a];
                    numbers[a] = temp;
                }
            }
        }
    }

    public void displayNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+"\t");
        }
    }

}
