package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestArrayList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(45);
        list.add(7);
        list.add(66);
        System.out.println(list);
        list.add(1, 99);
        System.out.println(list);
        list.set(1, 33);
        System.out.println(list);
        System.out.println(list.get(3));

        System.out.println("/----------------------------------------------------------------------/");
        System.out.println("JavaRush".charAt(1));
        System.out.println("J\u0061vaRush".charAt(1));
        System.out.println("/----------------------------------------------------------------------/");
        Integer int1 = new Integer(11111);
        Integer int2 = new Integer(11111);
        System.out.println("Равенство ссылок  " + (int1 == int2));
        System.out.println("Равенство хэшкодов  " + (int1.hashCode() == int2.hashCode()));
        System.out.println(int1.hashCode());
        System.out.println(int2.hashCode());
        System.out.println("/----------------------------------------------------------------------/");
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("Равенство ссылок  " + (obj1 == obj2));
        System.out.println("Равенство хэшкодов  " + (obj1.hashCode() == obj2.hashCode()));
        System.out.println(obj1.toString());
        System.out.println(obj1.hashCode());
        System.out.println("/----------------------------------------------------------------------/");
        Collection<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(1);
        result.add(2);
        for (Integer in : result) {
            System.out.println(in);
        }
      //  System.out.println(result.get(0));
    }

}
