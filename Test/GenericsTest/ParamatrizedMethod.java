package com.company.GenericsTest;

import java.util.ArrayList;

public class ParamatrizedMethod {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(34);
        list1.add(777);
        list1.add(9);
        Integer y = new ParamMethod().paramMethod(list1);
        System.out.println(y);
    }
}

class ParamMethod {
    public <T> T paramMethod(ArrayList<T> a1) {
        return a1.get(1);
    }
}
