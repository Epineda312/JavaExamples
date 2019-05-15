package com.ep.EarlyExamples;

class Student {
    //Instance method to get name of student
    public void name_of_student(String name){
        System.out.println(String.format("My name is: %s", name));
    }

    //Instance method to get the student grade
    public void grade(double grade){
        System.out.println(String.format("Your grade is: %.2f", grade));
    }

    //Static method
    public static void className(String name){
        System.out.println(String.format("Object name is: %s", name));
    }
}

public class instanceMethod {
    public static void main(String args[]){
        //call instance methods

        //Create com.ep.EarlyExamples.Student 1 object
        /*com.ep.EarlyExamples.Student student1 = new com.ep.EarlyExamples.Student();
        student1.name_of_student("Stacy");
        student1.grade(4.25);*/
        Student.className("student1");

        //Create com.ep.EarlyExamples.Student 2 object
        /*com.ep.EarlyExamples.Student student2 = new com.ep.EarlyExamples.Student();
        student2.name_of_student("John");
        student2.grade(3.25);*/
        Student.className("student2");

        //Create com.ep.EarlyExamples.Student 3 object
        /*com.ep.EarlyExamples.Student student3 = new com.ep.EarlyExamples.Student();
        student3.name_of_student("Julie");
        student3.grade(2.25);*/
        Student.className("student3");
    }
}
