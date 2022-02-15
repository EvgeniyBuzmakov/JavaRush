package Level7Massivu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Улицы и дома
*/
public class UlitciIDoma
{
public static void main(String[] args) throws IOException
  {
    //напишите тут ваш код
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int[] array = new int [15];
      int chet = 0;
      int nechet = 0;

      for (int i = 0; i < array.length; i++)
      {
          array[i] = Integer.parseInt(reader.readLine());
          if (i % 2 == 0)
              chet = chet + array[i];
          else
              nechet = nechet + array[i];
      }

      if (chet > nechet)
          System.out.println("В домах с четными номерами проживает больше жителей.");
      else
          System.out.println("В домах с нечетными номерами проживает больше жителей.");
  }
}