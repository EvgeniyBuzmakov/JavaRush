package Level7Massivu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Это конец
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/
public class EtoKonetc
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<String>();

        while (true)
        {
            String a = reader.readLine();
            String b = "end";
            if (a.equals(b))
            {break;}
            else
                str.add(a);
        }

        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }
    }
}




/*
if (name == null || name.isEmpty())
        {
        break;   reader.readLine() == null ||
        }
*/