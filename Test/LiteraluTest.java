package Test;

public class LiteraluTest {
    public static void main(String[] args) {
        double a = 2.718281828459045;
        double d = 4.05E-13;
        System.out.println("Тип double в классическом виде: " + a);
        System.out.println("Тип double в научном виде: " + d);
                System.out.println("-------------------------------------------");
        int smile = 0x1F600; // Здесь шестнадцатеричный код эмоджи
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toChars(smile)); // Собираем в StringBuilder
        System.out.println("Улыбающееся лицо: " + sb.toString()); // Выводим
    }
}
