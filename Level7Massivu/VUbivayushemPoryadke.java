package Level7Massivu;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
В убывающем порядке
Задача: Написать программу, которая
вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/
public class VUbivayushemPoryadke
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 1; j < array.length-i; j++)
            {
                if (array[j-1] < array[j])
                {
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}