package Level4Ciklu;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//Ввести с клавиатуры имя и используя цикл for 10 раз вывести: <имя> любит меня.

public class VivestiImya10Raz {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String m = reader.readLine();

        for (int i = 9; i >= 0; i--)
        {
            System.out.println(m + " любит меня.");
        }
    }
}
