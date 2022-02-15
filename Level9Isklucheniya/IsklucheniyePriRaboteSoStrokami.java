package Level9Isklucheniya;

/*
Исключение при работе со строками
*/

public class IsklucheniyePriRaboteSoStrokami {
    public static void main(String[] args) {
        //напишите тут ваш код
try {
    String s = null;
    String m = s.toLowerCase();
}
//напишите тут ваш код
catch (NullPointerException e) {
    System.out.println(e);
}
    }
}