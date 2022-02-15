package Test;

import java.util.Arrays;
import java.util.Random;

public class MnogomerniyMassiv {
    public static void main(String[] args) {
        int[][] matrix = new int[4][3];
        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(50);
            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);;
            }

        }
        System.out.println("--------------------------");
        System.out.println(Arrays.toString(matrix));
    }
}
