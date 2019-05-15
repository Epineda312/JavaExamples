package com.ep.EarlyExamples;

public class caseSwitch {
    public static void main(String args[]){
        String grade = "B-"; //Students grade
        switch(grade){
            case "A+":
                System.out.println("Great com.ep.EarlyExamples.Student!");
                break;
            case "A":
                System.out.println("Great com.ep.EarlyExamples.Student!");
            case "A-":
                System.out.println("Great com.ep.EarlyExamples.Student!");
                break;
            case "B+": case"B":
            case "B-":
                System.out.println("Good com.ep.EarlyExamples.Student!");
                break;
            case "C+": case"C":
            case "C-":
                System.out.println("Poor com.ep.EarlyExamples.Student!");
                break;
            case "D+": case"D":
            case "D-":
                System.out.println("Very Poor com.ep.EarlyExamples.Student!");
                break;
            case "F":
                System.out.println("Very Poor com.ep.EarlyExamples.Student");
                break;
            default:
                System.out.println("Invalid Grade");
                break;
        }
    }
}
