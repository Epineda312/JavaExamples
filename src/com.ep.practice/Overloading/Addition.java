package com.ep.practice.Overloading;

public class Addition {
    //Addition of two integers
    public int add(int x, int y){
        return x + y;
    }

    //Addition of three integers
    public int add(int x, int y, int z){
        return x + y + z;
    }

    //Addition of two double datatypes
    public double add(double x, double y){
        return x + y;
    }

    //Main Method
    public static void main(String args[]){
        Addition a = new Addition();
        System.out.println(a.add(24,24));//Addition of two integers
        System.out.println(a.add(24,24,24));//Addition of three integers
        System.out.println(a.add(12.24, 12.24));//Addition of double values
    }
}
