package Test;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SetTest
{
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<String>();
        set.add("Mama");
        set.add("Mila");
        set.add("Ramu");

        //получение итератора для множества
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий

            System.out.println(iterator.hasNext());

            String text = iterator.next();

            System.out.println(text);
        }
    }
}