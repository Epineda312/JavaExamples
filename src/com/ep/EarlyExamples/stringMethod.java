package com.ep.EarlyExamples;

public class stringMethod {
        public static void main(String args[]){
            System.out.println(greet("John"));
            System.out.println(greet("Ryan"));
            System.out.println(greet("Erik"));
            System.out.println(greet("Nancy"));
        }
        //Method that returns string value
        public static String greet(String name){
            return String.format("Hello, %s, Welcome to Java", name);
        }
}
