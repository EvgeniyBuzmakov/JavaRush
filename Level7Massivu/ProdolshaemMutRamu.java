package Level7Massivu;
import java.util.ArrayList;

/*
Продолжаем мыть раму
1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.
*/
public class ProdolshaemMutRamu
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<String>();

        str.add("мама");
        str.add("мыла");
        str.add("раму");

        str.add(1, "именно");
        str.add(3, "именно");
        str.add(5, "именно");

        for (int i = 0; i < str.size(); i++)
        {
            System.out.println(str.get(i));
        }
    }
}
