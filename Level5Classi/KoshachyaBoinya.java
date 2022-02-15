package Level5Classi;

public class KoshachyaBoinya {
        public static void main(String[] args) {
    //напишите тут ваш код
            Cat vaska = new Cat("Vaska", 4, 3, 6);
            Cat barsik = new Cat("Barsik", 6,4,5);
            Cat murzik = new Cat("Murzik", 2,3,5);

            System.out.println(vaska.fight(barsik));
            System.out.println(vaska.fight(murzik));
            System.out.println(barsik.fight(murzik));
}

public static class Cat {

    protected String name;
    protected int age;
    protected int weight;
    protected int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        int ageScore = Integer.compare(this.age, anotherCat.age);
        int weightScore = Integer.compare(this.weight, anotherCat.weight);
        int strengthScore = Integer.compare(this.strength, anotherCat.strength);

        int score = ageScore + weightScore + strengthScore;
        return score > 0; // return score > 0 ? true : false;
    }
}
}