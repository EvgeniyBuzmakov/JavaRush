package Level9Isklucheniya;

/*
Исключение при работе с массивами
*/

public class IsklucheniyaPriRaboteSMassivami {
    public static void main(String[] args) {
        //напишите тут ваш код
try{
    int[] m = new int[2];
    m[8] = 5;
}
//напишите тут ваш код
      catch(ArrayIndexOutOfBoundsException e)   {
          System.out.println(e);
      }


    }
}