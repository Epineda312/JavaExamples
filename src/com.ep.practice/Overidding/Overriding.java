package com.ep.practice.Overidding;

public class Overriding {
    public static void main(String args[]){
        Animal animal1 = new Animal(); //Animal reference with new object
        Animal animal2 = new Dog(); //Animal reference but with dog object
        Dog animal3 = new Dog();

        animal1.talk(); //runs method talk from animal class
        animal2.talk(); //runs method talk from Dog class
        animal3.talk();
    }
}
