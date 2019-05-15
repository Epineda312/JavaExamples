package com.ep.EarlyExamples;

public class staticMethod {
    public static void main(String args[]){
        //Call Static com.ep.EarlyExamples.Methods
        name_of_dog("Max");
        bark(); //call bark method
        //sleep();
    }

    //Static method to get name of dog
    public static void name_of_dog(String name){
        System.out.println("My name is: "+ name);
    }

    //Static method that calls bark method
    public static void bark(){
        System.out.println("I am barking");
    }
    /*
    //Non static Method
    public void sleep(){
        System.out.println("I am sleeping");
    }
    */

}
