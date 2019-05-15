package com.ep.practice.com.ep.Polymorphism;

public class Motorbike extends Vehicle {

    //Constructor
    public Motorbike(String make, String model, int year){
        super(make, model, year);
    }

    void Start(){
        System.out.println(String.format("Starting Motorbike, Make = %s, Model = %s, Year = %d",
                getMake(), getModel(), getYear()));
    }

    void Stop(){
        System.out.println(String.format("Stopping Motorbike, Make = %s, Model = %s, Year = %d,",
                getMake(), getModel(), getYear()));
    }
}
