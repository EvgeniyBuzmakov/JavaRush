package Test.BoxAndBall;

class Ball {
    double radius;
    String color;
}

class Box {
    double heigt;
    Ball ba;
}

public class MainApp {

    public static void main(String[] args) {

        Box box1 = new Box();
        box1.heigt = 5;
        box1.ba = new Ball();

        System.out.println(box1.heigt);
        System.out.println(box1.ba.radius);
    }
}
