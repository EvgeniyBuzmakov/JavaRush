package Level8Kollekcii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).

Требования:
•	Программа должна выводить текст на экран.
•	Класс Human должен содержать четыре поля.
•	Класс Human должен содержать один метод.
•	Класс Solution должен содержать один метод.
•	Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
*/
public class SobiraemSemeistvo {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> family = new ArrayList<Human>();
        ArrayList<Human> kids = new ArrayList<Human>();
        ArrayList<Human> parents = new ArrayList<Human>();


        kids.add(new Human("kid1", true, 3, new ArrayList<Human>()));
        kids.add(new Human("kid2", true, 4, new ArrayList<Human>()));
        kids.add(new Human("kid3", true, 5, new ArrayList<Human>()));

        parents.add(new Human("Father", true, 25, kids));
        parents.add(new Human("Mother", false, 25, kids));

        family.add(new Human("дедушка1", true, 50, parents));
        family.add(new Human("дедушка2", true, 50, parents));
        family.add(new Human("бабушка1", false, 50, parents));
        family.add(new Human("бабушка2", false, 50, parents));

        family.addAll(parents);
        family.addAll(kids);

        for (Human item : family)
            System.out.println(item);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human (String name, Boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex ? true : false;
            this.age = age;
            this.children = children;
        }
//написал свой код до этой строчки
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}