package Level6Obyekti;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Числа по возрастанию
*/
public class ChislaPoVozrastaniyu {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int[] numbers = new int[5];
        for (int i=0; i<5; i++)
            numbers[i] =  Integer.parseInt(reader.readLine());

        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
           /*Сравниваем элементы попарно,
             если они имеют неправильный порядок,
             то меняем местами*/
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        for (int i=0; i<5; i++)
        System.out.println(numbers[i]);
    }
}