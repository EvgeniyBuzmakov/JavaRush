package Level7Massivu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Вывести числа в обратном порядке
1.Ввести с клавиатуры 10 чисел и заполнить ими список.
2.Вывести их в обратном порядке. Каждый элемент - с новой строки.
Использовать только цикл for.
*/
public class VuvestiChislaVObratnomPoryadke
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        ArrayList<Integer> inte = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
        {
            inte.add(i, Integer.parseInt(reader.readLine()));
        }

        for (int i = inte.size()-1; i >= 0; i--)
        {
            System.out.println(inte.get(i));
        }
    }
}