package Level9Isklucheniya;

import java.util.ArrayList;

/*
Исключение при работе с коллекциями List
*/

public class IsklucheniePriRaboteSKollekciyamiList {
    public static void main(String[] args) {
        //напишите тут ваш код
try {
    ArrayList<String> list = new ArrayList<String>();
    String s = list.get(18);
}

        //напишите тут ваш код
        catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}

