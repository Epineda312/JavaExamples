package com.ep.EarlyExamples;

public class StaticVariables {
    public static String name;
    public static String address;
    static double balance;
}

class StaticVariablesMethod{
    public static void main(String args[]){
        StaticVariables.name = "Danny";
        StaticVariables.address ="3600 N Harlem Avenue, Richmond, VA 22601";
        System.out.println(StaticVariables.name);
        System.out.println(StaticVariables.address);
        StaticVariables.name = "John";
        StaticVariables.address ="3600 N California Avenue, Tysons, VA 22601";
        System.out.println(StaticVariables.name);
        System.out.println(StaticVariables.address);
        StaticVariables.balance = 2500;
        System.out.println(StaticVariables.balance);
    }
}
