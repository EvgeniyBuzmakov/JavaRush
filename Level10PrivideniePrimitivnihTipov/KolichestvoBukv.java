package Level10PrivideniePrimitivnihTipov;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Количество букв
*/
public class KolichestvoBukv {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        // напишите тут ваш код
        int numb = 0;
        String MegaString = "";

        for (int i = 0; i <list.size() ; i++) {
            MegaString += list.get(i);
        }
        MegaString.replaceAll(" ","");
        char[] chararr = MegaString.toCharArray();

        ArrayList<Integer> numbs  = new ArrayList<Integer>();
        for (int i = 0; i <alphabet.size() ; i++) {
            numbs.add(0);
        }
        int numbmini =0;
        for (int i = 0; i <chararr.length ; i++) {
            for (int j = 0; j <alphabet.size() ; j++) {
                if(chararr[i]==alphabet.get(j)){
                    numbmini = numbs.get(j) +1;
                    numbs.set(j,numbmini);
                }

            }
        }
        for (int i = 0; i <alphabet.size() ; i++) {
            System.out.println(alphabet.get(i)+" "+numbs.get(i));
        }
    }
}