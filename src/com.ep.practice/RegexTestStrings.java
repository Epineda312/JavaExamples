package com.ep.practice;

public class RegexTestStrings {
    public static final String EXAMPLE_TEST = "This is my " + "small example";

    //Match any character - .*
    //Match beginning character - ^
    //Match ending character - $
    public static void main(String args[]){
        System.out.println(EXAMPLE_TEST.matches("\\w.*"));//return true if the string matches
        String[] splitString = (EXAMPLE_TEST.split("\\s+"));//split each string by white space
        System.out.println(splitString.length);//should be 5
        //for loop to print each word
        for(String string : splitString){
            System.out.println(string);//print each string
        }
        //replace all whitespace with tabs
        System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
    }
}
