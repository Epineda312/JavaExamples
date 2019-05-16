package com.ep.practice.Interface;

public class Ford implements Vehicle{
    @Override
    public void start(){
        System.out.println("Starting");
    }
    @Override
    public void stop(){
        System.out.println("Stopping");
    }
    @Override
    public void cruise(){
        System.out.println("Cruising");
    }

    public static void main(String args[]){
        Ford f150 = new Ford();
        f150.start();
        f150.cruise();
        f150.stop();

    }
}
