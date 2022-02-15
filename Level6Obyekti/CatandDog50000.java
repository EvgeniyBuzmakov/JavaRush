package Level6Obyekti;

public class CatandDog50000 {
    public static void main(String[] args) {
        // напишите тут ваш код
        for (int i = 50000; i > 0; i--) {
            Cat cat = new Cat();
            Dog dog = new Dog();
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}

