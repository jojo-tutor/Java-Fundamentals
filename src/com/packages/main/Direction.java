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
public enum Direction {
    North(0), South(180), East(90),West(270),
    NorthEast(45), SouthEast(135), SouthWest(225), NorthWest(315);
    
    private final int degrees;
    
    Direction(){
        degrees = 0;
    }
    
    Direction(int degrees){
        this.degrees = degrees;
    }
    
    public int getDegrees(){
        return this.degrees;
    }
}
