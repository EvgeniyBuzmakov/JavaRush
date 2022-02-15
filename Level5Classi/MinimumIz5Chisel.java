package Level5Classi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinimumIz5Chisel {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


     public static int min(int a, int b, int c, int d, int e) {
        /*int mini = a;
        if (b < c)
            mini = b;

        else if (c < b)
            mini = c;

        else if (d < c)
            mini = d;

        else if (e < d)
            mini = e;

            return mini;*/
         return Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
        }
     }


