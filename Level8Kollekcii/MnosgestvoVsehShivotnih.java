package Level8Kollekcii;
import java.util.HashSet;
import java.util.Set;
/*
Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без параметров.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
Каждое животное с новой строки.
*/
public class MnosgestvoVsehShivotnih {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
 //       System.out.println("---------------------------------------------------");
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        Cat a = new Cat();
        Cat b = new Cat();
        Cat c = new Cat();
        Cat d = new Cat();
        result.add(a);
        result.add(b);
        result.add(c);
        result.add(d);
        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> dogs = new HashSet<Dog>();
        Dog a = new Dog();
        Dog b = new Dog();
        Dog c = new Dog();
        dogs.add(a);
        dogs.add(b);
        dogs.add(c);
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> pets = new HashSet<>(cats);
        pets.addAll(dogs);

/*        for (Object x: pets) {
            System.out.println(x);
        }
*/
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        for(Cat cat : cats){
            pets.remove(cat);
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object x: pets) {
            System.out.println(x);
        }
    }

    //напишите тут ваш код
    public static class Cat {}
    public static class Dog {}
}