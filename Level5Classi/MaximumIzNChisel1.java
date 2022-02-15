package Level5Classi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaximumIzNChisel1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        // ваш код

        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            int a = Integer.parseInt(reader.readLine());
            if (n != 1) {
                for (; n > 1; n--) {
                    int b = Integer.parseInt(reader.readLine());
                    maximum = Math.max(a, b);
                    a = Math.max(a, b);
                }
            } else {
                maximum = a;
            }
            System.out.println(maximum);
        }
    }
}

/* int maximum = Integer.parseInt(reader.readLine());
        int max = Integer.MIN_VALUE;
          for (int i = 0; i < maximum; i++) {
              int u = Integer.parseInt(reader.readLine());
              if (u > max) {
                  max = u;
              }
          }
        System.out.println(max);
    }
}
*/