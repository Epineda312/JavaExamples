package com.ep.practice.com.ep.Polymorphism;

public class Polymorphism {
    public static void main(String args[]){
        //Create object from Parent Class
        Vehicle v1 = new Vehicle("Subaru","Forester",2001);
        v1.Start();
        v1.Stop();

        //Create SUV object
        SUV Nissan = new SUV("Nissan", "Pathfinder",2008 );
        System.out.println("-----------------------------------------------");
        Nissan.start();
        Nissan.stop();


        //Create Semi Object
        Semi Volvo = new Semi("Volvo","VML", 2010);
        System.out.println("-----------------------------------------------");
        Volvo.start();
        Volvo.stop();

        //Create Motorbike Object
        Motorbike Harley = new Motorbike("Harley","Samson", 1998);
        System.out.println("-----------------------------------------------");
        Harley.Start();
        Harley.Stop();
    }
}
