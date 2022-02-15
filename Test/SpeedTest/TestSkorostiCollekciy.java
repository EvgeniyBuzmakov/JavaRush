package Test.SpeedTest;

import java.util.*;

public class TestSkorostiCollekciy {

    public static void main(String[] args) {

        List<Integer> numbersArray = new ArrayList<>();
        List<Integer> numbersLinked = new LinkedList<>();
     //   List<Integer> numbersSet = new HashSet<Integer>();

        timeLong(numbersArray);
        timeLong(numbersLinked);
      //  timeLong(numbersSet);

    }

    public static void timeLong(List<Integer> list) {

        for (int i = 0; i < 15000000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

        list.get(10000000);

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

}
