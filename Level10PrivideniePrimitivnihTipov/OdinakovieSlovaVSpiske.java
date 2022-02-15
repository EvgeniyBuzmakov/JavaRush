package Level10PrivideniePrimitivnihTipov;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Одинаковые слова в списке
*/

public class OdinakovieSlovaVSpiske {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        //напишите тут ваш код
        for (String element : list)
        {
            result.put(element,0);
        }
        for (String listElement : list)
        {
            if (result.containsKey(listElement))
            {
                int n = result.get(listElement);
                result.put(listElement,n+1);
            }
        }

        return result;
    }

}

