package Level8Kollekcii;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/*
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
•	Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/
public class TolkoDlaBogachey
{
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> hm = new HashMap<>();

        hm.put("Иванов", 100);
        hm.put("Иванидзе", 1000);
        hm.put("Иваник", 3000);
        hm.put("Петров", 4000);
        hm.put("Сидоров", 5000);
        hm.put("Прутков", 111);
        hm.put("Толстой", 3222);
        hm.put("Тонкий", 4222);
        hm.put("Пушкин", 5666);
        hm.put("Кукушкин", 7777);

        return hm;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator itr = map.entrySet ().iterator();

        Map.Entry pair;
        Integer a;
        while (itr.hasNext()) {
            pair = (Map.Entry) itr.next();
            a = (Integer) pair.getValue();
            if (a.compareTo(500) == -1)
                itr.remove();
        }

    }

    public static void main(String[] args) {
//        HashMap<String, Integer> hm =  createMap();
//        removeItemFromMap (hm);
//
//        for (Map.Entry <String, Integer> pair : hm.entrySet())
//            System.out.println(pair.getKey()+" "+pair.getValue());

    }
}