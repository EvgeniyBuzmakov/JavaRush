package Test.ListTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            list.add("ddd" + i);
        }
        System.out.println(list.get(5862));

        ArrayList list1 = new ArrayList();
    }

    public void asdf(ArrayList<String> list) {

    }
}
