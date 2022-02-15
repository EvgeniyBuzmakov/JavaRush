package Test.SpeedTest;

import java.util.Arrays;

public class TestSkorostMassivov {

    public static void main(String[] args) {
        int[] arr = new int[150000];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = arr.length - i;
        }

      //  System.out.println(Arrays.toString(arr));

        speed(arr);
        speed1(arr);
    }

    public static void speed(int[] arr) {

        long start = System.currentTimeMillis();

        for (int i = arr.length - 1; i >= 1 ; i--) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        long end = System.currentTimeMillis();

      //  System.out.println(Arrays.toString(arr));
        System.out.println(end - start);
    }

    public static void speed1(int[] arr) {

        long start = System.currentTimeMillis();

        Arrays.sort(arr);

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

}
