package Level7Massivu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class TestArrayList
{
    public static void main(String[] args) throws IOException
    {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

//ввод строк с клавиатуры
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 3; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }

//вывод содержимого коллекции на экран
       // for (int i = 0; i < list.size(); i++)
            for (int i = list.size()-1; i >= 0; i--)
        {
          //  int j = list.size() - i - 1;
            // System.out.println(list.get(j));
            System.out.println(list.get(i));
        }
        /*
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0, 5);
        System.out.println(list.get(0));

        ArrayList frut = new ArrayList();
        frut.add(6);
        frut.add("orange");
        frut.add("kartoxa");
        frut.add(6);
        frut.add("apelsin");
        frut.set(2, "ggggggggggg");
       // frut.clear();
        System.out.println(frut);
         */


    }
}
