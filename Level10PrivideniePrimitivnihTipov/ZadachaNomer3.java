package Level10PrivideniePrimitivnihTipov;
/*
Задача №3 на преобразование целых типов
Добавь одну операцию по преобразованию типа, чтобы получился ответ: b = 0.
float f = (float)128.50;
int i = (int)f;
int b = (int)(i + f);
*/

public class ZadachaNomer3 {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (byte) (i + f);
        System.out.println(b);
    }
}

