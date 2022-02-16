package com.company.Collections.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedlistTest {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(45);
        list1.add(67);
        list1.add(12);
        list1.add(90);
        list1.add(543);
        System.out.println(list1.getClass());

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("qqq");
        list2.add("fff");
        list2.add("ggg");
        list2.add("hhh");
        list2.add("kkk");
        System.out.println(list2.get(3));
    }
}
