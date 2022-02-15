package Level7Massivu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Один большой массив и два маленьких
*/
public class OdinBolshoiMassivIDvaMalenkih {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[20];
        int[] num1 = new int[10];
        int[] num2 = new int[10];

        for (int i = 0; i < num.length; i++) {
            if (i < 10) num1[i] = Integer.parseInt(reader.readLine());
            else
                num2[i - 10] = Integer.parseInt(reader.readLine());
        }
                for (int a = 0; a < 10; a++)
                System.out.println(num2[a]);
     /*   for (int i = 0; i < 9; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
            array1[i] = array[i];
        }

        for (int i = 10; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
            array2[i] = array[i];
        }
        for (int i = 0; i < 10; i++)
            System.out.println(array2[i]);   */

        }
    }
