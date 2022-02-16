package com.company.Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("ok");
        list1.add("privet");
        list1.add("hello");
        list1.add("world");
        Object [] array1 = list1.toArray();
        String [] array2 = list1.toArray(new String [7]);

        System.out.println(array2);
        System.out.println(array2.length);
        for (String s: array2) {
            System.out.println(s);
        }
    }
}
