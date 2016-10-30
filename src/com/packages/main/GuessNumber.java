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
public class GuessNumber {
    public GuessNumber(){
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int theNumber = generator.nextInt(10);
        System.out.println("I'm thinking of a number between 1 to 10, what is it???");
        int guess=-1;
        int guessCtr=1;
        while(guess!=theNumber){
            System.out.printf("Attempt %d: Your Guess ==> ",guessCtr);
            guess = input.nextInt();
            guessCtr++;
        }
        System.out.printf("Finally!!! You guessed the number. It was %d.\n",theNumber);
    }
}
