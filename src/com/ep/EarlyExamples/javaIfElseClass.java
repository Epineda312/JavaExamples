package com.ep.EarlyExamples;

public class javaIfElseClass {
    public static void main(String args[]){
        //Weather Example
        String weather = "raining";
        if (weather.equals("raining")) {
            System.out.println("I am staying home");
        } else{
            System.out.println("I am going for a walk");
        }
        int x = 15;
        if(x < 0){
            System.out.print("Negative Number");
        } else if(x > 0){
            System.out.print("Positive Number");
        } else{
            System.out.print("Zero");
        }

    }
}
