package Test;

import java.util.Scanner;

public class ProgrammaDeleniyaDvuhChisel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            if (b == 0) {
                System.out.println("X");
                break;
            }
            System.out.println(a / b);
        }
    }
}