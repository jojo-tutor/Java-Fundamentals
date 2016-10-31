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
public class Student {

    private String name;
    private int grade;

    /**
     * New Student class with no parameters. Default builds default constructor.
     */
    public Student() {
        this.name = "";
        this.grade = 0;
    }

    /**
     * @param name of the student (String). Ex: "John"
     * @param grade of the student (int). Ex: 75
     */
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    /**
     * @return the name of student (String). Ex: "John"
     */
    public String getName() {
        return name;
    }

    /**
     * @return the grade of student (int). Ex: 79
     */
    public int getGrade() {
        return grade;
    }

}
