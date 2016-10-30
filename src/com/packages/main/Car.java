/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packages.main;

import java.util.Random;

/**
 *
 * @author Jojo
 */
public class Car {

    private String name;
    private String brand;
    private String color;
    private double price;
    private int topSpeed;
    private int speedNow;

    public Car() {
        name = "";
        brand = "";
        color = "";
        price = 0f;
        topSpeed = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void run() {
        Random rand = new Random();
        speedNow = rand.nextInt(topSpeed);
    }
    
    @Override
    public String toString(){
        System.out.printf("Car Details:\n\tName: %s\n\tBrand: %s\n\tColor: %s\n\tPrice: Php %f\n\tTop Speed: %d\n\tNow running @ %d kph..\n",brand,name,color,price,topSpeed,speedNow);
        return "";
    }

}
