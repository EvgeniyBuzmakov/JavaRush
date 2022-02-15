package Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;

public class SkorostTestArraylistAndLinkedList {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrayArray = new ArrayList<>();
        LinkedList<Integer> linkedArray = new LinkedList<>();

        for (int i = 0; i < 10000000; i++) {
            arrayArray.add(i);
            linkedArray.add(i);
        }
        long first = Calendar.getInstance().getTimeInMillis();

        for (int i = 0; i < 10000; i++) {
//          arrayArray.add(100000,1);
            linkedArray.get(5000000-i);
        }
        long second = Calendar.getInstance().getTimeInMillis();

        System.out.println("Отработал за: " + (second - first)/1000f +  " сек.");
    }
}
