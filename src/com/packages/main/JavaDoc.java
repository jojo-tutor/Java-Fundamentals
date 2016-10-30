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
public class JavaDoc {

    public JavaDoc() {
    }
    
    /**
     * Prints 'Hi' literally
     * 
     */
    public void sayHi(){
        System.out.println("Hi");
    }
    
    /**
     * Prints 'Hello' literally
     */
    public void sayHello(){
        System.out.println("Hello");
    }
    
    /**
     * Prints 'something'
     * @param something this is the word you want to say
     */
    public void saySomething(String something){
        System.out.println(something);
    }
    
    /**
     * Gets a reply
     * @return the reply as String
     */
    public String getReply(){
        return "i don't know what to say..";
    }
}
