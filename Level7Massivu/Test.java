package Level7Massivu;

public class Test
{

    public static void main(String[] args)
    {

     /*   int[] s = {6,34,67,2,78,9,0,23,56,12,31,4,8,5};

        for (int i = 0; i < s.length; i++)
        {
            System.out.print(s[i] + "  ");
        }

        for (int j = 0; j < s.length; j++)
            for (int i = 1; i < s.length; i++)
            if (s[i] < s[i - 1])
            {
                int tmp = s[i];
                s[i] = s[i-1];
                s[i-1] = tmp;
            }
        else {

             }
        System.out.println();
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < s.length; i++)
        {
            System.out.print(s[i] + "  ");
        }

        System.out.println();
        System.out.println("-----------------------------------------------");

        String str = "aerstykstykstyk6styukstykstykstksdtukhae";

        System.out.println(str);
*/
        int[][] myTwoDimentionalArray = new int [3][4];  //{6,34,67,2,78,9,0,23,56,12,31,4,8,5,36,89};
        myTwoDimentionalArray[0][0] = 5;//записали значение 5 в ячейку на пересечении нулевой строки и нулевого столбца
        myTwoDimentionalArray[0][1] = 7; //записали значение 7 в ячейку на пересечении нулевой строки и первого столбца
        myTwoDimentionalArray[0][2]  = 3;
        myTwoDimentionalArray[0][3] = 17;
        myTwoDimentionalArray[1][0] = 7;
        myTwoDimentionalArray[1][1] = 0;
        myTwoDimentionalArray[1][2] = 1;
        myTwoDimentionalArray[1][3] = 12;
        myTwoDimentionalArray[2][0] = 8;
        myTwoDimentionalArray[2][1] = 1;
        myTwoDimentionalArray[2][2] = 2;
        myTwoDimentionalArray[2][3] = 3;
        System.out.println(myTwoDimentionalArray[1][3]);

        int count = 1;
        for (int i = 1; i <= 6; i++)
        {
            System.out.println();
            for (int j = 20; j >= count; j--)
            {
                System.out.print("/");
                count++;
            }
        }

    }

}
