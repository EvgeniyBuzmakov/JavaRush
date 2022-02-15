package Level10PrivideniePrimitivnihTipov;

/*
Задача №2 на преобразование целых типов
Правильно расставь операторы приведения типа, чтобы получился ответ: d=3.765.
int a = 15;
int b = 4;
float c = a / b;
double d = a * 1e-3 + c;
*/

public class ZadachaNomer2 {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        //   float c = a / b;
        float c = (float) a / b;
        double d = a * 1e-3 + c;

        System.out.println(d);
    }
}

