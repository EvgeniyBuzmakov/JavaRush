package Level5Classi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class MaximumIzNChisel {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = -2147483648;

        //напишите тут ваш код
        if (n <= 0)
           System.exit(0);

        else {

        for (int n1 = n; n1 > 0; n1--) {
            int m = Integer.parseInt(reader.readLine());
            if (m > maximum) {
                maximum = m;
            }
            else {
            }

          }
        }

        System.out.println(maximum);
    }
}
       /* int number = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        if(number > 0 && number != 0) {
            for(int i = 0; i < number; i++) {
                list.add(Integer.parseInt(reader.readLine()));
            }
        }
        int max = list.get(0);
        for(Integer i : list) {
            if (i > max) {
                max = i;
            }
        }
        if(max > 0) {
            System.out.println(max);
        }


    }
}*/