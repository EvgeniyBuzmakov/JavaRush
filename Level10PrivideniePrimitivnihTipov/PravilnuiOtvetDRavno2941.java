package Level10PrivideniePrimitivnihTipov;

/*
Правильный ответ: d = 2.941
Добавь в метод main() одну операцию по преобразованию типа, чтобы получился ответ: d = 2.941.

Пример вывода:
2.9411764705882355
*/

public class PravilnuiOtvetDRavno2941 {
    public static void main(String[] args) {
        int a = 50;
        int b = 17;
        double d = (float)a / b;
        System.out.println(d);
    }
}

