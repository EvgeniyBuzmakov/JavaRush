package Level8Kollekcii;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
Cамая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.
*/
public class SamayaDlinnayaPosledovatelnost
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        List<Integer> arr = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++)
        {
            arr.add(i, Integer.valueOf(reader.readLine()));
        }
        int count = 1;
        int max = 1;
        for (int i = 1; i < arr.size(); i++)
        {
           if (arr.get(i).equals(arr.get(i - 1)))
           {
               count++;
               if (count > max)
                   max = count;
           }
           else count = 1;

        }
        System.out.println(max);
    }
}