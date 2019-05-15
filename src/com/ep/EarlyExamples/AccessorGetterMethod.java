package com.ep.EarlyExamples;

class Automobile{
    String make;
    String model;
    int year;

    //Constructor with parameters
    public Automobile(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //Getter com.ep.EarlyExamples.Methods
    public String getMake(){return make;}
    public String getModel(){return model;}
    public int getYear(){return year;}

    //Setter
    public void setMake(String make){this.make = make;}
    public void setModel(String model){this.model = model;}
    public void setYear(int year){this.year = year;}

    //Starting
    public void start(){System.out.println("Starting\n"); }
}

public class AccessorGetterMethod{
    public static void main(String[] args){
        //Create ford object
        Automobile toyota = new Automobile("Toyota", "RAV4", 2015);
        Automobile a1 = new Automobile("Ford", "Taurus", 2015);

        //Use setter methods to set new value
        toyota.setMake("Toyota");
        toyota.setModel("Prius V");
        toyota.setYear(2016);

        //Use getter methods to get the value
        System.out.println("Car make is: " + toyota.getMake());
        System.out.println("Car model is: " + toyota.getModel());
        System.out.println("Car year is: "+ toyota.getYear()+"\n");

        //Ford Taurus a1 object
        System.out.println("Car make is: " + a1.getMake());
        System.out.println("Car model is: "+ a1.getModel());
        System.out.println("Car year is: "+ a1.getYear()+"\n");

        //Starting Toyota
        System.out.println("The " + toyota.getModel()+ " is starting");
        toyota.start();

        //Starting Taurus
        System.out.println("The " + a1.getModel() +" is starting");
        a1.start();
    }
}

