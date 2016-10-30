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
public class YourGrade {

    public YourGrade() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        int grade = input.nextInt();
        
        if(grade>=0 && grade <=100){
            if(grade<70){
                System.out.println("You're not a bright student!");
            }else{
                System.out.printf("%d is a nice grade!\n",grade);
            }
        }else{
            System.out.printf("The grade %d is invalid.\n",grade);
        }
    }
    
}
