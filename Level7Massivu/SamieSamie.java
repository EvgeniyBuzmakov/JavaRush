package Level7Massivu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
*/

public class SamieSamie
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
            str.add(i, reader.readLine());

        int min = str.get(0).length();
        int max = str.get(0).length();
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = str.size()-1; i >= 0; i--)
        {
            if (str.get(i).length() <= min)
            {
                min = str.get(i).length();
                minIndex = i;
            }
        }
        for (int i = str.size()-1; i >= 0; i--)
        {
            if (str.get(i).length() >= max)
            {
                max = str.get(i).length();
                maxIndex = i;
            }
        }

        if (minIndex < maxIndex)
            System.out.println(str.get(minIndex));
        else
            System.out.println(str.get(maxIndex));
        //System.out.println(minIndex + str.get(minIndex) + " " + maxIndex + str.get(maxIndex));
    }
}
