package Level4Ciklu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Ввести с клавиатуры два числа m и n.
        //Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

public class PramougolnikIzVosmerok {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String m = reader.readLine();
        String n = reader.readLine();
        int m1 = Integer.parseInt(m); //преобразовываем строку в число.
        int n1 = Integer.parseInt(n); //преобразовываем строку в число.

        for (int i = m1; i >= 0; i--)
        {
            for (int j = n1; j >= 0; j--)
            {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}