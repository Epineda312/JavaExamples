package com.ep.practice.Inheritance;

public class SmallBox extends Box{
    private int length;
    private int width;

    public SmallBox(int l, int w){
        super(l,w);
        this.length = l;
        this.width = w;
    }

    //Display box name
    public void displayBoxName(){
        System.out.println("I am a small box class");
    }

    //Display area
    public void printArea(){
        double area = length * width;
        System.out.println("Area is: " + area);
    }
}
