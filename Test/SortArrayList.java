package Test;

import java.util.ArrayList;

public class SortArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i < 50; i++)
        {
            array.add(i, i);
            System.out.print(array.get(i) + " ");
        }
        int count = 0;
        int count1 = 0;

     //   do  { count = 0;
        for (int i = 0; i < array.size(); i++)
        {
            for (int j = 0; j < array.size()-1; j++)
            {
                if (array.get(j) < array.get(j+1))
                {
                    int tmp = array.get(j);
                    array.set(j, array.get(j+1));
                    array.set(j+1, tmp);
                    count++;
                    count1++;
                }
            }
        }
    //    } while (count > 0);


        System.out.println("---" + count1);

        for (int i = 0; i < array.size(); i++)
        {
            System.out.print(array.get(i) + " ");
        }
    }
}
