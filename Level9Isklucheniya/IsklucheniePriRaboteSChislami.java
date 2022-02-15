package Level9Isklucheniya;

/*
Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
*/

public class IsklucheniePriRaboteSChislami {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            int a = 42 / 0;
        }
        //напишите тут ваш код
        catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}