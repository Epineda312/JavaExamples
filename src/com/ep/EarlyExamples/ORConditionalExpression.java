package com.ep.EarlyExamples;

public class ORConditionalExpression {
    public static void main(String args[]){
        double account_balance = 1000000;
        int age = 64;
        if(account_balance >= 1000000|| age >= 65){
            System.out.println("Congratulations! You can retire");
        }else{
            System.out.println("You got some saving to do!");
        }
    }
}
