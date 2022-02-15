package Level7Massivu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
 */
public class VurashaemsaPokoroche
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            strings.add(reader.readLine());
        }

        int max = 2147483647;

        for (int i = 0; i < strings.size(); i++)
        {
            if (strings.get(i).length() < max)
            {
                max = strings.get(i).length();
            }
        }
        //   System.out.println(max);
        //   System.out.println("------------------");
        //   System.out.println(strings.size());

        for (int j = 0; j < strings.size(); j++)
        {
            if (strings.get(j).length() == max)
            {
                System.out.println(strings.get(j));
            }
        }
    }
}