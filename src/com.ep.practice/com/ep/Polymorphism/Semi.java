package com.ep.practice.com.ep.Polymorphism;

public class Semi extends Vehicle {

    //Constructor
    public Semi(String make, String model, int year){
        super(make, model, year);
    }

    void start(){
        System.out.println(String.format("Starting Semi Vehicle, Make = %s, Model = %s, Year = %d",
                getMake(), getModel(), getYear()));
    }

    void stop(){
        System.out.println(String.format("Stopping Semi Vehicle, Make = %s, Model = %s, Year = %d",
                getMake(), getModel(), getYear()));
    }
}
