package Level10PrivideniePrimitivnihTipov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Функциональности маловато!
*/

public class FunkcionalnostiMalovato {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while (true)
        {
            String temp = reader.readLine();
            if (temp.isEmpty())
                break;
            int id = Integer.parseInt(temp);
            String name = reader.readLine();
            map.put(name,id);

        }
        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            System.out.println(pair.getValue() +" " + pair.getKey());
        }
    }
}