package Level4Ciklu;
//Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
public class TreugolnikIzVosmerok {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j <= i) {
                    System.out.print("8");
                }
            }
            System.out.println();
        }
    }
}