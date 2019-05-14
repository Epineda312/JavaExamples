package com.ep.practice;

public class StringMethod2 {
        public static void main(String args[]) {
            String str1 = "Hello Students. ";
            String str2 = "Welcome";
            String str3 = "Test";
            String str4 = "Java";
            String str5 = "          string          ";
            int totalStudents = 50;
            String str6 = "abc, def, ghi";
            String [] strCount = str6.split("\\s");//Split string with regex expression
            System.out.println(str1.concat(str2));//Append string2 to string1
            System.out.println(str1.replace('e','a'));//Replace 'e' character with 'a'
            System.out.println(str3.toLowerCase());//convert string to lowercase
            System.out.println(str4.toUpperCase());//convert string to uppercase
            System.out.println(str5.trim());//Trim white spaces to string
            System.out.println(String.valueOf(totalStudents)); //Parse int to string
            System.out.println(strCount.length);//returns length of string
            //For each loop to print out each word
            for(String s: strCount){
                System.out.println("Word: " + s);
            }
        }
    }

