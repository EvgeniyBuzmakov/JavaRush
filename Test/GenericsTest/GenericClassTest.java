package com.company.GenericsTest;

import java.util.ArrayList;
import java.util.List;

public class GenericClassTest {

    public static void main(String[] args) {

        Info<Integer> list1 = new Info<Integer>(555);
        System.out.println(list1.getValue());
        Integer i1 = list1.getValue();

//        Info<String> list2 = new Info<String>("iyguyfg");
//        System.out.println(list2.getValue());
//        String i2 = list2.getValue();
    }

}
//T extends
class Info <T extends Number> {

    private T value;

    public Info (T value) {
        this.value = value;
    }

    public String toString () {
        return "((" + value + "))";
    }

    public T getValue() {
        return value;
    }
}
