package Level8Kollekcii;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна считывать строку с клавиатуры.
•	Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/
public class OmovenieRamu {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        String s2 = "";
        s2 = s2 + string.substring(0, 1).toUpperCase(); //первый символ делаем заглавным
        for (int i = 1; i < string.length(); i++) {
            // смотрим, был ли слева пробел:
            if (" ".equals(string.substring(i-1, i)))
                s2 = s2 + string.substring(i, i+1).toUpperCase();
            else
                s2 = s2 + string.substring(i, i+1);
        }
        System.out.println(s2);
    }
}