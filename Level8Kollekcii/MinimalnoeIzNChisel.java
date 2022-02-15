package Level8Kollekcii;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/* 
Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна считывать значения с клавиатуры.
•	Класс Solution должен содержать только три метода.
•	Метод getIntegerList() должен считать с клавиатуры число N, потом вернуть список размером N элементов, заполненный числами с клавиатуры.
•	Метод getMinimum() должен вернуть минимальное число среди элементов списка.
•	Метод main() должен вызывать метод getIntegerList().
•	Метод main() должен вызывать метод getMinimum().
*/
public class MinimalnoeIzNChisel {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        int minimum = array.get(0);

        for (int i = 0; i < array.size(); i++) {
            if (minimum > array.get(i))
                minimum = array.get(i);
        }

        return minimum;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        ArrayList<Integer> arr = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++)
        arr.add(Integer.parseInt(reader.readLine()));
/*
        for (Integer i : arr) {
            System.out.println(i);
        }
*/
        return arr;
    }
}