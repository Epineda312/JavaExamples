package com.ep.practice.AccessModiferTestPackage;

public class AccessModifierExample {
    public static void main(String args[]){
        Employee e1 = new Employee();
        //e1.displayEmployeeName("Danny"); Private
        e1.displayEmployeeId(313); //Can run this method since it is in the same package
    }
}
