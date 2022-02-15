package Level7Massivu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
Удалить и вставить
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
*/

public class UdalitAndVstavit2 {
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        List<Integer> str = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++)
        {
            str.add(i);
        }
        System.out.println(str);

        for (int i = 0; i < 20; i++)
        {
            int a = str.remove(str.size()-1);
            str.add(0, a);
        }

        for (int i = 0; i < str.size(); i++)
        {
            System.out.println(str.get(i));
        }
    }
}