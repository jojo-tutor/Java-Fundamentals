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
public class Employee {

    private String name;
    private double salary;

    /**
     * Creates a new Employee with default constructor.
     */
    public Employee() {
        this.name = "";
        this.salary = 0.0f;
    }

    /**
     * Creates a new Employee with parameters.
     *
     * @param name of the employee (String). Ex: "John"
     * @param salary of the employee (double). Ex: 1000
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Gets the name of an employee.
     *
     * @return the name of an employee (String). Ex: "John"
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the salary of an employee.
     *
     * @return the salary of an employee (double). Ex: 1000
     */
    public double getSalary() {
        return salary;
    }

}
