package Level7Massivu;
/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SamayaDlinnayaStroka
{
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        strings = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            strings.add(reader.readLine());
        }

        int max = 0;

        for (int i = 0; i < strings.size(); i++)
        {
            if (strings.get(i).length() > max)
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