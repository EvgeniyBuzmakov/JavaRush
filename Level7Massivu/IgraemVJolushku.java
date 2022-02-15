package Level7Massivu;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Играем в Jолушку
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/
public class IgraemVJolushku
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        ArrayList<Integer> listDevOn3 = new ArrayList<Integer>();
        ArrayList<Integer> listDevOn2 = new ArrayList<Integer>();
        ArrayList<Integer> listOthers = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++)
        {
            int x = Integer.parseInt(reader.readLine());
            listOfNumbers.add(x);
            if (x % 3 == 0)
            {
                if (x % 2 == 0)
                {
                    listDevOn2.add(x);
                }
                listDevOn3.add(x);
            }
            else if (x % 2 == 0) {listDevOn2.add(x);}

             else listOthers.add(x);
        }
        printList(listOfNumbers);
        printList(listDevOn3);
        printList(listDevOn2);
        printList(listOthers);

    }

        public static void printList(ArrayList<Integer> list)
        {
            //напишите тут ваш код
            for (int i = 0; i < list.size(); i++)
            {
                System.out.println(list.get(i));
            }
        }
}

/*
        for (int i = 0; i < 6; i++)
        {
            String n = reader.readLine();
            intMain.add(i, Integer.parseInt(n));
        }

        for (int i = 0; i < intMain.size()-1; i++)
        {
            if (intMain.get(i)%3 == 0)
            {   intNa3.add(i, intMain.get(i));}
            else if (intMain.get(i)%2 == 0)
            {    intNa2.add(i, intMain.get(i));}
            else
            {   intOst.add(i, intMain.get(i));}
        }

        printList(intMain);
        printList(intNa3);
        printList(intNa2);
        printList(intOst);
    }

    public static void printList(ArrayList<Integer> list)
    {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
*/
