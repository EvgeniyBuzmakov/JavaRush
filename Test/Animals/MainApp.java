package Test.Animals;

public class MainApp {

    public static void main(String[] args) {
        Cat mikki = new Cat();
        mikki.voice();
        mikki.setId(12);

        Dog dog1 = new Dog();
        dog1.voice();
        dog1.setName("Dog1");


        Animals animal1 = new Dog();
        Animals animal2 = new Cat();
        animal1.voice();
        animal2.voice();

        System.out.println("--------------------------------------------------");
        info(dog1);
        info(mikki);
    }

    public static void info(Info info) {
        info.showInfo();
    }
}
