package com.ep.practice.Inheritance;

public class BigBox extends Box {
    private int length;
    private int width;
    private int height;

    public BigBox(int l, int w, int h){
        super(l,w);
        this.length = l;
        this.width = w;
        this.height = h;
    }

    //Display box name
//    public void displayBoxName(){
//        System.out.println("I am a small box class");
//    }

    //Display area
    public void printArea(){
        double area = length * width;
        System.out.println("Area is: " + area);
    }
}
