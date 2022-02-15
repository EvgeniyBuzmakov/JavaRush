package Level7Massivu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Проверка на упорядоченность
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
*/
public class ProverkaNaUporyadochennost {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            str.add(i, reader.readLine());
        }
        for (int i = 1; i < str.size(); i++)
        {
            if (str.get(i-1).length() > str.get(i).length())
            {
                System.out.println(i);
                break;
            }
        }
    }
}
