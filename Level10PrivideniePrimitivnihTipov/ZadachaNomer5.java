package Level10PrivideniePrimitivnihTipov;

/*
Задача №5 на преобразование целых типов
*/

public class ZadachaNomer5 {
    public static void main(String[] args) {
        int a = (short) 44;
        int b = (short) 300;
        short c = (short) (b - a);
        System.out.println(c);
    }
}

/*
    int a = (byte)44;
    int b = 300;
    short c = (short)(b - a);
        System.out.println(c);

*/