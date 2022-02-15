package Level5Classi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Среднее арифметическое
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
*/
public class SredneeArifmeticheskoe {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        double sum = 0;
        int count = 0;
        while (true) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n = reader.readLine();
        int n1 = Integer.parseInt(n); //преобразовываем строку в число.


        if (n1 == -1) {
            break;
        } else {
            sum = sum + n1;
            count++;
        }

        }
        System.out.println(sum/count);
    }
}
