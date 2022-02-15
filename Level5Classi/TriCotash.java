package Level5Classi;

public class TriCotash {

        public static void main(String[] args) {
            //напишите тут ваш код
            Cat vaska = new Cat("Vaska", 4, 3, 6);
            Cat barsik = new Cat("Barsik", 6,4,5);
            Cat murzik = new Cat("Murzik", 2,3,5);
        }

        public static class Cat {
            private String name;
            private int age;
            private int weight;
            private int strength;

            public Cat(String name, int age, int weight, int strength) {
                this.name = name;
                this.age = age;
                this.weight = weight;
                this.strength = strength;
            }
        }
    }

