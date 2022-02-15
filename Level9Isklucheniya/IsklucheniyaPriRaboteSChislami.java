package Level9Isklucheniya;
/*
Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
*/
public class IsklucheniyaPriRaboteSChislami {
    public static void main(String[] args) {
        //напишите тут ваш код
try{
    int num = Integer.parseInt("XYZ");
    System.out.println(num);
}
//напишите тут ваш код
        catch(NumberFormatException e) {
            System.out.println(e);
        }


    }
}