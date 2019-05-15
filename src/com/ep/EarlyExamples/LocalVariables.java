package com.ep.EarlyExamples;

public class LocalVariables {
    public void getDogAge(){
        int age = 0; //local variable for age
        age = age + 12;
        System.out.println("Dog age is: " + age);
    }

    public static void main(String args[]){
        LocalVariables local = new LocalVariables();
        local.getDogAge();
    }
}
