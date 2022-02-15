package Level8Kollekcii;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Больше 10? Вы нам не подходите
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Класс Solution должен содержать только три метода.
•	Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
•	Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
*/

public class BolsheDesyatiVuNamPodhodite {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator n = set.iterator();
        while (n.hasNext())
        {
            int i = (int) n.next();
            if (i > 10)
                n.remove();
        }
        return set;
    }

    public static void main(String[] args) {
//
/*        Set<Integer> set = createSet();
        System.out.println(set);
        removeAllNumbersGreaterThan10(set);
        System.out.println(set);
        */
//
    }
}



