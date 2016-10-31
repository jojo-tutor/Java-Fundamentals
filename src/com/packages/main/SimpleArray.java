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
public class SimpleArray {

    public SimpleArray() {
        int grades[] = new int[4];
        grades[0] = 76;
        grades[1] = 83;
        grades[2] = 99;
        grades[3] = 87;
        float sum = 0.0f;
        float average = 0.0f;
        String students[] = new String[]{"John", "Peter", "Micheal", "Gabriel"};

        System.out.printf("#\tStudents\tGrades\n");
        System.out.printf("-\t--------\t------\n");

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%d\t%s\t\t  %d\n", i + 1, students[i], grades[i]);
            sum = sum + grades[i];
        }
        average = sum / grades.length;
        System.out.printf("\n***Class Average: %1.2f\n\n", average);
    }

}
