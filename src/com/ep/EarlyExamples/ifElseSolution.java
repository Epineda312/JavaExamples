package com.ep.EarlyExamples;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ifElseSolution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        String ans="";

        if(n % 2 == 1){// if ‘n’ is NOT evenly divisible by 2 (i.e.: n is odd)
            ans = "Weird";
        } else if((n % 2==0)){ //Even Number
            if(n > 2 && n <= 5) {
                ans = "Not Weird";
            }
            if(n >= 6 && n <=20){
                ans = "Weird";
            } else{ //Complete Code
                ans = "Not Weird";
            }
        }
        System.out.println(ans);
    }
}
/*
* Scanner scanner = new Scanner(System.in);
String myString = scanner.next();
int myInt = scanner.nextInt();
scanner.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);
* */