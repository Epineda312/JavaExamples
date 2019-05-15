package com.ep.EarlyExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class checkForOdd {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        List <Integer> odds = new ArrayList<Integer>();

        while (l <= r) {
            if (l % 2 == 1) {
                odds.add(l);
                l++;
            } else {
                l++;
            }
        }
        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            System.out.print(", ");
        }
    }
}
/*
*     static List<Integer> oddNumbers(int l, int r) {
        List<Integer> odds = new ArrayList<Integer>();

        while (l <= r) {
            if (l % 2 == 1) {
                odds.add(l);
                l++;
            } else {
                l++;
            }
        }
        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            System.out.print(", ");
        }
        return odds;
    }
* */