package com.ep.practice.Collection;
import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String args[]){
        //Non generic ArrayList
        System.out.println("----------------------------");
        List arrayList1 = new ArrayList();
        arrayList1.add("String1");
        arrayList1.add(2);
        arrayList1.add(false);
        System.out.println(arrayList1);
        arrayList1.remove(0);
        System.out.println(arrayList1);

        //Non generic ArrayList
        System.out.println("----------------------------");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("String2");
        arrayList2.add(3);
        arrayList2.add(true);
        System.out.println(arrayList2);
        arrayList2.remove(0);
        System.out.println(arrayList2);

        //Generic Array List (String)
        System.out.println("----------------------------");
        List<String> arrayList3 = new ArrayList<String>();
        arrayList3.add("String1");
        arrayList3.add("String2");
        arrayList3.add("String3");
        System.out.println(arrayList3);
        arrayList3.remove(0);
        System.out.println(arrayList3);

        //Generic Array List (String)
        System.out.println("----------------------------");
        ArrayList<String> arrayList4 = new ArrayList<String>();
        arrayList4.add("String4");
        arrayList4.add("String5");
        arrayList4.add("String6");
        System.out.println(arrayList4);
        arrayList4.remove(0);
        System.out.println(arrayList4);

        //Generic Array List(Double)
        System.out.println("----------------------------");
        List<Double> arrayList5 = new ArrayList<Double>();
        arrayList5.add(1.11);
        arrayList5.add(2.22);
        arrayList5.add(3.33);
        System.out.println(arrayList5);
        arrayList5.remove(0);
        System.out.println(arrayList5);
    }
}
