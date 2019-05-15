package com.ep.EarlyExamples;

public class arrayOfNames {
    public static void main(String args[]) {
        String[] studentNames; //Declare an array of integers
        studentNames = new String[]{"John", "David", "Henry", "Bob", "Victor"}; //Array of Names
        int[] studentAge = new int[]{29, 25, 42, 31, 33}; //Array of Ages
        double[] studentGrade = new double[]{4.0, 3.25, 3.0, 2.9, 3.5};
        String[] studentSubjects = new String[5];
        studentSubjects[0] = "Computer Science";
        studentSubjects[1] = "Sociology";
        studentSubjects[2] = "History";
        studentSubjects[3] = "Biology";
        studentSubjects[4] = "English";


        System.out.println(studentNames[0]);// => "John"
        System.out.println(studentNames[2]);// => "Henry"
        System.out.println(studentNames[4]);// => "Victor"
        System.out.println(studentAge[1]);// => "25"
        System.out.println(studentAge[4]);// => "33"
        System.out.println(studentGrade[3]);// => 2.9
        System.out.println(studentSubjects [4]);// => "English"
    }
}
