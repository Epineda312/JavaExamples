package com.ep.practice;

public class IntegerMethod1 {
    public static void main(String args[]){
        Integer a = 100;
        Integer b = 34;
        Integer c = 13;
        Integer d = 100;
        int e = 500;
        System.out.println(a.intValue());//returns integer value of a
        System.out.println(b.doubleValue());//returns double value of b
        System.out.println(c.floatValue());//returns float value of c
        System.out.println(Integer.parseInt("241313"));
        System.out.println(Integer.compare(100, 100));//returns 0 if equal
        System.out.println(Integer.compare(100, 90));//returns 1 if x > y
        System.out.println(Integer.compare(90, 100));//returns -1 if x < y
        System.out.println(a.equals(d));//returns true if a equals d else returns false
        System.out.println(a.equals(c));//returns true if a equals c else returns false
    }
}
