package com.ep.practice.Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String args[]){
        //Create non-Generic LinkedList
        System.out.println("----------------------------");
        List LinkedList1 = new LinkedList();
        LinkedList1.add("String1"); //Add String
        LinkedList1.add(2);
        LinkedList1.add(false);
        System.out.println(LinkedList1);
        LinkedList1.remove(1); //Add element at index 0
        System.out.println(LinkedList1);
        LinkedList1.removeAll(LinkedList1);
        System.out.println(LinkedList1);

        //Create generic linked list
        System.out.println("----------------------------");
        List<String> LinkedList2 = new LinkedList<String>();
        LinkedList2.add("String1");
        LinkedList2.add("String2");
        LinkedList2.add("String3");
        System.out.println(LinkedList2);
        LinkedList2.remove(1);
        System.out.println(LinkedList2);

        //Create generic linked list
        System.out.println("----------------------------");
        LinkedList<String> LinkedList3 = new LinkedList<String>();
        LinkedList3.add("String1");
        LinkedList3.add("String2");
        LinkedList3.add("String3");
        System.out.println(LinkedList3);
        LinkedList3.remove(3);
        System.out.println(LinkedList3);


    }
}
