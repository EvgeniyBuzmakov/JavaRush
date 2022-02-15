package Level7Massivu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Удалить и вставить
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
*/
public class UdalitAndVstavit
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            str.add(reader.readLine());
        }

        for (int i = 0; i < 13; i++)
        {
         //   str.add(0,str.remove(str.size()-1));
         //----------------------------------------------------------------------
         //   str.add(0, str.get(4));
         //   str.remove(5);
         //----------------------------------------------------------------------
            str.add(0, str.get(str.size()-1));
            str.remove(str.size()-1);

        }

        for (int i = 0; i < 5; i++)
        {
            System.out.println(str.get(i));
        }
    }
}
