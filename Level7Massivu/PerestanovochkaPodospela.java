package Level7Massivu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.
*/

public class PerestanovochkaPodospela {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        ArrayList<String> str = new ArrayList<String>(n);
        for (int i = 0; i < n; i++) {
            str.add(i, reader.readLine());
        }

        for (int i = 0; i < m; i++) {
            String a = str.get(0);
            str.remove(0);
            str.add(a);
            //   str.set(str.size()-1, str.get(i));
        }
        for (String ss : str) {
            System.out.println(ss);

            //   for (int i = 0; i < str.size()-1; i++)
            //  {
            //       System.out.println(str.get(i));
            //   }
        }
    }
}