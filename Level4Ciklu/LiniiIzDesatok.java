package Level4Ciklu;
//Используя цикл for вывести на экран:
//        - горизонтальную линию из 10 восьмёрок
 //       - вертикальную линию из 10 восьмёрок (символ из горизонтальной строки не учитывается).
public class LiniiIzDesatok {
    public static void main(String[] args) {
        for (int j = 8; j >= 0; j--)
        {
            System.out.print("8");
        }

        for (int i = 10; i >= 0; i--)
        {

            System.out.println("8");
        }
    }
}
