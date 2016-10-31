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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*new HelloWorld();
        new DataTypes();
        new TypeCasting();
        new PredefinedObjects().randomMethod();
        new PredefinedObjects().stringBuilderMethod();
        new PredefinedObjects().mathMethod();*/
        //new MethodBasics();
        /*Car c = new Car();
        c.setName("GTR 101");
        c.setBrand("Mazda");
        c.setColor("Red");
        c.setPrice(1200000.50);
        c.setTopSpeed(200);
        c.run();
        c.toString();*/
 /*JavaDoc jd = new JavaDoc();
        jd.sayHi();
        jd.sayHello();
        jd.saySomething("Are you available?");
        System.out.println(jd.getReply());*/
        //new YourGrade();
        //new TheMonth();
        //Direction de = Direction.West;
        //System.out.printf("%s is %d degrees.\n",de,de.getDegrees());
        //new NumberCount();
        //new MultiplicationTable();
        //new GuessNumber();
        //new SimpleArray();
        /*Student[] students = new Student[]{
            new Student("John", 76),
            new Student("Peter", 83),
            new Student("Micheal", 99),
            new Student("Gabriel", 87),
        };
        
        int sum = 0;
        float average = 0f;
        System.out.printf("#\tStudents\tGrades\n");
        System.out.printf("-\t--------\t------\n");
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%d\t%s\t\t  %d\n", i + 1, students[i].getName(), students[i].getGrade());
            sum = sum + students[i].getGrade();
        }
        average = sum / students.length;
        System.out.printf("\n***Class Average: %1.2f\n\n", average);*/
        //new ArrayListBasic();
        
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Paul",8500));
        employees.add(new Employee("Marry",10050));
        employees.add(new Employee("Cedric",12100));
        employees.add(new Employee("Rizal",7500));
        employees.add(new Employee("Jojo",32000));
        System.out.printf("#\tEmployees\tSalary\n");
        System.out.printf("-\t--------\t------\n");
        for(int i=0;i<employees.size();i++){
            System.out.printf("%d\t%s\t\t%1.2f\n",i+1,employees.get(i).getName(),employees.get(i).getSalary());
        }
        System.out.println("");
    }
}
