package com.ep.practice.com.ep.Polymorphism;

public class SUV extends Vehicle {
    //Constructor
    public SUV(String make, String model, int year){
        super(make, model, year);
    }

    void start(){
        System.out.println(String.format("Starting SUV Vehicle, Make = %s, Model = %s, Year = %d,",
                getMake(), getModel(), getYear()));
    }

    void stop(){
        System.out.println(String.format("Stopping SUV Vehicle, Make = %s, Model = %s, Year = %d",
                getMake(), getModel(), getYear()));
    }
}
