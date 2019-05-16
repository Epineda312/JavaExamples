package com.ep.practice.Abstraction;

public class AbstractionExample {
    public static void main(String args[]){
        Employee e1 = new Employee();
        e1.setEmpId("123");
        e1.setName("Greg");
        e1.setAddress("4175 West Acres, Los Angeles, CA, 98210");
        System.out.println(e1.getCustomerInfo());
    }
}
