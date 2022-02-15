package Level7Massivu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vvod10ChiselSKlaviaturi
    {
        public static void main(String[] args) throws IOException
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int[] list = new int[5];

            for (int i = 0; i < list.length; i++)
            {
                String s = reader.readLine();
                list[i] = Integer.parseInt(s);
            }
            for (int i = 0; i < list.length; i++)
            {
                System.out.print(list[i] + " ");
            }
        }
    }
