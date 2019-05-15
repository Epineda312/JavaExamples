package com.ep.EarlyExamples;

public class stringInterpolation {
    public static void main(String args[]){
        String customerName = "Kevin";
        int age = 45;
        String streetName = "4131 California Avenue";
        String city = "Los Angeles";
        String state = "California";
        String country = "USA";
        String zipCode = "90012";

        //No String Interpolation
        System.out.println("com.ep.EarlyExamples.Student Details: " +
                "Name: "+ customerName + ", age: " + age + ", " +
                "Address: " + streetName + ", City: "+ city + ", " +
                "State: " + state + ", Country: " + country + ", " +
                "ZipCode: " + zipCode);

        //String Interpolation
        System.out.println(String.format("com.ep.EarlyExamples.Student Details: name: %s, age: %d, Address: %s, City: %s, State: %s" +
                "Country: %s, ZipCode: %s", customerName, age, streetName, city, state, country, zipCode));
    }
}
