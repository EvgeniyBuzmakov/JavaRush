package Level7Massivu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
В начало списка
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class VNachaloSpiska
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
        {
          str.add(0, reader.readLine());
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println(str.get(i));
        }
    }
}
