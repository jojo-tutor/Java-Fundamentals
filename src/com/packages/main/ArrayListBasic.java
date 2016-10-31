/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packages.main;

import java.util.ArrayList;

/**
 *
 * @author Jojo
 */
public class ArrayListBasic {

    public ArrayListBasic() {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Paul");
        employees.add("Marry");
        employees.add("Cedric");
        employees.add("Rizal");
        employees.add("Jojo");
        
        ArrayList<Double> salary = new ArrayList<>();
        salary.add(8500.0);
        salary.add(10050.0);
        salary.add(12100.0);
        salary.add(7500.0);
        salary.add(32000.0);
        //salary.add();
        //salary.add("Rizal");
        //salary.add("Jojo");
        
        System.out.printf("#\tEmployees\tSalary\n");
        System.out.printf("-\t--------\t------\n");
        for(int i=0;i<salary.size();i++){
            System.out.printf("%d\t%s\t\t%1.2f\n",i+1,employees.get(i),salary.get(i));
        }
        System.out.println("");
    }
    
}
