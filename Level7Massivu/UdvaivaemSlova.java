package Level7Massivu;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Удваиваем слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу:
"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
3. Выведи результат на экран, каждое значение с новой строки.
*/
public class UdvaivaemSlova
{
    public static void main(String[] args) throws Exception
    {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
        {
            list.add(i, reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for(String string : result)
        {
            System.out.println(string);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i += 2)
        {
            list.add(i, list.get(i));
        }
        return list;
    }
}