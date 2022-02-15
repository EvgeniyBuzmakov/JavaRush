package Level6Obyekti;
/*
Блокнот для новых идей
*/

public class BloknotDlaNovihIdey
{


    public static void main(String[] args)
    {
        printIdea(new Idea());
    }
    //напишите тут ваш код
    public static class Idea
    {
        public static String getDescription()
        {
            return "earhewrtrjsrkhE";
        }

    }

    public static void printIdea(Idea idea)
    {
        System.out.println(Idea.getDescription());
    }
}
