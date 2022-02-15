package Level4Ciklu;
/*      Ввести с клавиатуры строку name.
        Ввести с клавиатуры дату рождения (три числа): y, m, d.

        Вывести на экран текст:
        "Меня зовут name.
        Я родился d.m.y"       */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KakNazvaliIDataRogdeniya {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String y = reader.readLine();
        String m = reader.readLine();
        String d = reader.readLine();
        int y1 = Integer.parseInt(y); //преобразовываем строку в число.
        int m1 = Integer.parseInt(m); //преобразовываем строку в число.
        int d1 = Integer.parseInt(d); //преобразовываем строку в число.

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d1 + "." + m1 + "." + y1);
    }
}