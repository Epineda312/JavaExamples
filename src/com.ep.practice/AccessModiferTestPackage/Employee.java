package com.ep.practice.AccessModiferTestPackage;

public class Employee {

    //Private access modifier
    private void displayEmployeeName(String name){
        System.out.println("My name is: " + name);
    }
    //Default access modifier
    void displayEmployeeId(int id){
        System.out.println("My employee is is: "+  id);
    }
    //Protected access modifier
    protected void displayEmployeeSalary(double salary){
        System.out.println("Salary is: " + salary);
    }
    //Public access modifier
    public void displayEmployeebenefits(double insurancePercentage){
        System.out.println(String.format("Employee only needs to pay %s of their " +
                                           "hospital cost", insurancePercentage));
    }

    public static void main(String args[]){
        Employee empl1 = new Employee();
        empl1.displayEmployeeName("John");
    }
}
