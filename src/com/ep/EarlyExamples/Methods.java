package com.ep.EarlyExamples;

public class Methods {
    public static void main(String args[]){
        //Call Greet Method
        greet("John");
        greet("Kevin");

        //Greet Method but Uses String Method
        System.out.println(Greet("Mike"));
        System.out.println(Greet("Ryan"));

        //Call Double Method
        int number1 = 25;
        int number2 = 245;
        int number3 = 20;
        int number4 = 100;
        //Variable that stores the addition of two integer numbers
        double sum = Double(number1, number2);
        System.out.println("Sum is: "+ sum);
        double sum2 = Double(number3, number4);
        System.out.println("Sum is: "+ sum2);

        //Calls findAge Method
        System.out.println("Your age is: " + findAge(1992));
        System.out.println("Your age is: " + findAge(1980));

        //Calls isEven Method
        boolean num1 = isEven(7);
        System.out.println(num1);
        boolean num2 = isEven(10);
        System.out.println(num2);
    }
    //Method that adds 2 given integers
    public static double add(int num1, int num2){
        double total = num1 + num2;
        return total;
    }
    //Method that greets any name (String) entered. Return type is Void.
    public static void greet(String name){
        System.out.println("Hello, " + name);
    }
    //Method that greets any name (String) entered. Returns String.
    public static String Greet(String name){
        return "Hello, " + name + ". Welcome to Java Class.";
    }
    //Method that adds 2 given Double values.
    public static double Double(int num1, int num2){
        double total = num1 + num2;
        return total;
    }
    //Method that finds age given a birth year
    public static int findAge(int year){
        int age = 2019 - year;
        return age;
    }
    //Method that returns true if number is even or returns false
    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }
}


