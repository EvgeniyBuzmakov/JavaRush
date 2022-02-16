package com.company.GenericsTest.gameBrainRing;

import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        int[] arr = new int[22];
        System.out.println(arr.length);

        ArrayList<Integer> list1 = new ArrayList<Integer>(67);
        System.out.println(list1.size());

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2 = list1;
        System.out.println(list2 == list1);
    }
}
