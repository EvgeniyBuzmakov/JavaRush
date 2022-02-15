package Level4Ciklu;

//Ввести с клавиатуры строку и число N больше 0.
//Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n = reader.readLine();
        String A = reader.readLine();
        int n1 = Integer.parseInt(n); //преобразовываем строку в число.

        if (n1>0) {

            //System.out.println(n1);
            int i = 1;
            while (n1 >= i) {
                System.out.println(A);
                i++;
            }
        }
        else
            System. exit(0);
    }
}