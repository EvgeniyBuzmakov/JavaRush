package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");

  /*      for (HashMap.Entry<Integer, String> x: passportsAndNames.entrySet()) {
            System.out.println(x);
        }
  */
        for (HashMap.Entry<Integer, String> pair : passportsAndNames.entrySet()) {
            Integer key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
        }

 //  System.out.println(passportsAndNames);
        System.out.println("--------------------------------------------------------------");

        ArrayList<String> list = new ArrayList<String>();
//Какой то код, занесение данных
        list.add(0, "wethqeht");

        list.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------");

        HashMap<String, Object> map = new HashMap<>();
        map.put("Sim", 5);

        map.forEach((k, v) -> System.out.println(k + " - " + v));
// Либо map.forEach((k, v) -> System.out.println(k));  если нужен только ключ
// Соответственно только для значений: map.forEach((k, v) -> System.out.println(v));

    }

}