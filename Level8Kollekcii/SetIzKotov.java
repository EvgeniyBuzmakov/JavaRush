package Level8Kollekcii;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
Set из котов
*/
public class SetIzKotov {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        Iterator<Cat> iterator = cats.iterator();
        cats.remove(iterator.next());

 /*       Iterator<Cat> iter = cats.iterator();
        iter.next();
        iter.remove();
*/
 //      cats.remove(cats.toArray()[0]);     //такое удаление тоже работает!!

 /*       while (cats.iterator().hasNext()){
            cats.remove(cats.iterator().next());
            break;
        }
 */
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> cats = new HashSet<Cat>();
        Cat a = new Cat();
        Cat b = new Cat();
        Cat c = new Cat();
        cats.add(a);
        cats.add(b);
        cats.add(c);
 /*       for (Cat cat : cats) {
           System.out.println(cat);
        }
*/
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
/*        Iterator<Cat> iterator = cats.iterator();

        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            Cat text = iterator.next();
            System.out.println(text);
        }
*/
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
    // step 1 - пункт 1
    public static class Cat {
    }
}