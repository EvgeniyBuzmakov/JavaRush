package Test.ListTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("test1");
        list.add("test2");
        list.add("test3");

        Iterator<String> iterator =  list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        System.out.println("//***********************************************************************");

        for (String element : list) {
            System.out.println(element);
        }

        System.out.println("//***********************************************************************");
        List<String> names = List.of("test11", "test22", "test33");

            for (Iterator i = names.iterator(); i.hasNext(); ) {
                String name = (String) i.next();
                System.out.println(name);
            }

    }

}
