package com.ep.EarlyExamples;

public class InstanceVariables {
    //Instance variables
    String name;
    int age;

    //Constructor method
    public InstanceVariables (String name){
        this.name = name;
    }

    //Set age
    public void setAge(int age){
        this.age = age;
    }
    //Method
    public void setBalance(double balance){
        double accountBalance = 20000;
    }

    //Display Info
    public void displayInfo(){
        System.out.println("Name is: "+ name);
        System.out.println("Age is: "+ age);
    }

    public static void main (String args[]){
        InstanceVariables i1 = new InstanceVariables("Dan");
        i1.setAge(31);
        i1.displayInfo();
        System.out.println(i1.age);
        System.out.println(i1.name);
    }
}
