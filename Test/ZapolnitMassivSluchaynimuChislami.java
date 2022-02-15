package Test;

import java.util.Random;
import java.util.Scanner;
//Заполнили массив случайными числами и отсортировали его

public class ZapolnitMassivSluchaynimuChislami {

    public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
