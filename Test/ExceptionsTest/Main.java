package Test.ExceptionsTest;

public class Main {

    public static void main(String[] args) {
        PerimeterSquare perimeterSquare = new PerimeterSquare();
        try {
            perimeterSquare.getPerimeter("s");
        } catch (PerimeterException e) {
            e.printStackTrace();
        }

    }
}
