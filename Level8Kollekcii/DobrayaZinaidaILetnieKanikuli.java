package Level8Kollekcii;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/*
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
•	Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/
/*
public class DobrayaZinaidaILetnieKanikuli {

    public static Map<String, Date> createMap() throws ParseException {

        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код

 //       map.put("Stallone", new Date("JUNE 1 1980"));
  //      map.put("Ivan", new Date("JUNE 4 1980"));
  //      map.put("Ivagasdn", new Date("JUNE 4 1980"));
 //       map.put("Ivaasdn", new Date("JUNE 4 1980"));
//        map.put("Ivanasfg", new Date("JUNE 4 1980"));
//        map.put("Ivjan", new Date("JUNE 4 1980"));
 //       map.put("Ivaxcvbcn", new Date("JUNE 4 1980"));
 //       map.put("Ivaxcvn", new Date("JUNE 4 1980"));
 //       map.put("Ivawetn", new Date("JUNE 4 1980"));
 //       map.put("Ivanzxc", new Date("JUNE 4 1980"));


        map.put("Obama", dateFormat.parse("JULY 10 1981"));
        map.put("Willis", dateFormat.parse("APRIL 21 1978"));
        map.put("Reygan", dateFormat.parse("MARCH 12 1992");
        map.put("Stalin", dateFormat.parse("AUGUST 10 1982"));
        map.put("Molotov", dateFormat.parse("JANUARY 1 1980"));
        map.put("Pushkin", dateFormat.parse("JANUARY 7 1996"));
        map.put("Lermontov", dateFormat.parse("JUNE 25 1988"));
        map.put("Shevchenko", dateFormat.parse("JUNE 1 1980"));
        map.put("Ivanov", dateFormat.parse("MARCH 11 2000"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            String key   = pair.getKey();
            Date date = pair.getValue();
            int mon = date.getMonth();

            if(mon==5||mon==6||mon==7){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

     //   HashMap<String, Date> map1 = createMap();
     //   removeAllSummerPeople(map1);
    }
}

*/
