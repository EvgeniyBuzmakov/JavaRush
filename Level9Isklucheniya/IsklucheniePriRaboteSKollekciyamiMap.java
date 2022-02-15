package Level9Isklucheniya;

import java.util.HashMap;

/*
Исключение при работе с коллекциями Map
*/

public class IsklucheniePriRaboteSKollekciyamiMap {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
    HashMap<String, String> map = new HashMap<String, String>(null);
    map.put(null, null);

    map.remove(null);
}


        //напишите тут ваш код
        catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}

