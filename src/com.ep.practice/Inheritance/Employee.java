package com.ep.practice.Inheritance;

public class Employee extends Person {
    private String SSN;

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
}

class InheritanceExample{
    public static void main(String args[]){
        //Create Person Object
        Person person1 = new Person();
        person1.setName("Pam");
        person1.setAge(32);
        System.out.println(String.format("%s's age is: %s",
                person1.getName(), person1.getName(), person1.getAge()));

        //Create Employee Object
        Employee emp1 = new Employee();
        emp1.setName("Stacy");
        emp1.setAge(28);
        emp1.setSSN("341-234-4321");
        System.out.println(String.format("%s with SSN of %s, is %d years old.",
                emp1.getName(), emp1.getSSN(), emp1.getAge()));

    }
}

