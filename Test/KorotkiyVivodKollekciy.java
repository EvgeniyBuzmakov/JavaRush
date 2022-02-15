package Test;

import java.util.ArrayList;
import java.util.HashMap;

public class KorotkiyVivodKollekciy {
    public static void main(String[] args) {
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
