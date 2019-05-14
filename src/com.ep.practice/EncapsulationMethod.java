package com.ep.practice;

public class EncapsulationMethod {
    public static void main(String args[]){
        Encapsulation c1 = new Encapsulation();
        c1.setName("Ryan");
        c1.setAge(26);
        c1.setIdNum("54132");
        System.out.println(String.format("%s with ID Number: %s is %d years old",
                c1.getName(), c1.getIdNum(), c1.getAge()));


    }
}
