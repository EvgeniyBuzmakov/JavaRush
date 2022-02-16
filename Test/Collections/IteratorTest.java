package com.company.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(45);
        list1.add(56);
        list1.add(23);
        list1.add(123);
        list1.add(967);
        list1.add(21);
        Iterator<Integer> iterator = list1.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        while (iterator.hasNext()) {

            int a = iterator.next();
            if (a == 123 | a == 967)  iterator.remove();
        }
        System.out.println(list1);
    }
}
