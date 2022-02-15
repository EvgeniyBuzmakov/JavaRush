package Level7Massivu;

/*
Семейная перепись
*/

public class SemeynayaPerepis {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grand1 = new Human("Matvei", true,80,null,null);
        Human grand2 = new Human("Petrovich", true,100,null,null);
        Human grandma1 = new Human("Zinka",false,70, null, null);
        Human grandma2 = new Human("Petrovna",false,95, null, null);
        Human fath = new Human("Vladimir",true,50,grand1, grandma1);
        Human moth = new Human("Olga", false,30,grand2,grandma2);
        Human son1 = new Human("Sin Bogii",true,10, fath,moth);
        Human son2 = new Human("Vaska",true,10, fath,moth);
        Human son3 = new Human("Vanek",true,10, fath,moth);

        System.out.println( grand1.toString());
        System.out.println( grand2.toString());
        System.out.println( grandma1.toString());
        System.out.println( grandma2.toString());
        System.out.println( fath.toString());
        System.out.println( moth.toString());
        System.out.println( son1.toString());
        System.out.println( son2.toString());
        System.out.println( son3.toString());
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        public Human(String s, boolean b, int a, Human h1, Human h2) {
            name = s;
            sex = b;
            age = a;
            father = h1;
            mother = h2;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}

