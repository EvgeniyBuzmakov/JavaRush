package Level6Obyekti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Исправляем ошибки юности
*/
public class IspravOshibkiYunostiDvaChislaSKlaviaturi {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String max = "The max is ";
         int a = Integer.parseInt(reader.readLine());
         int b = Integer.parseInt(reader.readLine());
        IspravOshibkiYunostiDvaChislaSKlaviaturi.max = a > b ? a : b;

        System.out.println(max + IspravOshibkiYunostiDvaChislaSKlaviaturi.max);
    }

}
