package Level8Kollekcii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import java.util.HashMap;
import java.util.Map;

/*
Номер месяца
*/

public class NomerMesyaca {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "January");
        map.put(2, "February");
        map.put(3, "March");
        map.put(4, "April");
        map.put(5, "May");
        map.put(6, "June");
        map.put(7, "July");
        map.put(8, "August");
        map.put(9, "September");
        map.put(10, "October");
        map.put(11, "November");
        map.put(12, "December");

        int month = Integer.parseInt(reader.readLine());

        System.out.println(map.get(month)+ " is the "+ month + " month");
    }
}
/*    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String month = reader.readLine();
    Map map = new HashMap();
        map.put("January", 1);
                map.put("February", 2);
                map.put("March", 3);
                map.put("April", 4);
                map.put("May", 5);
                map.put("June", 6);
                map.put("July", 7);
                map.put("August", 8);
                map.put("September", 9);
                map.put("October", 10);
                map.put("November", 11);
                map.put("Desember", 12);
                if (map.containsKey(month))
                System.out.println(month + " is "+ map.get(month) + " month");
                }

                }

 */