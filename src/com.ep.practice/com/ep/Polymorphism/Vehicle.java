package com.ep.practice.com.ep.Polymorphism;

public class Vehicle {
    //Private Variables
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    void Start(){
        System.out.println("Starting");
    }

    void Stop(){
            System.out.println("Stopping");
    }
}
