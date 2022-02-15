package Level7Massivu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк.
Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/
public class SlovaVObratnomPoryadke
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
        {
            str.add(i, reader.readLine());
        }

        str.remove(3);

        for (int i = str.size()-1; i >= 0; i--)
        {
            System.out.println(str.get(i));
        }
    }
}
