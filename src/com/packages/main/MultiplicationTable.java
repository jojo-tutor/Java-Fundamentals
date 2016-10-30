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
public class MultiplicationTable {

    public MultiplicationTable() {
        System.out.print("-------------------------");
        System.out.print("The Multiplication Table");
        System.out.print("-------------------------\n\n");
        for(int x=1;x<=10;x++){
            for(int y=1;y<=10;y++){
                System.out.print(x*y+"\t");
            }
            System.out.println("");
        }
        System.out.print("-------------------------");
        System.out.print("-------------------------");
        System.out.print("-------------------------\n");
    }
    
}
