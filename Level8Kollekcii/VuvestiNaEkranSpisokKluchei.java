package Level8Kollekcii;
import java.util.HashMap;
import java.util.Map;
/*
Вывести на экран список ключей
*/

public class VuvestiNaEkranSpisokKluchei
{
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map)
    {
        //напишите тут ваш код
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();
        //    String value = pair.getValue();
        //    System.out.println(key + " - " + value);
            System.out.println(key);
        }
    }
}