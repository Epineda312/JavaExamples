package com.ep.practice.AccessModiferTestPackage;

public class Person {
    protected void greet(String name){
        System.out.println(String.format("Hello, %s", name));
    }
}
