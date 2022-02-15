package Level5Classi;

public class ManAndWoman {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man andrey = new Man("Andrey", 45, "Sovetskaya 117");
        Man tom = new Man("Tom", 34, "Lenina 117");

        Woman mana = new Woman("Mana", 23, "Sovetskaya 45");
        Woman tana = new Woman("Tana", 56, "Sovetskaya 78");

        //System.out.println(andrey.name + " " + andrey.age + " " + andrey.address);
        //System.out.println(tom.name + " " + tom.age + " " + tom.address);
        System.out.println(andrey.toString());
        System.out.println(tom.toString());

        System.out.println(mana.name + " " + mana.age + " " + mana.address);
        System.out.println(tana.name + " " + tana.age + " " + tana.address);
    }

    //напишите тут ваш код

    public static class Man {
        String name;
        int age;
        String address;

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }

        public Man (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman {
        String name;
        int age;
        String address;

        public Woman (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

}
