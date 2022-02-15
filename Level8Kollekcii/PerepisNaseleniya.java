package Level8Kollekcii;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
/*
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
•	Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
•	Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/
public class PerepisNaseleniya {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов","Сергей");
        map.put("Петров","Петр");
        map.put("Сидоров","Петр");
        map.put("Сергеев","Василий");
        map.put("Пушкин1","Геннадий");
        map.put("Толстой","Александр");
        map.put("Лермонтов","Костя");
        map.put("Кикабидзе","Паша");
        map.put("Пушкин","Илья");
        map.put("Маркс","Дима");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int CountName =0;
        for (Map.Entry pair : map.entrySet())
        {
            if (pair.getValue().equals(name))
                CountName++;
        }
        return CountName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int CountLastName =0;
        for (Map.Entry pair : map.entrySet())
        {
            if (pair.getKey().equals(lastName))
                CountLastName++;
        }
        return CountLastName;
    }

    public static void main(String[] args) {
 /*
        Map<String, String> map1 = createMap();

        System.out.println(getCountTheSameFirstName(map1, "Ivan"));
        System.out.println(getCountTheSameLastName(map1, "Petrov"));
 */
    }
}