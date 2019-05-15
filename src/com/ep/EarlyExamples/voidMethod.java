package com.ep.EarlyExamples;

public class voidMethod {
    public static void main(String args[]){
        greet("John");
        greet("Kevin");
        greet("Ryan");
        greet("Vince");
    }
    //Method that returns empty value
    public static void greet(String name){
        System.out.println(String.format("Hello, %s", name));
    }
}
