package Level7Massivu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Переверни массив
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
*/
public class PereverniMassiv {
    public static void main(String[] args) throws Exception {

        int[] intArray = new int [10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++ ) {
            intArray[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(intArray[i]);
        }
    }
}
