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
public class DataTypes {

    public DataTypes() {
        Scanner input = new Scanner(System.in);

        String name, heShe;
        int age;
        double weight;
        boolean isMale;

        System.out.print("Enter student's name: ");
        name = input.nextLine();
        System.out.print("Enter student's age: ");
        age = input.nextInt();
        System.out.print("Enter student's weight (kg): ");
        weight = input.nextDouble();
        System.out.print("Is the student Male? (true/false): ");
        isMale = input.nextBoolean();

        heShe = isMale ? "His" : "Her";

        System.out.printf("%s is %d years old. %s weight is %1.2f.\n",
                name, age, heShe, weight);
    }

}
