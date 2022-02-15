package Level7Massivu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Минимаксы в массивах
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/
public class MinimaksuVMassivah
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] array = getInts();
        maximum = max(array);
        minimum = min(array);


        System.out.print(maximum + " " + minimum);
    }

    //напишите тут ваш код

    public static int[] getInts() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int [20];
        for (int i = 0; i < 20; i++ )
        {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }
    public static int max(int[] array)
    {
        // найди максимальное значение
        int maximum = array[0];
        for (int i = 1; i < 20; i++ )
        {
            if (array[i] > maximum)
                maximum = array[i];

            else {}
        }
        return maximum;
    }
    public static int min(int[] array)
    {
        // найди минимальное значение
        int minimum = array[0];
        for (int i = 1; i < 20; i++ )
        {
            if (array[i] < minimum)
                minimum = array[i];

            else {}
        }
        return minimum;
    }
}