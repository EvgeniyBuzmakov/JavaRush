package Level7Massivu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Массивный максимум
*/
public class MassivniyMaximum {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException
    {
        // создай и заполни массив
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

            else
            {}
        }
        return maximum;
    }
}
