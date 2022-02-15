package Level8Kollekcii;
import java.util.HashMap;
import java.util.Map;
/*
Однофамильцы и тёзки
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/
public class OdnofamilcuITezki {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Petrov", "Ivan");
        map.put("Kurenko", "Ivan");
        map.put("Sidorov", "Ivan");
        map.put("Birulev", "Ivan");
        map.put("Petrov", "Ivan");
        map.put("Petrov", "Ivan");
        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Ivan");
        map.put("Pavlov", "Ivan");
        map.put("Petrov", "Ivan");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
         //   System.out.println(s);
        }
    }
}